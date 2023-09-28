## Java-Assignment-1
## Matriculation number: 7213389
## Enviroment: Visual Studio code

## MathCalc:
1. double circleArea = 100.0;
double radius = Math.sqrt(circleArea / Math.PI);

Here, Calculates the Radius of a Circle

2. int feet = (int) Math.floor(radius);
int inches = (int) Math.round(12.0 * (radius - feet));

Here, convert Radius into Feet and Inches

3. System.out.println("The radius of a circle with area " + circleArea + " square feet is " + feet + " feet " + inches + " inches");

It is the output of Radius Information

4. double earthDiameter = 7600.0;
double sunDiameter = 865000.0;

Initialize earth and sun diameter. 

5. double earthRadius = earthDiameter / 2.0;
double sunRadius = sunDiameter / 2.0;

Calculate the radious of earth and sun.

6. double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

Then calculates the volume.

7. double volumeRatio = sunVolume / earthVolume;

then calculates the ration between them. 

8. System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);

then print the volume information. 


## Primes:
1. int nValues = 50;: Initializes a variable nValues to 50, which determines the range of numbers to check for prime status.

2. outerLoop:: Defines a label for the outer loop, allowing to break or continue both the inner and outer loops when needed.

3. Outer Loop (for (int i = 2; i <= nValues; i++)):

Iterates through numbers from 2 to nValues.

4. Inner Loop (for (int j = 2; j * j <= i; j++)):

Checks divisibility of i by j for all j starting from 2 up to the square root of i.

If i is divisible by j and j is not equal to i, it means i is not a prime number. In this case, it continues to the next iteration of the outer loop using continue outerLoop;.

If no divisors are found for i in the inner loop, it means that i is a prime number. 

It prints the prime number using System.out.println(i);.



## Sorting:
1. Initialize the Soliloquy String:

String soliloquy = "To be or not to be, that is the question; ...";
Initializes a String variable soliloquy with a famous soliloquy from Shakespeare's Hamlet.

2. Split the Soliloquy into Words:

String[] words = soliloquy.split("[\\s,;.]+");`
Splits the soliloquy into an array of words based on whitespace, commas, semicolons, periods, and backticks using regular expressions.

3. Sort the Words Using Bubble Sort:

bubbleSort(words);

Calls the bubbleSort method to sort the array of words alphabetically.

4. Bubble Sort Algorithm:

private static void bubbleSort(String[] array) { ... }

Defines a method to perform the bubble sort algorithm on an array of words.

int n = array.length; - Get the length of the array.

boolean swapped; - Initialize a boolean flag to track if any swaps were made during a pass.

do { ... } while (swapped); - Repeat the following loop until no swaps are made in a pass.

for (int i = 0; i < n - 1; i++) { ... } - Iterate through the array comparing adjacent words.

if (array[i].compareTo(array[i + 1]) > 0) { ... } - Compare two adjacent words and swap them if they are out of order.

5. Display Sorted Words:

for (String word : words) { ... }

Iterate through the sorted words array and print each word on a new line.


##  Sorting Characters:
1. Initialize the Text String:

String text = "To be or not to be, that is the question; ...";

Initializes a String variable text with a text containing words, punctuation, and spaces.

2. Initialize Counters:

int spaces = 0, vowels = 0, consonants = 0;

Initializes three integer variables to keep track of spaces, vowels, and consonants.

3. Loop through Each Character in the Text:

for (char c : text.toCharArray()) { ... }

Iterates through each character in the text string by converting it to a character array.

4. Convert Character to Lowercase:

char lowerCaseChar = Character.toLowerCase(c);

Converts the current character to lowercase for case-insensitive vowel checks.

5.Character Type Checking:

Inside the loop, the program checks the type of each character:

If the character is a letter (using Character.isLetter(c)), it proceeds to determine whether it's a vowel or a consonant.

If the character is whitespace (using Character.isWhitespace(c)), it increments the spaces counter.

6. Vowel and Consonant Detection:

private static boolean isVowel(char c) { ... }

Defines a method to check if a character is a vowel (a, e, i, o, u).

The method returns true if the character is a vowel and false otherwise.

7. Count Vowels and Consonants:

If the character is a letter, the program calls the isVowel method to determine if it's a vowel or a consonant.

If it's a vowel, the vowels counter is incremented; otherwise, the consonants counter is incremented.

8. Count Spaces:

If the character is whitespace, the spaces counter is incremented.

9. Display Character Counts:

System.out.println("The text contained vowels: " + vowels + "\n" + ...);

Prints out the counts of vowels, consonants, and spaces in the text.








