def phoneNumberMnemonics(phoneNumber):
    # Write your code here.  
    return helper(phoneNumber, [''], 0)


def helper(phoneNumber, mnemonics, i):
    if i >= len(phoneNumber):
        return mnemonics
    
    new_mnemonics = []
    for mnemonic in mnemonics:
        for c in PHONE_LETTERS[phoneNumber[i]]:
            new_mnemonics.append(mnemonic + c)
    
    return helper(phoneNumber, new_mnemonics, i + 1)
    

PHONE_LETTERS = {'1': '1',
           '2': 'abc',
           '3': 'def',
           '4': 'ghi',
           '5': 'jkl',
           '6': 'mno',
           '7': 'pqrs',
           '8': 'tuv',
           '9': 'wxyz',
           '0': '0'}