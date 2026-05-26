# Java Currency Converter 💱

A lightweight, high-performance console-based Java application that allows users to instantly convert amounts between major global currencies. This project demonstrates clean coding practices, efficient error handling, and optimal data structure utilization in Java.

---

## ✨ Features

* **Optimal Efficiency:** Utilizes an immutable Map lookup system, ensuring **O(1) constant time complexity** for rate retrieval regardless of the number of supported currencies.
* **Modern Java Syntax:** Leverages Java 9+ `Map.of()` initialization and clean single-line algebraic logic for multi-currency conversion.
* **Robust Resource Management:** Implements a try-with-resources block to automatically handle `Scanner` lifecycle and stream closures.
* **Defensive Programming:** Includes early-exit validation checks to gracefully handle invalid currency codes without throwing exceptions or crashing.
* **Precise Formatting:** Displays financial outputs limited to exactly two decimal places (`%.2f`) for standard monetary representation.

---

## 🛠️ Built With

* **Language:** Java (JDK 9 or higher required)
* **IDE Tools:** IntelliJ IDEA, VS-CODE
* **Data Structure:** `java.util.Map` for key-value pair tracking

---

## 🚀 How to Run

1. **Clone the repository to your local machine:**
```bash
   git clone [https://github.com/Anubhavkr007/CurrencyConvertor.git](https://github.com/Anubhavkr007/CurrencyConvertor.git)
