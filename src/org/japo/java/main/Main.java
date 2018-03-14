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
package org.japo.java.main;

import org.japo.java.app.App;

/**
 *
 * @author Victor Hugo Polo Polo - victorpolodev@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        // Instanciar APP
        App app = new App();

        // Lanzar APP
        app.launchApp();
    }
}
