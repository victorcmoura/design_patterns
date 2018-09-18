# Creator pattern: Which is the best class to instantiate my objects?
class Dog:
    def __init__(self, name):
        self.bark_sound = "Woof Woof! :)"
        self.name = name

    def __repr__(self):
        return self.name
    
    def bark(self):
        print(self.name + " says '" + self.bark_sound + "'")

class Person:
    def __init__(self, name):
        self.name = name
        self.dogs = []

    def adopt_dog(self, dog):
        self.dogs.append(dog)
    
    def talk(self):
        print("Hello, my name is " + self.name)

# People can be instantiated independently from dogs
john = Person('John')
mary = Person('Mary')

# Dogs can be instantiated independently from people
doge = Dog('Doge')

john.talk()

doge.bark()

# Despite being instantiated independently, both can be friends
john.adopt_dog(doge)
print(john.dogs)
