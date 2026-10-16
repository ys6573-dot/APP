from functools import reduce

salaries = [35000, 42000, 28000, 50000]

# a) Revise salaries
revised = list(map(lambda s: s*1.1 if s < 40000 else s, salaries))
print("Revised:", revised)

# b) Eligible employees
eligible = list(filter(lambda s: s < 40000, salaries))
print("Eligible:", eligible)

# c) Total expenditure
total = reduce(lambda a, b: a + b, revised)
print("Total expenditure:", total)

# d) Explanation
print("Functional programming is suitable because salaries can be processed as transformations on lists without side effects.")
