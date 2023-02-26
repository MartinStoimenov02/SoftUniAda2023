sequence = list(map(int, input().split()))
n = len(sequence)

# пресмятане на максималната сума на последователна част и началната й позиция
max_sum = sequence[0]
current_sum = sequence[0]
start = end = 0
current_start = 0
for i in range(1, n):
    if current_sum <= 0:
        current_sum = sequence[i]
        current_start = i
    else:
        current_sum += sequence[i]
    if current_sum > max_sum or (current_sum == max_sum and i - current_start > end - start):
        max_sum = current_sum
        start = current_start
        end = i

# извеждане на резултата
print(max_sum, start, end)
