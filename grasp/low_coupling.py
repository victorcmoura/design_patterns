# Low Coupling pattern: Enhance reusing by reducing dependencies
# It is easier to show high coupling to represent what situation should be avoided
#   - Let's make the block class calculate the total area without reusing individual areas logic. (If you didn't see, check high_cohesion.py)

class Side:
    def __init__(self, size):
        self.size = size

    def __repr__(self):
        return "Side with size {0}".format(self.size)

class Square:
    def __init__(self, side_size):
        self.side = Side(side_size)

    def __repr__(self):
        return "Square with side size {0}".format(self.side.size)

    def get_area(self):
        return self.side.size * self.side.size

class Block:
    def __init__(self, list_of_squares):
        self.squares = list_of_squares

    def __repr__(self):
        return "I am a block with {0} squares".format(len(self.squares))

    def get_area(self):
        total_area = 0

        for square in self.squares:
            #   If something changes inside the side class in a way that we can't get its size by calling .size
            # it will be necessary to modify the line below and square.get_area(), making the code less maintainable than it would if
            # we had used only square.get_area().
            total_area += square.side.size * square.side.size
        
        return total_area

# We want a block, but it doesn't know how many or which squares it will contain. So we can't make him a square creator
# Let's create some squares
square_one = Square(10)
square_two = Square(5)
square_three = Square(2)

print("Squares:")
print(square_one)
print(square_two)
print(square_three)

# Now we can create our block
square_list = [square_one, square_two, square_three]
block = Block(square_list)
print("Block:", block)

# Our design is not fully low coupled, since class Block is not reusing the individual areas calculated by square.get_area()
print("Total area:", block.get_area())
