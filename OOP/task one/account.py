class Account:
    def __init__(self, number, balance):
        self.number = number
        self.balance = balance

    def get_number(self):
        return self.number

    def get_balance(self):
        return self.balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount > self.balance:
            raise ValueError("Insufficient funds")
        self.balance -= amount