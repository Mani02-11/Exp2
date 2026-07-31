# 📱 Android Lab Experiment 2 – Activity Lifecycle with Custom Toast

A simple Android application developed using **Android Studio** and **Kotlin** as part of the **Mobile Application Development Lab**. The application demonstrates the **Android Activity Lifecycle** by implementing lifecycle callback methods and displaying each lifecycle event using a **Custom Toast**. The custom Toast is implemented using **Custom.java** and a custom layout file **toast_layout.xml**.

---

## 👨‍💻 Author

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab

---

## 🚀 Features

- Demonstrates Android Activity Lifecycle
- Implements all major lifecycle callback methods
- Displays lifecycle events using Custom Toast
- Uses a separate `Custom.java` class for reusable Toast functionality
- Uses `toast_layout.xml` for a customized Toast UI
- Built using Kotlin

---

## 📚 Concept

Android Activities go through different lifecycle states during execution. The Android operating system automatically invokes lifecycle callback methods based on user interaction. This project demonstrates these callbacks by displaying customized Toast messages for each lifecycle event.

---

## 🧪 Scenario Demonstrated

The application demonstrates the following scenarios:

- Launching the application
- Moving the application to the background
- Reopening the application
- Closing the application

For every lifecycle transition, a Custom Toast notification is displayed.

---

## 🛠️ Technologies Used

- Android Studio
- Kotlin
- Java
- XML
- Android SDK

---

## 📂 Project Structure

```text
app
├── manifests
│   └── AndroidManifest.xml
├── kotlin+java
│   └── com.example.exp2
│       ├── MainActivity.kt
│       └── Custom.java
├── res
│   ├── drawable
│   ├── layout
│   │   ├── activity_main.xml
│   │   └── toast_layout.xml
│   ├── mipmap
│   ├── values
│   └── xml
└── Gradle Scripts
```

---

## ▶️ How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Wait for Gradle Sync to complete.
4. Connect an Android device or launch an emulator.
5. Run the application.
6. Observe the Custom Toast messages displayed during Activity lifecycle transitions.

---


## ✅ Test Cases

### Test Case 1: Application Launch

**Objective:** Verify that the application launches successfully.

**Expected Result:** The application opens successfully, and Custom Toast messages for `onCreate()`, `onStart()`, and `onResume()` are displayed.


### Test Case 2: Activity Lifecycle Transitions

**Objective:** Verify lifecycle callbacks when the application is minimized and reopened.

**Expected Result:** Custom Toast messages are displayed for `onPause()`, `onStop()`, `onRestart()`, `onStart()`, and `onResume()` in the correct sequence.

---

### Test Case 3: Verify Student Details and Custom Toast

**Objective:** Verify that the application displays the student's Name, USN, and the Custom Toast correctly.

**Expected Result:**
- Name: **Manikandan P**
- USN: **25MCAR0186**


---

## 📖 Learning Outcomes

- Understood the Android Activity Lifecycle.
- Implemented lifecycle callback methods using Kotlin.
- Learned to create reusable Custom Toasts using Java.
- Designed a custom Toast layout using XML.
- Gained hands-on experience with Android Studio and Activity state management.
