# Specialist pattern: Which is the best class to execute an specific task?
# Specific tasks:
#   - Create objects
#   - Calculate area

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

# We want a square. Our square depends on sides, but as it is an specialist in square creating, there is no need to instantiate anything before
square = Square(10)
print("Square:", square)

# Our square created a side for itself
print("Side:", square.side)

# Our square is also an specialist in calculating its area
print("Area:", square.get_area())
