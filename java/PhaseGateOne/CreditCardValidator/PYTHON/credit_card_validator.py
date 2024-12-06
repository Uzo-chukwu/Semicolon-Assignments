def get_card_type(card_number):
    if card_number.startswith("4"):
        return "Visa"
    elif card_number.startswith("5"):
        return "MasterCard"
    elif card_number.startswith("37"):
        return "American Express"
    elif card_number.startswith("6"):
        return "Discover"
    else:
        return None

def validate_card_number(card_number):
    sum_of_doubled_placed_digits = 0
    sum_of_odd_place_digits = 0

    for count in range(len(card_number) - 1, -1, -2):
        digit_in_odd_place = int(card_number[count])
        sum_of_odd_place_digits += digit_in_odd_place

    for count in range(len(card_number) - 2, -1, -2):
        digit_in_double_place = int(card_number[count])
        digit_in_double_place *= 2
        if digit_in_double_place > 9:
            digit_in_double_place -= 9
        sum_of_doubled_placed_digits += digit_in_double_place

    return (sum_of_doubled_placed_digits + sum_of_odd_place_digits) % 10 == 0

def run_program():
    card_number = input("Hello, kindly Enter Card details to verify: ")
    card_type = get_card_type(card_number)

    if card_type is None:
        print("Invalid card type.")
        return

    is_valid = validate_card_number(card_number)

    print("*********************************")
    print("Credit Card Type:", card_type)
    print("Credit Card Number:", card_number)
    print("Credit Card Digit Length:", len(card_number))
    print("Credit card Validity Status:", "Valid" if is_valid else "Invalid")
    print("*********************************")


run_program()