def caesarCipherEncryptor(string, key):
    # Write your code here.
    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    char_list = []

    for c in string:
        ascii_value = ord(c)
        alph_idx = (alphabet.index(c) + key) % 26
        char_list.append(alphabet[alph_idx])

    return ''.join(char_list)
