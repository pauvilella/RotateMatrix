# RotateMatrix
Exercise related with Arrays and Strings.

## Exercise Challenge
Given an image represented by an NxN matrix, where each pixel in the image is represented by an integer, write a method to rotate the image by 90 degrees. Can you do this in place?

### Solution
I implement the rotation in layers, from outside inwards. 
I take every element, and I rotate it, so I touch the four elements implicated in this rotation. 
There are some details such as I only go until the middle of the matrix or how I do to go to the next layer, etc. (See the code). 
This algorithm take O(N^2), and it's the BCR because we must touch every element in the matrix.
