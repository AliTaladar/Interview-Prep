def validIPAddresses(string):
    # Write your code here.
    ip_addresses_found = []

    for i in range(1, min(len(string), 4)):
        curr_ip_address_parts = ['', '', '', '']
        
        curr_ip_address_parts[0] = string[:i]
        if not is_valid_part(curr_ip_address_parts[0]):
            continue

        for j in range(i + 1, i + min(len(string) - i, 4)):
            curr_ip_address_parts[1] = string[i:j]
            if not is_valid_part(curr_ip_address_parts[1]):
                continue

            for k in range(j + 1, j + min(len(string) - j, 4)):
                curr_ip_address_parts[2] = string[j:k]
                curr_ip_address_parts[3] = string[k:]
                if is_valid_part(curr_ip_address_parts[2]) and is_valid_part(curr_ip_address_parts[3]):
                    ip_addresses_found.append('.'.join(curr_ip_address_parts))
        
    return ip_addresses_found


def is_valid_part(string):
    str_as_int = int(string)

    if str_as_int > 255:
        return False

    return len(string) == len(str(str_as_int))
    