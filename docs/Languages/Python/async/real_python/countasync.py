#!/usr/bin/env python3

# https://realpython.com/async-io-python/
'''
This code shows core philosophy of asynchronous programming.
There are 3 tasks created by asyncio.gather(count(),...).
The `asyncio.gather()` function is used to run multiple coroutines
concurrently.
They are dispatched in asyncio.run(main()) which creates Event Loop that starts.
them.
When you `await asyncio.gather(count(), count(), count())`, you're starting
three `count()` coroutines almost at the same time.
When one is put to sleep via asyncio.sleep(1) another one takes turn.
It is only one working task at one time.
The `asyncio.sleep(1)` function is a non-blocking sleep that simulates IO-bound
work (like waiting for a network response). During this sleep, the event loop
can switch to another coroutine
asyncio event loop is single threaded, only one coroutine runs at any given
moment, the event loop can switch between tasks whenever one of them is waiting
for IO. This gives the illusion of them running at the same time. 

'''
import asyncio
import time
async def count():
    print('One')
    await asyncio.sleep(1)
    print('Two')

async def main():
    await asyncio.gather(count(), count(), count())
    
if __name__=='__main__':
    first_time = time.perf_counter()
    asyncio.run(main())
    second_time = time.perf_counter()
    elapsed = second_time - first_time
    print(f"{__file__} executed in {elapsed:0.2f} seconds.")
