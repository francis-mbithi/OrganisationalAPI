# ogApi
#### By:
Francis Mbithi
#### App Description
An application for creating an organisational API outlining the news departments and users
#### Technologies and frameworks used
* java 11
* spark 
* Postgres database
* Postman
## Endpoint 
| Method      | Endpoint     | Description  |
| ------------- |:-------------:| -----:|
| Post     | /api/users/new| Create new user|
| Get     | /api/users   |   Retrieve all users in the organisation  |


### Create a new user
```
{
id: 1,
username: "vrk",
address: "03",
phone: 107567673,
email: "f@gmail.com",
departmentid: 02,
position: "manager",
roles: "IT"
}
```
#### Database setup.
In PSQL:
in psql:
* CREATE DATABASE org_api_test;
* CREATE TABLE IF NOT EXISTS news(id SERIAL PRIMARY KEY, news VARCHAR, departmentId int);
* CREATE TABLE IF NOT EXISTS departments(id SERIAL PRIMARY KEY,departmentid int,departmentname VARCHAR);

#### Testing
Use junit testing framework with the command below:
* gradle test
#### App setup Instructions
Follow the following instructions to run the application:
* clone this repo https://github.com/francis-mbithi/OrganisationalAPI.git
* cd into the cloned directory
* Open with preferred java text editor incase you are interested in making some modifications
* Run the application using gradle

# live link
https://francis-newsapp.herokuapp.com/users

# MIT LICENSE
Copyright (c) 2019 Francis_mbithi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
