# 🧪 DemoQA - Selenium TestNG Automation Framework

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen?logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-Framework-orange)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-red?logo=apache-maven)
![DataProvider](https://img.shields.io/badge/Test_Data-DataProvider-yellow)
![Status](https://img.shields.io/badge/Status-Completed-success)

---

## 📘 Project Overview

🚀 **DemoQA_TestNG_Selenium_Automation** is a functional test automation framework built using **Selenium WebDriver, Java, and TestNG**.  
It automates multiple UI components and forms available on the [DemoQA](https://demoqa.com/) website.  
This project also demonstrates **DataProvider-based test execution** for data-driven validations and reusable test logic.

---

## 🎯 Objective

- To perform **functional automation testing** on the DemoQA web elements.  
- To implement **TestNG with DataProvider** for executing tests with multiple data sets.  
- To develop a **modular and maintainable** framework using Selenium WebDriver and Java.  
- To generate structured and detailed **HTML test reports**.

---

## 🧩 Framework Architecture

📁 **Project Structure**
```
📂 DemoQA_TestNG_Selenium_Automation/
┣ 📂 src/
┃ ┣ 📂 main/java/
┃ ┃ ┣ 📂 base/
┃ ┃ ┃ ┣ BaseTest.java
┃ ┃ ┣ 📂 pages/
┃ ┃ ┃ ┣ ElementsPage.java
┃ ┃ ┃ ┣ FormsPage.java
┃ ┃ ┃ ┣ AlertsPage.java
┃ ┃ ┃ ┣ WidgetsPage.java
┃ ┃ ┃ ┣ InteractionsPage.java
┃ ┃ ┣ 📂 utils/
┃ ┃ ┃ ┣ ConfigReader.java
┃ ┃ ┃ ┣ ExcelUtils.java
┃ ┃ ┃ ┣ WebDriverManager.java
┃ ┣ 📂 test/java/
┃ ┃ ┣ TestCases/
┃ ┃ ┃ ┣ ElementsTest.java
┃ ┃ ┃ ┣ FormsTest.java
┃ ┃ ┃ ┣ AlertsTest.java
┃ ┃ ┃ ┣ WidgetsTest.java
┃ ┃ ┃ ┣ DataProviderTests.java
┣ 📂 test-output/ # TestNG Reports
┣ 📄 pom.xml # Maven Dependencies
┣ 📄 testng.xml # Test Suite Configuration
┣ 📄 config.properties # Project Configuration
┣ 📄 README.md

```

---

## ⚙️ Key Features

- 🧩 **TestNG Integration** – for test grouping, prioritization, and assertions.  
- 🔁 **DataProvider Implementation** – executes the same test with multiple input sets.  
- 🧱 **Page Object Model (POM)** – clean separation of page elements and actions.  
- 🧠 **Reusable Utilities** – driver setup, config management, and reporting.  
- 🧪 **Cross-Browser Support** – configurable via `config.properties`.  
- 📊 **TestNG HTML Reports** – auto-generated after each run.  
- 🕒 **Synchronization Mechanisms** – implicit and explicit waits for stability.

---

## 🧠 Automated Test Scenarios

| Module | Test Scenario | Description |
|---------|----------------|-------------|
| **Elements** | Text Box & Buttons | Validate text box input, button click actions |
| **Forms** | Practice Form | Fill out and submit the form with multiple datasets |
| **Alerts** | Handle Alerts | Accept, dismiss, and verify alert messages |
| **Widgets** | Date Picker & Tool Tips | Verify date selection and tool tip display |
| **Interactions** | Drag and Drop | Validate element movement on drag and drop |
| **DataProvider** | Multi-data Execution | Test with different inputs using TestNG DataProvider |

---

## 🧪 Tools & Technologies Used

| Category | Tools / Technologies |
|-----------|----------------------|
| **Automation Tool** | Selenium WebDriver |
| **Language** | Java |
| **Framework** | TestNG |
| **Design Pattern** | Page Object Model (POM) |
| **Data Handling** | DataProvider / Excel |
| **Build Tool** | Maven |
| **IDE Used** | IntelliJ IDEA / Eclipse |
| **Reports** | TestNG HTML Reports |

---

## 🚀 How to Run the Tests

### 🔧 Prerequisites
Ensure you have:
- **Java JDK (8 or above)**
- **Maven**
- **IntelliJ IDEA / Eclipse**
- **Chrome Browser & WebDriver**

---

### ▶️ Steps to Execute

1. Clone the repository:
   ```bash
   git clone https://github.com/Shivshanker869/DemoQA_TestNG_Selenium_Automation.git
