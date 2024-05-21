import asyncio
import time
# for catching runtime warnings
'''
Synchronous programming

- it is bound to CPU
- it is sequential
'''
def foo():
    time.sleep(0.1)
    print("inside foo()")
    
foo()    
print("print(hello) inside foo")

# foo will run as long as it takes to complete and then only next line will run

'''
Asynchronous programming
- is not sequential
- it is independent of the main program flow
'''

# async programmming employs the concept of coroutines
'''
Corutines:
- computer program components that generalize subroutines for 
non-preemptive multitasking by allowing execution to be suspended and resumed
'''

'''
async keyword creates a wrapper for the function that allows it to be called
asynchronously so it can be suspended and resumed
'''
async def main():          
    print('inside async main()')
    # task is running in non blocking way so print of: finished will be right
    # after first print
    # task will be suspended and waiting for everything else to finish
    print("task = asyncio.create_task(bar('bar()'))")
    task = asyncio.create_task(bar('bar()'))
    print("print task:", task)
    # wait for task to finish
    # await task
    
    await asyncio.sleep(2)
    print('finished')

try:
    print(main())
except RuntimeWarning as rw:
    print(rw)
async def bar(text):
    print(text)
    await asyncio.sleep(1)
asyncio.run(main())

