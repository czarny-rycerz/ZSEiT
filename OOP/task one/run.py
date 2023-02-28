from bank import Bank
from account import Account
from person import Person
from client import Client

# create objects
bank = Bank("MyBank") # create a Bank object with the name "MyBank"
person = Person("John", "Doe")  # create a Person object with first name "John" and last name "Doe"
account = Account("123456", 1000) # create an Account object with account number "123456" and balance of 1000
client = Client(bank, person, account) # create a Client object with the Bank, Person and Account objects created above

# perform actions

client.deposit(2000) # deposit 2000 into the client's account
client.withdraw(200) # withdraw 200 from the client's account


# print account balance
print(Person)
print(client.get_balance())
