contacts = {}

def add_contact():
    name = input("Enter contact name: ")
    phone_number = input("Enter phone number: ")
    contacts[name] = phone_number

def remove_contact():
    name = input("Enter contact name: ")
    if name in contacts:
        del contacts[name]
    else:
        print("Contact not found")

def find_contact_by_phone_number():
    phone_number = input("Enter phone number: ")
    for name, number in contacts.items():
        if number == phone_number:
            print(f"Contact name: {name}")
            return
    print("Contact not found")

def find_contact_by_first_name():
    first_name = input("Enter first name: ")
    for name, phone_number in contacts.items():
        if name.split()[0].lower() == first_name.lower():
            print(f"Contact name: {name}, Phone number: {phone_number}")
            return
    print("Contact not found")

def find_contact_by_last_name():
    last_name = input("Enter last name: ")
    for name, phone_number in contacts.items():
        if name.split()[-1].lower() == last_name.lower():
            print(f"Contact name: {name}, Phone number: {phone_number}")
            return
    print("Contact not found")

def edit_contact():
    name = input("Enter contact name: ")
    if name in contacts:
        new_phone_number = input("Enter new phone number: ")
        contacts[name] = new_phone_number
    else:
        print("Contact not found")

def display_contacts():
    print("Contacts:")
    for name, phone_number in contacts.items():
        print(f"{name}: {phone_number}")

def main():
    user_is_on_app = True
    while user_is_on_app:
        print("Phone Book App")
        print("1. Add contact")
        print("2. Remove contact")
        print("3. Find contact by phone number")
        print("4. Find contact by first name")
        print("5. Find contact by last name")
        print("6. Edit contact")
        print("7. Display contacts")
        print("8. Quit")
        choice = input("Enter your choice: ")
        match choice:
            case "1":
                add_contact()
            case "2":
                remove_contact()
            case "3":
                find_contact_by_phone_number()
            case "4":
                find_contact_by_first_name()
            case "5":
                find_contact_by_last_name()
            case "6":
                edit_contact()
            case "7":
                display_contacts()
            case "8":
                print("Goodbye")
                user_is_on_app = False
            case _:
                print("Invalid choice. Please try again.")


main()
