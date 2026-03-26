# Banking System Inheritance Assignment

## Student Information

**Name:** Hamna Noor
**Registration Number:** FA25-BSE-046

## Assigned Hierarchy

**BankAccount → SavingsAccount → PremiumSavingsAccount**

## Program Description

This program demonstrates **Multilevel Inheritance** in Java using a banking system.

### 1. BankAccount (Base Class)

This class contains basic bank account information:

* accountNo
* holderName
* balance

**Methods:**

* displayInfo() — Displays account details
* deposit() — Adds amount to balance
* withdraw() — Deducts amount from balance

---

### 2. SavingsAccount (Derived from BankAccount)

This class extends **BankAccount** and adds:

* interestRate
* minBalance

**Additional Method:**

* calculateInterest() — Calculates interest based on balance

---

### 3. PremiumSavingsAccount (Derived from SavingsAccount)

This class extends **SavingsAccount** and adds:

* rewardPoints
* bonusRate

This class represents premium customers with additional benefits and higher interest bonus.

---

## Concepts Used

* Multilevel Inheritance
* Method Reuse
* Encapsulation
* Method Overriding (if implemented)

---

## Purpose

The purpose of this program is to demonstrate how inheritance works in Java by modeling a real-world banking system with different account types.
