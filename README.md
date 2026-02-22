# HashSet without Exact Duplicates

Educational Java project to practice **equals()** and **hashCode()** overriding for custom objects in a `HashSet`.

## Objective

- Create a `Restaurant` class with two attributes: `name` (String) and `rating` (int)
- Override `equals()` and `hashCode()` correctly so that:
    - Restaurants with **same name AND same rating** are considered duplicates
    - Restaurants with **same name but different rating** are **allowed** (not duplicates)
- Demonstrate that `HashSet` automatically prevents exact duplicates

## Key Learning Points

- How `HashSet` uses `hashCode()` + `equals()` to detect duplicates
- Correct implementation of `equals()` and `hashCode()` (must be consistent)
- Difference between identity (`==`) and logical equality (`equals()`)

## Project Structure
```text
src/
├── Restaurant.java      # Class with overridden equals() & hashCode()
└── Main.java            # Demonstration with HashSet
```
## How to Run

```bash
javac src/*.java
java -cp src Main
```

## Expected Output (example)
```text
textAdding restaurants to HashSet...

Added: Italian Bistro (8)
Added: Italian Bistro (9)    ← allowed (different rating)
Added: Sushi Zen (7)
Added: Italian Bistro (8)    ← duplicate → NOT added

Final set size: 3
Contents:
Italian Bistro (8)
Italian Bistro (9)
Sushi Zen (7)
```