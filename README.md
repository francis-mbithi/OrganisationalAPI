# Wildlife-Tracker
#### By:
Francis Mbithi
#### App Description
An application that allows Rangers to track wildlife sightings in an area.

#### Technologies and frameworks used
1. java 11
2. spark core 2.12
3. Gradle 4.10
4. Spark Template Velocity
5. Junit 5
6. Postgres database

#### Database setup.
In PSQL:

* CREATE DATABASE wildlife_tracker;
* CREATE TABLE animals(id SERIAL PRIMARY KEY,name varchar, endangered boolean, age varchar);
* CREATE TABLE sightings(id SERIAL PRIMARY KEY, rangername varchar , location varchar, spotted timestamp, animalid int);

#### Testing
Use junit testing framework with the command below:
* gradle test
#### App setup Instructions
Follow the following instructions to run the application:
* clone this repo https://github.com/francis-mbithi/Wildlife-Tracker.git
* cd into the cloned directory
* Open with preferred java text editor incase you are interested in making some modifications
* Run the application using gradle

# live link
https://francis-wildlife.herokuapp.com/

# MIT LICENSE
Copyright (c) 2019 Francis_mbithi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


