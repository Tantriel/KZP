def create_matrix(size):
    arr = [[" " for _ in range(size)] for _ in range(size)]
    for i in range(size):
        for j in range(size):
            if j >= i and j >= size - i - 1 and j >= size // 2:
                arr[i][j] = "+"
    return arr


def init_matrix(matrix, size, file_name):
    print("Заповнення матриці:")
    for i in range(size):
        for j in range(size):
            if matrix[i][j] == "+":
                value = input(f"Введіть значення для матриці [{i}][{j}]: ")
                matrix[i][j] = value

    print("\nРезультат матриці:")
    with open(file_name, "w", encoding="utf-8") as writer:
        for row in matrix:
            line = " ".join(row)
            print(line)

            line = line.replace(" ", "+")
            writer.write(line + "\n")
if __name__ == '__main__':
    size = int(input("Введіть розмір матриці: "))
    file_name = "matrix_output.txt"
    matrix = create_matrix(size)
    init_matrix(matrix, size, file_name)