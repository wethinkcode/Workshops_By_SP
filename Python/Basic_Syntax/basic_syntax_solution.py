import time
# Python Basic Syntax

# 1. Variables: You can store values in variables.
x = 10  
y = 20.5  
z = "Hello, World!"  
a = True  
b = False  

# Use the print statement and the variable 'x' to display the message:
    # "10, is an integer variable."
print(f"{x}, is an integer variable.\n")
time.sleep(1)

# Use the print statement and the variable 'y' to display the message: 
    # "20.5, is a float variable."
print(f"{y}, is a float variable.\n")
time.sleep(1)

# Use the print statement and the variable 'z' to display the message: 
    # "'Hello, World!', is a string variable."
print(f"'{z}', is a string variable.\n")
time.sleep(1)

# Use the print statement and the variable 'a' to display the message:
    # " 'True', is a boolean variable."
print(f"{a}, is a boolean variable.\n")
time.sleep(1)

# Use the print statement and the variable 'b' to display the message:
    # " 'False', is a boolean variable.
print(f"{b}, is a boolean variable.\n")
time.sleep(2)

# 2. Data Types: Python has several built-in data types.
# Edit the code below to print:
    # "10 belongs to <class 'int'>: meaning it is an integer."
print(f"{x} belongs to {type(x)}: meaning it is an integer.\n")
time.sleep(1)

# Edit the code below to print:
    # " 20.5 belongs to <class 'float'>: meaning it is a float."
print(f"{y} belongs to {type(y)}: meaning it is a float.\n")
time.sleep(1)

# Edit the code below to print:
    # " 'Hello, World!', belongs to <class 'str'>: meaning it is a string."
print(f"{z}, belongs to {type(z)}: meaning it is a string.\n")
time.sleep(1)

# Edit the code below to print:
    # "'True', belongs to <class 'bool'>: meaning it is a boolean."
print(f"{a}, belongs to {type(a)}: meaning it is a boolean.\n")
time.sleep(1)

# Edit the code below to print:
    # "'False', belongs to <class 'bool'>: meaning it is a boolean.
print(f"{b}, belongs to {type(b)}: meaning it is a boolean.\n")
time.sleep(2)

# 3. Basic Operators: 
    # Python supports various operators for performing operations on data.
# Arithmetic Operators

# Addition: print the sum of x and y
print(x + y)
time.sleep(1)

# Subtraction: print the difference between x and y
print(x - y)
time.sleep(1)

# Multiplication: print the product of x and y
print(x * y)
time.sleep(1)

# Division: print the answer when you divide x by y
print(x / y)
time.sleep(1)

# Modulus (remainder of the division): print the remainder after dividing x by y
print(x % y)
time.sleep(2)
print()

# 5. Indentation: 
    # Python uses indentation to indicate the beginning and end of code blocks.
# Complete the for loop below to print numbers 0 to 5    
for number in range(6):
    print(number)  # This line is part of the for loop because it's indented.
    time.sleep(1)