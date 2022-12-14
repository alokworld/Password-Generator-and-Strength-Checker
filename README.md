# Password-Generator-and-Strength-Checker
The code suggests Password to the users which is secure and powerful as well as it checks the strength of the Password provided by the user. 
The code first asks the user to make a choice, either 1 or 2, 1 for New Password Suggestion and 2 for Password Strength Check.
If the user enter anything other than valid inputs (i.e. 1 or 2) then a message will displayed as "Invalid Input".

Now for the first option 1, the code has a function suggest( ) of String data type, the function doesn't contain any parameter,
as it will itself generate a password for the user without user intervention.

Now for the second option 2, the code has a function strength( ) of boolean data type, if the password is Secure and then it returns
TRUE otherwise FALSE. The function accepts one parameter, which is the password given by whose strength is to be checked.
