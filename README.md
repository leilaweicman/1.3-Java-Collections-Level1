# 1.3-Java-Collections-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a class called `Month` with an attribute `name` (to store the name of the month of the year).  
Add 11 `Month` objects into an `ArrayList` (all except *August*). Then insert *August* in the correct position and show that the `ArrayList` maintains the correct order.

Convert the `ArrayList` into a `HashSet` and ensure that no duplicates are allowed.

Finally, iterate over the list using a **for-each loop** and an **Iterator**.

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
