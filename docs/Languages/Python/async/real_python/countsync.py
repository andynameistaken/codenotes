#!/bin/env python3

import time

def count():
    print("One")
    time.sleep(1)
    print("Two")

def main():
    for _ in range(3):
        count()

if __name__ == '__main__':
    timer_start = time.perf_counter()
    main()
    timer_stop = time.perf_counter()
    elapsed_time = timer_stop - timer_start
    print(f'{__file__} executed in {elapsed_time:0.2f} seconds')
    
