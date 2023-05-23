import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 31)
    var guessedNumber: Int
    var attempts1 = 0

    val secretColor = "BLUE" // Secret word to guess
    var guessedColor: String?
    var attempts = 0


    println("Welcome to the Guessing Game!")
    println("I'm thinking of a number between 1 and 30.")

    do {
        print("Enter your guess: ")
        guessedNumber = readLine()?.toIntOrNull() ?: 0

        when {
            guessedNumber == 0 -> {
                println("Invalid input. Please enter a number.")
            }
            guessedNumber < secretNumber -> {
                println("Too low! Try again.")
                attempts1++
            }
            guessedNumber > secretNumber -> {
                println("Too high! Try again.")
                attempts1++
            }
            else -> {
                attempts1++
                println("Congratulations! You guessed the number in $attempts1 attempts.")
                val numberSentences = arrayOf(
                    println("The number $guessedNumber is an interesting choice."),
                    println("The number $guessedNumber represents a significant value."),
                    println("The number $guessedNumber is frequently seen in various contexts.")
                )
            }
        }
    } while (guessedNumber != secretNumber)

    // Word Guess game

    println("Welcome to the Color Guessing Game!")
    println("I'm thinking of a color. Can you guess the word?")

    do {
        print("Enter your guess: ")
        guessedColor = readLine()?.toUpperCase()

        if (guessedColor != null) {
            attempts++
            if (guessedColor == secretColor) {
                println("Congratulations! You guessed the word \"$secretColor\" in $attempts attempts.")
                val colorSentences = arrayOf(
                    println("The color $guessedColor is vibrant and eye-catching."),
                    println("The color $guessedColor evokes a sense of calm and tranquility."),
                    println("The color $guessedColor is often associated with creativity and inspiration.")
                )
            } else {

                println("Incorrect guess.\"$guessedColor\" is not the correct answer.")
            }
        }
    } while (guessedColor != secretColor)


    }










