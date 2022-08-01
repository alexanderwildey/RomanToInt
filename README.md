# RomanToInt
Takes a user inputted number in Roman numerals and translates it into an integer.

This program is my solution to the LeetCode Roman to Interget problem.

Roman numerals use the symbols M, D, C, L, X, V, and I. The table below shows their corresponding integer value.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Roman numerals are written from left to right, with higher value numerals placed before lower value numerals except in certain circumstances.
Additionally, each numeral cannot be written more than 3 times in a row. Ex: XXX (30) is valid, but XXXX (40) is not. 40 would be written as XL. 
The additional rules for when a lower value Roman numeral is placed before a higher value numeral as shown below. The lower value numeral decreases the 
higher value numeral by the value of the lower value numeral.

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
