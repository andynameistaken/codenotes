## Ifinity Generator
# Create generator that generates numbers from natural number set.
# Generate natural numbers from 1 to 10 in a loop.

def integer_infinity_generator(start=0):
    num = start
    while True:
        yield num
        num += 1

integer_infinity_obj = integer_infinity_generator()

# And all we need is some numbers from 0 to 10. Not even random.

for j in range(10):
   print(next(integer_infinity_obj), end=" ")
   
