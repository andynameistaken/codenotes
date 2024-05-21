import asyncio

async def main():
    print('hello')

async def foo(text):
    print(text)
    await asyncio.sleep(1)

#  # This function always creates a new event loop and closes it at the end.
# It should be used as a main entry point for asyncio programs, 
# and should ideally only be called once.    
asyncio.run(main())
