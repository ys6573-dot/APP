from functools import reduce

marks = [45, 67, 89, 30, 95, 50]

# a) Students scoring >= 50
passed = list(filter(lambda m: m >= 50, marks))
print("Passed:", passed)

# b) Add 5 grace marks, cap at 100
grace = list(map(lambda m: min(m + 5, 100), marks))
print("After grace:", grace)

# c) Total marks
total = reduce(lambda a, b: a + b, marks)
print("Total:", total)

# d) Explanation
print("Lambda functions let us define small, inline functions without naming them, simplifying filter/map/reduce usage.")
