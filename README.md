# 🔐 PasswordVault – AES-Encrypted Password Tool (Java)

|<img width="1280" height="640" alt="PasswordVault" src="https://github.com/user-attachments/assets/05beaaa1-f825-4634-91da-d6c4efa9550d" />|
|---|

A simple and secure Java-based password vault that encrypts and decrypts strings using AES-128 encryption.  
Perfect for demonstration, learning cryptography in Java, or building your own local password manager.

<br>

---

<br>

## ✅ Features

- AES encryption using a 16-byte key
- Base64 output for easy readability
- Decryption included for verification
- Fully console-based and platform-independent (Java)
- No external dependencies required

<br>

---

<br>

## 💻 How It Works

The application encrypts any user-provided password and displays both the encrypted and decrypted values using Java's `javax.crypto` and `Base64` libraries.

<br>

---

<br>

## 📦 Usage

### 1. Compile the Java file

```yarn
javac PasswordVault.java
```

<br>

---

<br>

2. Run the program

```yarn
java PasswordVault
```

<br>

---

<br>

🔐 Secure Password Vault

```yarn
Enter password to encrypt: mySuperSecret123
Encrypted password: 4T1Gc4b3YZ2Ej1If1hA7RQ==
Decrypted password: mySuperSecret123
```

<br>

---

<br>

📄 License
MIT License – [LICENSE](LICENSE)
