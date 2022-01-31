# sort-o_Watson_vs_The_Final_Project

TNPG: Watson vs The Final Project (Anjini Katari, Ruby Friedman, Joshua Gao)

APCS pd07

LAB 04

2022-01-10m

time spent: 4.5 hrs

#

SOTW:
  - Under Pressure by Queen
  - Flickers by Son Lux
  - Call To Me by Sharam
  - She Came Along by Sharam

# Bubble Sort
 * Bubble Sort starts from the rightmost value and compares it to the val immediately left of it. If the val to the left is greater it swaps the 2 vals and continues moving down the array to the left while comparing the next 2 vals and swapping if necessary until it gets to last position of the element (which is the first index)
 * Each swappingconstitutes 1 pass until the array is fully sorted, which is when <number of vals in the array-1> passes are achieved.
 * The best case scenerio for Bubble Sort is when the array is already "sorted" meaning that it is in numerical ascending order. This is because no time consuming swaps would need to be made, even though all passes and comparisons are still neccesary.
 * The worst case scenerio for Bubble Sort is when the array is in the "opposite" order, or numerical desending order. This is because almost every single comparision needs to have a swap. In the first pass there will be n swaps where n is the length of the array, then n-1 the next pass and n-2 swaps the one after that, this is the order in which the most possible time consuming swaps occur.
 * The passes and swaps are both O(n) because they increase linearly depending on the size of the array.

# Selection Sort
 * Selection Sort finds the max val in arrayList and moves it to the rightmost position, this constitutes 1 pass. It then continues to repeat this for the second rightmost, third rightmost, and so on, until the array is in numerical ascending order. 
 * The best case scenerio for Selection Sort is when the array is already "sorted" meaning that it is in numerical ascending order. This is because no time consuming swaps would need to be made, even though all passes and comparisons are still neccesary.
 * The worst case scenerio for Selection Sort is when the array is in the "opposite" order, or numerical desending order. This is because again for Selection Sort there is still the most swaps as you have to flip the entire array. 
 * The passes are O(n) and the swaps are O(n) because there is a linear relationship between length of array and number of swaps and passes.
 
# Insertion Sort
 * Our nickname for Insertion Sort is the "Invisible Wall of Parition." The partition doesn't actuallly take up an index since it is invisible, meaning we do not have to shift the indices of the array in any way. 
 * After creating the partition, Insertoin Sorts sort all the elements to the left of (including itself) the index of the invisible partition. This constitutes 1 pass. After each pass the partition is moved over 1 and the values are re-sorted while swapping the new val into place. 
 * The Insertion Sort is completed when the partition is to the right of the rightmost element.
 * The best case scenerio for Insertion Sort is when the array is already "sorted" meaning that it is in numerical ascending order. This is because there are no swaps necessary.
 * The worst case scenerio for Insertion Sort is when the array is in the "opposite" order, or numerical desending order. This is because you must rearrange the entire array and move everything over each time you add another element to the partition.
 * The passes are O(n) and the swaps are O(n) because there is a linear relationship between length of array and number of swaps and passes.

