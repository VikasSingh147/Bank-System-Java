# Bank-System-Java
Bank System in Java This project is a simple yet functional banking system implemented in Java. It demonstrates fundamental Object-Oriented Programming (OOP) principles, including inheritance, encapsulation, and polymorphism. The system is designed to manage bank accounts, including savings and loans, and provides essential operations for users.

#Features-

Account Class: A base class representing a generic bank account with attributes like account number, name, address, phone number, date of birth, and balance. It includes methods for basic operations and account closure.

SavingsAccount Class: Inherits from Account and adds functionalities specific to savings accounts, such as:

Deposit: Adds funds to the account.
Withdraw: Withdraws funds from the account, ensuring sufficient balance.
Fixed Deposit: Simulates a fixed deposit with a specified tenure.
Liquidation: Handles the liquidation of fixed deposits.

LoanAccount Class: Also inherits from Account, with features for managing loan accounts, including:

Pay EMI: Pays an EMI towards the loan.
Top Up Loan: Increases the loan amount.
Repayment: Repays the loan principal.
