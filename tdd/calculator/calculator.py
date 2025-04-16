history = []

def add(a, b):
    result = a + b
    history.append(f"{a} + {b} = {result}")
    return result

def subtract(a, b):
    result = a - b
    history.append(f"{a} - {b} = {result}")
    return result

def multiply(a, b):
    result = a * b
    history.append(f"{a} * {b} = {result}")
    return result

def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero")
    result = a / b
    history.append(f"{a} / {b} = {result}")
    return result

def power(a, b):
    result = a ** b
    history.append(f"{a} ^ {b} = {result}")
    return result

def sqrt(a):
    if a < 0:
        raise ValueError("Cannot calculate the square root of a negative number")
    result = a ** 0.5
    history.append(f"√{a} = {result}")
    return result

def get_history():
    return history

def clear_history():
    global history
    history = []


if __name__ == "__main__":
    # Example usage
    print(add(1, 2))  # Output: 3
    print(subtract(5, 3))  # Output: 2
    print(multiply(2, 4))  # Output: 8
    print(divide(8, 2))  # Output: 4.0
    print(power(2, 3))  # Output: 8
    print(sqrt(16))  # Output: 4.0

    print(get_history())  # Output: history of calculations