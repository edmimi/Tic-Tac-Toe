# 🎮 Tic-Tac-Toe in Java

This is a **Tic-Tac-Toe** game developed in **Java**, using object-oriented programming (OOP) and console input. Two players take turns placing `X` and `O` on a **3x3** board, following the classic game rules.

---

## 📌 **Features**
✅ **3x3** board displayed after each turn.  
✅ Alternating turns between two players (`X` and `O`).  
✅ Movement validation to prevent occupied cells.  
✅ Winner or draw detection at the end of the game.  
✅ **Console-based input** for a simple and interactive experience.  
✅ **Modular code** with separate files (`Tablero.java` and `TicTacToe.java`).  

---

## 🛠️ **Technologies Used**
- **Language:** Java (JDK 8+)
- **Paradigm:** Object-Oriented Programming (OOP)
- **Input/Output:** Console (Scanner)
- **Recommended IDE:** NetBeans, Eclipse, IntelliJ IDEA, or VS Code  

---

## 📂 **Project Structure**
```
📁 TicTacToe-Java/
 ├── 📂 src/com/tic_tac_toe/
 │   ├── 📄 Board.java        # Class handling the game board
 │   ├── 📄 Game.java         # Game logic and player turns
 │   ├── 📄 Player.java       # Represents a player
 │   ├── 📄 Main.java         # Main class executing the game
 ├── 📄 README.md            # Project documentation
```

---

## 🚀 **How to Run the Project**
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/yourusername/TicTacToe-Java.git
cd TicTacToe-Java
```

### **2️⃣ Compile the Files**
```sh
javac -d bin src/com/tic_tac_toe/*.java
```

### **3️⃣ Run the Game**
```sh
java -cp bin com.tic_tac_toe.Main
```

---

## 🎯 **Game Rules**
1️⃣ The game starts with **Player X**.  
2️⃣ Each player enters the **row** and **column** to place their piece.  
3️⃣ A move is only valid if the chosen cell is **empty**.  
4️⃣ The first player to align **three symbols in a row** (horizontal, vertical, or diagonal) wins.  
5️⃣ If all cells are filled without a winner, the game ends in a **draw**.  

---

## 📌 **Example Console Output**
```sh
  0 1 2
0  | | 
  -----
1  | | 
  -----
2  | | 

Player X, enter row and column (0-2):
> 1 1

  0 1 2
0  | | 
  -----
1  |X| 
  -----
2  | | 

Player O, enter row and column (0-2):
> 0 0
```

---

## ✨ **Possible Future Improvements**
- 🤖 Implement **AI** to play against the computer.  
- 🎨 Add a **graphical interface** with Java Swing or JavaFX.  
- 🔄 Allow playing **multiple rounds** in one session.  
- 🌍 Online **multiplayer mode** using sockets.  

---

## 📜 **License**
This project is licensed under the **MIT License**. Feel free to use, modify, and distribute it.  

---

## 🤝 **Contributions**
Contributions are welcome! If you have ideas for improving the game, feel free to **fork** the repository and submit a **pull request**.  

---

## 📬 **Contact**
📌 [GitHub](https://github.com/edmimi)  
            (https://github.com/iespin)

📌 [LinkedIn](https://linkedin.com/in/miriam-sanchez-ordoñez/)  
              (https://linkedin.com/in/israelespin/)  
