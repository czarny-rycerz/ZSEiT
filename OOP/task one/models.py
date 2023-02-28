from django.db import models

class Bank(models.Model):
    name = models.CharField(max_length=100)

class Person(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)

class Account(models.Model):
    number = models.CharField(max_length=100)
    balance = models.FloatField()

class Client(models.Model):
    bank = models.ForeignKey(Bank, on_delete=models.CASCADE)
    person = models.ForeignKey(Person, on_delete=models.CASCADE)
    account = models.ForeignKey(Account, on_delete=models.CASCADE)