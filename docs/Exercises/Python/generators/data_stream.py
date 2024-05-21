# Example 2
# Stream earthquake data from USGS website and print it.
# Default time of program working is 3s, but it can be changed.
import requests
import time

def earthquake_data_stream(url, duration_secs=3, sleep_time=1 ):
    """
    Process one item at a time.
    Don't load the entire dataset into memory
    """
    start_time = time.time()
    while time.time() - start_time < duration_secs:
        try:
            response = requests.get(url)  # GET from URL
            response.raise_for_status()  # If the response contains an HTTP error status code, raise an exception 
        except requests.exceptions.RequestException as e:
            print(f"An error occurred: {e}")
            yield None
        else:
            if response.status_code == 200:  # 200 = OK
                yield response.json() # return JSON data
            else:
                yield None
        time.sleep(sleep_time)

url = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson"
 
for data in earthquake_data_stream(url):
    if data:
        print(data)
    else:
        print("Failed to fetch data or no new data available")
        
"""
Memory Efficiency: When dealing with streaming data, especially large volumes
of  data or infinite streams, it's crucial to manage memory efficiently.
Generators created using yield process one item at a time and don't load the
entire dataset into memory. This makes them ideal for handling large or
continuous data streams without exhausting system resources.

Real-Time Processing: With yield, data can be processed as soon as it is
received.  This is particularly important in scenarios where real-time or
near-real-time processing is required, such as monitoring live events,
analyzing financial tick data, or processing live social media feeds.

Simplicity and Clean Code: Using generators for streaming can lead to simpler
and  more readable code. The alternative often involves more complex constructs
like manually managing iterators or dealing with callbacks, which can make the
code harder to understand and maintain.

Handling Latency and Network Issues: In streaming data over the network, there
can  be latency or intermittent connectivity issues. Generators can handle such
scenarios gracefully, as they can wait (block) for the next piece of data to
become available without consuming CPU resources.

Back Pressure Management: Generators provide a natural way to manage back
pressure  in data processing. Since they process data one item at a time, they
can adapt to the rate at which data is being produced, which is particularly
useful in scenarios where the data generation rate is variable.

Flexibility in Data Processing: Generators offer flexibility in how data is
processed.  You can easily chain generators, filter data, or combine data
streams. This composability is a powerful feature when dealing with complex
streaming data scenarios.

Asynchronous Programming Compatibility: Generators in Python can be easily
integrated with asynchronous programming (using async and await), making them
suitable for IO-bound tasks like network communication. This is especially
benef
"""