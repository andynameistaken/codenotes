import aiohttp
import asyncio

async def fetch(url, session):
    async with session.get(url) as response:
        return await response.text()

async def fetch_all(urls):
    async with aiohttp.ClientSession() as session:
        for url in urls:
            data = await fetch(url, session)
            yield data

# URLs to fetch data from
urls = [
    "https://httpbin.org/get",
    "https://httpbin.org/ip",
    # Add more URLs as needed
]

# Running the async generator
async def main():
    async for data in fetch_all(urls):
        print(data)  # Process the data

# Run the event loop
asyncio.run(main())
