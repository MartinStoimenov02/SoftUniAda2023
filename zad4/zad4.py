n = int(input())

matrix = []
for i in range(n):
    row = list(map(int, input().split()))
    matrix.append(row)

for i in range(n):
    for j in range(i, n):
        matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

for i in range(n):
    matrix[i] = matrix[i][::-1]

for i in range(n):
    for j in range(n):
        print(matrix[i][j], end=' ')
    print()