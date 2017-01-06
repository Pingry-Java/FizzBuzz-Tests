Fizz Buzz Tests
===============
:100::pray::100::pray:


This project is a set of open source tests for the closed source FizzBuzz class.

Details of FizzBuzz Class
-------------------------
The class represents the popular childrens' game in which a child counts outloud, but replaces any multiples of 3 with the word "fizz", multiples of 5 with the word "buzz", and multiples of both 3 and 5 with the word "fizzbuzz".

For example: `1 2 fizz 4 buzz fizz 7 8 fizz ...`

The only valid things that the child would say are "fizz", "buzz", "fizzbuzz", or the original number. No other words are valid in the game.

### `generate()` method
This method returns an `ArrayList<String>` containing the results of counting from 1 to 100.

### `generate(int min, int max)` method
This method returns an `ArrayList<String>` containing the results of counting from the given minimum to the given maximum, both inclusive.

### Main Method
For convenience, a main method is included which will call the default `generate()` method.

Known Bugs
----------
The list of all bugs that these tests have found in the FizzBuzz class follows.
* Won't work if the parameters are the same number
* Negative numbers won't work, but at least fizzbuzzing works though
* The second parameter isn't inclusive
* Zero doesn't work as the minimum
* The generate() method doesn't go to 100 it goes to 99
* 




Licensing Info
--------------
These tests are licensed under the unlicense. You may do absolutely anything with them. The FizzBuzz class itself is Closed source, but free to use. Its bytecode is included in this project for convenience.

The FizzBuzz class may be open sourced at a later date.
