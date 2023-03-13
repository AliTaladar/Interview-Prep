def isPalindrome(string):
    # Write your code here.
    start, end = 0, len(string) - 1
    while start < end:
        if string[start] != string[end]:
            return False
        start += 1
        end -= 1
    return True
