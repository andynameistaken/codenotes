sample_data = """
2024-01-01, 1001, 120.00
2024-01-01, 1002, 150.00
2024-01-02, 1001, 130.00
2024-01-02, 1003, 160.00
2024-01-03, 1002, 110.00
2024-01-03, 1003, 170.00
2024-01-04, 1001, 140.00
2024-01-04, 1002, 150.00
"""

"""
Create pipeline that will:
1. Read data from a file
2. Filter data by product id
3. Convert Currency with exchange rate
4. Aggregate data in a sum
"""


def read_sales_from_string(data_string):
    for line in sample_data.split('\n'):
        if line: # check if line is not empty
            date, product_id, amount = line.strip().split(', ')
            yield date, int(product_id), float(amount)


def filter_sales_by_product_id(sales_data, product_id):
    """yield sales data for a given product"""
    for date, pid, amount in sales_data:
        if pid == product_id:
            yield date, pid, amount


def convert_currency(sales_data, conversion_rate):
    for date, pid, amount in sales_data:
        yield date, pid, amount * conversion_rate


def aggregate_currency(sales_data):
    return sum(amount for _, _, amount in sales_data)


# Creating pipeline
data_stream = read_sales_from_string(sample_data)
# fjlter data by pid 1002
filtered_data = filter_sales_by_product_id(data_stream, 1002)
# convert filtered data by rate of 0.85ą
converted_data = convert_currency(filtered_data, 0.85)
# get total of converted data:
total = aggregate_currency(converted_data)
print('total:', total)

