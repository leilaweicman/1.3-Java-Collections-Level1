# 1.3-Java-Collections-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a class called `Month` with an attribute `name` (to store the name of the month of the year).  
Add 11 `Month` objects into an `ArrayList` (all except *August*). Then insert *August* in the correct position and show that the `ArrayList` maintains the correct order.

Convert the `ArrayList` into a `HashSet` and ensure that no duplicates are allowed.

Finally, iterate over the list using a **for-each loop** and an **Iterator**.

---

### Exercise 2
1. Create and fill a `List<Integer>`.
2. Create a second `List<Integer>` and insert the elements of the first one in reverse order.
3. Use a `ListIterator` to read the elements of the first list and insert them into the second in reverse order.

---

### Exercise 3
Given a file `countries.txt` that contains countries and capitals separated by a space, the program should:

1. Read the file and store the data in a `HashMap<String, String>`.
2. Ask the user for their username.
3. Show a random country from the `HashMap` and ask the user to type the capital.
    - If the answer is correct → +1 point.
    - Repeat this process 10 times with different random countries.
4. After 10 rounds, save the username and score into a file called `classification.txt`.

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.3-Java-Collections-Level1.git
cd 1.3-Java-Collections-Level1
```

---

## ▶️ Execution

### Exercise 1

1. Open Main.java in the Exercise1 package.
2. Run the main() method.
3. Expected console output:

```sh
ArrayList without August: [January, February, March, April, May, June, July, September, October, November, December]
ArrayList in order: [January, February, March, April, May, June, July, August, September, October, November, December]
HashSet before adding a duplicate: [June, October, December, May, September, March, July, January, February, April, August, November]
Added duplicate? false
HashSet with no duplicates: [June, October, December, May, September, March, July, January, February, April, August, November]
For-each: 
June
October
December
May
September
March
July
January
February
April
August
November
Iterator: January February March April May June July August September October November December 
```

### Exercise 2

1. Open Main.java in the Exercise1 package.
2. Run the main() method.
3. Expected console output:

```sh
Original list: [1, 2, 3, 4, 5]
Reversed list: [5, 4, 3, 2, 1]
```

### Exercise 3

1. Make sure `resources/countries.txt` exists with countries and capitals.
2. Open Main.java in the Exercise1 package.
3. Run the main() method.
4. Expected console interaction:

```sh
Enter your username: 
John
Which is the capital of Spain? 
Madrid
Correct!
Your points: 1

Which is the capital of France? 
Berlin
Wrong. Correct answer: Paris
Your points: 1
...
Score saved to classification.txt

```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
