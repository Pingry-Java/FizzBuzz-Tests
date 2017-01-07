Fizz Buzz Tests
===============

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
 1) The max value of the generate method is not inclusive.
 2) When given two identical values, the generate method always returns an arrayList with the value 1. 
 3) Numbers below zero will return the string negative in place of the number (other than fizz buzz and fizzbuzz numbers).
 4) Zero does not work as a minimum bound (ie if you put in generate(0,3) it returns [1,2])


Licensing Info
--------------
These tests are licensed under the unlicense. You may do absolutely anything with them. The FizzBuzz class itself is Closed source, but free to use. Its bytecode is included in this project for convenience.

The FizzBuzz class may be open sourced at a later date.
