	## Conflict resolution




### Delete / Edit

- 3 Devices connected to the Internet

```
Remote: -
	+Device_1
	+Device_2
	+Device_3
```
- Device_1 creates `file.txt` (`Device_1: timestamp 1`)
- Device_1 pushes change to git and rest sync it up:
```
Remote: file.txt (Device_1: timestamp 1)

	+ Device_1: file.txt (Device_1: timestamp 1)
	+ Device_2: file.txt (Device_1: timestamp 1)
	+ Device_3: file.txt (Device_1: timestamp 1)
```
- Device_2 and Device_3 are disconnected from the Internet:
```
Remote: file.txt (Device_1: timestamp 1)
	+ Device_1: file.txt (Device_1: timestamp 1)
	- Device_2: file.txt (Device_1: timestamp 1)
	- Device_3: file.txt (Device_1: timestamp 1)
```
- Device_1 deletes file
```
Remote:         -
	+ Device_1: -
	- Device_2: file.txt (Device_1: timestamp 1)
	- Device_3: file.txt (Device_1: timestamp 1)
```

- Device_2 and Device_3 are making changes to the file:
```
Remote:         -
	+ Device_1: -
	- Device_2: file.txt (Device_2: timestamp 2)
	- Device_3: file.txt (Device_3: timestamp 3)
```
- Device 2 is connected to the Internet
```
Remote:         -
	+ Device_1: -
	+ Device_2: file.txt (Device_2: timestamp 2)
	- Device_3: file.txt (Device_3: timestamp 3)
```


##### Possible Resolutions

A) `Resurrect First Online`
Assume that if user edited the deleted file, deletion not was not intentional.

```
```

```

Remote:         file.txt (Device_2: timestamp 2)
	+ Device_1: file.txt (Device_2: timestamp 2)
	+ Device_2: file.txt (Device_2: timestamp 2)
	+ Device_3: file.txt (Device_2: timestamp 2)
```
- **now if newly connected device has files with the same names and differing text in the same lines, it will be treated as Edit/Edit conflict** 





B) `choose-forget`
 - Inform user about Delete/Edit conflict and allow for choosing if keep edit or delete it. 
 - If file has been restored it will be treated as most recent change and every other device will sync up to it. 
C)   `choose-remember [only-later=true]`
- If Delete/Edit conflict occurs inform the user and provide choice if keep the file
- If other device 
- if 
```
Device_2 appears with con
```