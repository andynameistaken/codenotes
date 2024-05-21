
'''
- syntax `async def` introduces either a native coroutine/ **asynchronous
  generator**.
- The keyword `await` passes function control back to the event loop. (It suspends
the execution of the surrounding coroutine.)
- If Python encounters an await `f()` expression in the scope of `g()`, this is
how `await` tells the event loop, “Suspend execution of `g()` until whatever I’m
waiting on—the result of `f()` — is returned. In the meantime, go let something
else run.” 

```py
async def g():
    # Pause here and come back to g() when f() is ready
    r = await f()
    return r
```

- Await Cheat-Sheet

```py
async def f(x):
    y = await z(x)  # OK - `await` and `return` allowed in coroutines
    return y

async def g(x):
    yield x  # OK - this is an async generator

async def m(x):
    yield from gen(x)  # No - SyntaxError

def m(x):
    y = await z(x)  # Still no - SyntaxError (no `async def` here)
    return y
```
'''