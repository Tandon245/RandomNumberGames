# Number Guessing Game

This is a simple Java program that implements a number guessing game. The program generates a random number between 1 and 100, and the user's task is to guess that number within the fewest attempts possible.

## How the Game Works

1. The program uses the `Random` class from the `java.util` package to generate a random integer between 1 and 100, inclusive. This random number is the target that the user needs to guess.

2. The program prompts the user to input their guessed number using the `Scanner` class. It then compares the user's guess with the generated random number.

3. If the guessed number matches the random number, the program displays a success message along with the number of attempts it took the user to guess correctly. The game ends.

4. If the guessed number is lower than the random number, the program provides a hint by displaying the message "Please Enter a Higher Number."

5. If the guessed number is higher than the random number, the program provides another hint by displaying the message "Please Enter a Lower Number."

6. The game continues until the user guesses the correct number. The program keeps track of the number of attempts made by incrementing the `attempts` variable.

## How to Play

1. Run the program in a Java compiler or environment that supports Java applications.

2. The program will generate a random number between 1 and 100. This number will remain constant throughout the game session.

3. Enter your guessed number through the keyboard input prompted by the program.

4. Based on your guess, the program will provide you with feedback: whether the target number is higher or lower than your guess.

5. Keep guessing until you correctly identify the target number. The program will display the number of attempts it took you to guess correctly.

6. The game will then end.

## Key Components

- `Scanner`: This class allows the program to read user input from the keyboard.

- `Random`: This class generates pseudo-random numbers, which are used to create the target number for the guessing game.

- `while` Loop: The game runs within a `while` loop, which continues until the correct number is guessed.

- Conditional Statements (`if` statements): These statements provide feedback to the user based on their guessed number, helping them narrow down their choices.

## Sample Output
Please Enter a Number
50
Please Enter a Higher Number
75
Please Enter a Lower Number
63
Please Enter a Lower Number
57
Please Enter a Higher Number
60
Please Enter a Higher Number
62
You Have Guessed The Number in 6 attempts



Feel free to modify and improve the program as you like! This simple game can serve as a foundation for more complex projects or Java programming practice.
