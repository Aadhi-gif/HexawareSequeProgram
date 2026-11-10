# Hexaware Set 3 – Hospital Appointment Desk

Java 8-compatible console programs for all five assignment tasks.

## Project structure
- `Task1_Searching` – 20,000 patient records; linear/binary search and 1,000-lookup benchmark.
- `Task2_Sorting` – urgency + arrival-time ordering; Selection Sort/Quick Sort, swap counts and timings.
- `Task3_DoubleBooking` – duplicate booking prevention using a HashSet and a composite key.
- `Task4_QueueStack` – circular array queue and array stack implemented from scratch.
- `Task5_DynamicProgramming` – maximum-count interval scheduling using DP and greedy comparison.
- `docs` – complexity notes, sorting trace and test results guidance.

## Requirements
JDK 8 or later. Open a terminal in this project folder.

## Compile and run (PowerShell)
Compile and run each task separately. The commands below work from the project root:

### Task 1
```powershell
javac -d Task1_Searching/out Task1_Searching/src/*.java
java -cp Task1_Searching/out SearchComparison
```

### Task 2
```powershell
javac -d Task2_Sorting/out Task2_Sorting/src/*.java
java -cp Task2_Sorting/out SortComparison
```

### Task 3
```powershell
javac -d Task3_DoubleBooking/out Task3_DoubleBooking/src/*.java
java -cp Task3_DoubleBooking/out BookingDemo
```

### Task 4
```powershell
javac -d Task4_QueueStack/out Task4_QueueStack/src/*.java
java -cp Task4_QueueStack/out QueueStackDemo
```

### Task 5
```powershell
javac -d Task5_DynamicProgramming/out Task5_DynamicProgramming/src/*.java
java -cp Task5_DynamicProgramming/out AppointmentSchedulingDemo
```

If PowerShell says a wildcard is not expanded, use `javac -d ... (Get-ChildItem ...\\src\\*.java | ForEach-Object FullName)` or compile from inside the `src` folder using `javac -d ..\\out *.java`.

## Notes
- Search benchmark uses the same 1,000 successful IDs for both algorithms and warms up the JVM first. Timings vary by machine and JVM; do not claim one run is universally representative.
- Binary search receives a sorted copy of the patient records.
- Sorting order: Emergency, High, Medium, Low; ties are ordered by earlier arrival time.
- A duplicate means the same patient ID and same appointment slot. Doctor ID is not part of the key because the assignment says same patient and slot.
- The DP objective is maximum number of non-overlapping appointments (unweighted interval scheduling), not maximum duration or revenue.
- Adjacent appointments are compatible: an appointment ending at 10:00 can be followed by one starting at 10:00.
