Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
What worked, what didn't, what advice would you give someone taking this course in the future?

I think it is really cool that you can test the functionality of the methodd in your code without having to run something in main. This assignment taught me that even little mistakes can break an entire method, such as using '==' instead of .equals() for comparisons. One thing that felt a little bit limiting was the fact that you could only write tests that failed. There were some times when I thought of a test to check for a bug but it revealed the bug when that test was passed, so I had to rewrite it in a way for the test to fail to reveal the bug. One thing that helped me think of tests to do was looking at the javadoc comments. The tests that I ended up doing were:

- testComputerConstructorPrice() tests that the Computer constructor uses the given price argument to create the Computer object. A Computer object is created with all of the attributes and then the expected price of the Computer is checked against the actual price of the Computer to see if they are equal. This test failed because the Computer constructor assigns '0' as the price for every Computer, instead of using the inputted price, so the expected and actual values did not equal.

- testComputerConstructorMemory() tests that the Computer constructor uses the given memory argument to create the Computer object. A Computer object is created with all of the attributes and then the expected memory of the Computer is checked against the actual memory of the Computer to see if they are equal. This test failed because the Computer constructor assigns '16' as the memory for every Computer, instead of using the inputted memory, so the expected and actual values did not equal.

- testSetOS() tests that the setOS method sets the OS variable to the given OS. A Computer object is created, and the setOS method is called. The expected OS of the Computer is compared to the actual OS of the Computer to see if they are equal. This test failed because the setOS method assigns 'None' to the OS of the Computer instead of the given OS, so the expected and actual values did not equal.

- testBuy() tests that the buy method adds the given computer to the shop's inventory. A ResaleShop and Computer object are created. Then, the buy method is called, and the test checks to see if the shop's inventory now contains the added Computer. This test failed because the buy method adds a completely different Computer to the inventory instead of the one that was passed into the method, so the inputted Computer object was not found to be contained in the inventory.

- testBuyException() tests that the buy method throws an Exception when a computer is already in the inventory. A ResaleShop and a duplicate Computer object are created, and the duplicate Computer object is added to the inventory to see if an exception would be thrown. This test failed because no exceptions were thrown.

- testSellException() tests that the sell method throws an Exception when the computer is not in the inventory. A ResaleShop is created and and the shop tries to sell a Computer that is not in the store's inventory to see if an exeception would be thrown. This test failed because no exception was thrown.

- testPrintInventory() tests if the printInventory method throws an exception when printing the inventory. A ResaleShop object is created and the test tries to print out the inventory of the store. However, in the printInventory method, the loop tries to access an index that does not exist. So, this test catches the error and fails if the inventory cannot be printed. This test failed because it could not print the inventory due to this error. 

- testRefurbishOS() tests that the refurbish method updates the OS. A ResaleShop and Computer object are created, and the shop tries to refurbish the Computer with a new OS. The test checks if the expected OS is equal to the actual OS of the computer after the refurbish method has been run. This test failed because the two values were not equal, and the refurbish method was unsuccessful in updating the Computer's OS.

- testToString() tests that the toString method returns the correct stats in the string for the computer. A Computer object is created and the test checks if the expected String for the Computer is equal to the actual String that is returned. This test failed because the two Strings were not equal, although this is mainly due to the error in the Computer constructor.

- testRefurbishException() tests that the refurbish method throws an exception if the Computer is not in the inventory. A ResaleShop and Computer are created, and the refurbish method is run with the Computer that has not been added to the inventory yet. The refurbish method correctly throws an exception. 