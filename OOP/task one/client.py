class Client:
    def __init__(self, bank, person, account):
        self.bank = bank
        self.person = person
        self.account = account

    def deposit(self, amount):
        self.account.deposit(amount) # call the deposit method on the Account object

    def withdraw(self, amount):
        self.account.withdraw(amount) # call the withdraw method on the Account object

    def get_balance(self):
        return self.account.get_balance() # call the get_balance method on the Account object and return the result