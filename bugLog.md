## Bug 1
-Brief description: The Computer constructor does not use the argument for price to create the computer object.  
Failed unit test: testComputerConstructorPrice()

## Bug 2
-Brief description: The Computer constructor does not use the argument for memory to create the computer object.  
Failed unit test: testComputerConstructorMemory()

## Bug 3
-Brief description: The setOS method does not set the OS to the given OS.
Failed unit test: testSetOS()

## Bug 4
-Brief description: The buy method does not add the given Computer to inventory. 
Failed unit test: testBuy()

## Bug 5
-Brief description: The buy method does not throw an Exception when a computer is already in the inventory.
Failed unit test: testBuyException()

## Bug 6
-Brief description: The sell method does not throw an Exception when the computer is not in the inventory.
Failed unit test: testSellException()

## Bug 7
-Brief description: The printInventory method threw an exception when it was not supposed to.
Failed unit test: testPrintInventory()

## Bug 8
-Brief description:  The refurbish method does not update the OS.
Failed unit test: testRefurbishOS()

## Bug 9
Brief description: The refurbish method does not assign a higher price to older computers and a lower price to newer computers.
Failed unit test: testRefurbishprice()

## Bug 10
Brief description: The resaleshop constructor creates a shop with an extra computer, so it does not have the expected inventory size. 
Failed unit test: testResaleShopInv()