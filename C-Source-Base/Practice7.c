# include <stdio.h> // input / output
# include <stdbool.h> // boolean

int main() {

     // Program 1
     // People    Age
    int JohnAge = 20;
    int MaryAge = 18;
    int PeterAge = 15;
    int minAge = 18; // 18+ allowed in rollercoaster 

    // Check for eligability
    bool JohnValid = (JohnAge >= minAge);
    bool MaryValid = (MaryAge >= minAge);
    bool PeterValid = (PeterAge >= minAge);

    printf("Rollercoaster ride\n"); 
    
    printf("John %d\n", JohnValid); // TRUE = 1
    printf("Mary %d\n", MaryValid); // TRUE = 1
    printf("Peter %d\n\n", PeterValid); // FALSE = 0

    // Program 2
    bool isValid = true; // 1
    bool isInvalid = false; // 0
    int age;

    printf("Welcome people, please enter your age below\n");
    printf("1 = can enter, 0 = cannot enter thankyou!\n");

    printf("Enter your age: ");
    scanf("%d", &age);

    if (age >= 18) {
        printf("Valid to enter status: %d\n", isValid);
    } else if (age < 18) {
        printf("Valid to enter status: %d\n", isInvalid);
    } else {
        printf("Please enter your age\n");
    }


    return 0;
}