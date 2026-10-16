# a) Pure function
def discount(price):
    return price * 0.8 if price > 1000 else price

prices = [500, 1200, 2000, 800]

# b) Apply discount
discounted = list(map(discount, prices))
print("Discounted:", discounted)

# c) Products > 1000
eligible = list(filter(lambda p: p > 1000, prices))
print("Eligible:", eligible)

# d) Explanation
print("Pure functions avoid modifying the original list; they return new values instead.")
