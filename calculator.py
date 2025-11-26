import sys

def add(x, y): return x + y
def subtract(x, y): return x - y
def multiply(x, y): return x * y
def divide(x, y):
    if y == 0: raise ValueError("Cannot divide by zero")
    return x / y

if __name__ == "__main__":
    print("Simple Calculator CLI")
    try:
        if len(sys.argv) == 4:
            op = sys.argv[1]
            num1 = float(sys.argv[2])
            num2 = float(sys.argv[3])
            if op == 'add': print(add(num1, num2))
            elif op == 'sub': print(subtract(num1, num2))
            elif op == 'mul': print(multiply(num1, num2))
            elif op == 'div': print(divide(num1, num2))
        else:
            print("Usage: python calculator.py <add|sub|mul|div> <num1> <num2>")
    except Exception as e:
        print(e)