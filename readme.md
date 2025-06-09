# 🎯 Number Guessing Game (Java Console App)

This is a simple Java-based console game where the system generates a random number between **0 and 100**, and the user tries to guess it in **5 attempts**.

---

## 🕹️ How to Play

1. The system will generate a **random number between 0 and 100**.
2. You get **5 chances** to guess the correct number.
3. After each guess, you'll be told:
   - Whether your guess is too high or too low.
   - How many attempts are remaining.
4. If you guess correctly within 5 tries — you win! 🎉
5. After the game ends, you can choose to:
   - 🔁 Play Again
   - ❌ Exit

---

## 📦 Features

- 🎲 Random number generation using `Math.random()`
- ⌛ 5 attempts for guessing
- 📉 Hints whether to increase or decrease the guess
- 🔁 Play Again option after game ends
- 🧠 Input validation to avoid crashes on invalid input
- 💡 Well-structured code using methods for each functionality

---

## 💻 Technologies Used

- Java (JDK 8+)
- Console/Terminal
- Java Scanner for input

---

## 🚀 How to Run

1. Make sure Java is installed (`java -version`).
2. Compile the file:
   ```bash
   javac Main.java
