Project Name: usuario
Description: The project is a simple REST API layer using Spring and Java with H2 In Memory

Installation
Let's copy this link to clone the project
https://github.com/LeoCR07/usuario.git

In intellij idea:
File < new < Project from version control
Here we will paste the url

Before starting, you must download a JSON file that contains all the requests needed in postman

This is link
https://github.com/LeoCR07/usuario/blob/master/User.postman_collection
We can download it with ctrl + shif + s
We must import this file to be downloaded in postman
It is very easy we just have to drag and drop it in postman...

Use
These are the requirements that will be covered

1. Add Person (id, firstName, lastName)
   run Save Person
  we will execute this about three times ¿why? mmm we need datos 

2. Edit Person (firstName, lastName)
  run Update Person 

3.DeletePerson
  execute Delete Person

4.Add Address to person [multiple required] (id, street, city, state,
postalCode)

run Save Address
run about 3 times

Unfortunately, this method could not relate the address to the person. :( nooooo.

5. Edit Address (street, city, state, postalCode)
run Update Address

6. Delete Address (id)
run Delete Address

7. Count Number of Persons
run Count Person

8. List Persons
Run Find Person

That's all, I had a lot of fun doing it, I'm still trying to figure out how to solve the problem, I think it's something simple.
