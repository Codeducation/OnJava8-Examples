# staticchecking/NoBasePetSpeak.py
# �2016 MindView LLC: see Copyright.txt
# Speaking pets without base classes:

class Cat:
    def speak(self):
       System.out.println("meow!")

class Dog:
    def speak(self):
       System.out.println("woof!")

class Bob:
    def bow(self):
       System.out.println("thank you, thank you!")
    def speak(self):
       System.out.println("Welcome to the neighborhood!")
    def drive(self):
       System.out.println("beep, beep!")

def command(pet):
    pet.speak()

pets = [ Cat(), Dog(), Bob() ]

for pet in pets:
    command(pet)
