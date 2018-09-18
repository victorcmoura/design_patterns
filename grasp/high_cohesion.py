# High Cohesion pattern: Let the objects do exaclty one specific task with the specialist pattern to increase cohesion
#   - The block class calculates the total area based on individual areas given by each square
#   - The square class calculates its individual area based on its side length

# Specialist pattern: Which is the best class to execute an specific task?
# Specific tasks:
#   - Create objects
#   - Calculate individual area
#   - Calculate total area

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
            total_area += square.get_area()
        
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

# Our block is a specialist in calculating its total area, since it can reuse the individual areas calculated by its squares
print("Total area:", block.get_area())
