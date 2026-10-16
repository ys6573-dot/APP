from functools import reduce

consumption = [8, 12, 15, 7, 20]

# a) Days > 10 units
high_days = list(filter(lambda c: c > 10, consumption))
print("High consumption days:", high_days)

# b) Cost per day
costs = list(map(lambda c: c * 6, consumption))
print("Daily costs:", costs)

# c) Total consumption
total = reduce(lambda a, b: a + b, consumption)
print("Total consumption:", total)

# d) Pure function
def bill(data):
    return sum(c * 6 for c in data)

print("Bill:", bill(consumption))
