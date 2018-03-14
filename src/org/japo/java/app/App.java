/*
 * Copyright 2017 Victor Hugo Polo Polo - victorpolodev@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesEntrada;
import org.japo.java.libraries.UtilesValidacion;

/**
 *
 * @author Victor Hugo Polo Polo - victorpolodev@gmail.com
 */
public class App {
    
        //    mensajes usuario
    public static final String MSG_USER_SET = "Longitud Errónea (8-12)";
    public static final String MSG_USER = "Usuario Correcto";   

//    expresiones regulares usuario
    public static final String ER_USER_SET = "[xyzXYZ\\d]\\d{7}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]?";

    //    mensajes clave acceso
    public static final String MSG_CA_SET = "Debe contener 4 digitos (0-9)";
    public static final String MSG_CA = "Clave Correcta";

    //    expresion regular clave acceso
    public static final String ER_CA_LON = "\\d{4}";

    public void launchApp() {
        System.out.println("BS Online");
        System.out.println("Acceso a sus cuentas");
        System.out.println("");

//        Validacion Usuario
        System.out.println("Usuario( DNI ): ");
        String user = UtilesEntrada.SCN.nextLine();
        boolean testUserLon = UtilesValidacion.validarDato(user, ER_USER_SET);

        if (!testUserLon) {
            System.out.printf("Análisis ...: %s. %n", MSG_USER_SET);
        } else {
            System.out.printf("Análisis ...: %s. %n", MSG_USER);
        }

//        Validacion clave acceso
        System.out.println("Clave de acceso:");
        String pass = UtilesEntrada.SCN.nextLine();
        boolean testCALon = UtilesValidacion.validarDato(pass, ER_CA_LON);

        if (!testCALon) {
            System.out.printf("Análisis ...: %s. %n", MSG_CA_SET);
        } else {
            System.out.printf("Análisis ...: %s. %n", MSG_CA);
        }

    }
}
