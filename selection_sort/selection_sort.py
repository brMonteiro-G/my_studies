#The selection sort algorithm is made up of two nested loops.
#It has an O (n2) time complexity due to the two nested loops.
# n element reads done n times 
# see docs

#Best Case Complexity: occurs when there is no need for sorting, i.e., the array has already been sorted. The time complexity of selection sort in the best-case scenario is O(n2).

#Average Case Complexity: occurs when the array elements are arranged in a jumbled order that is neither ascending nor descending correctly. The selection sort has an average case time complexity of O. (n2).

#Worst-case complexity: occurs when array elements must be sorted in reverse order. Assume you need to sort the array elements in ascending order, but they are in descending order. Selection sort has a worst-case time complexity of O. (n2).

def findSmallest(array): 

    smallest_item = array[0]  
    smallest_index = 0 

    for element_index in range(1, len(array)):
        current_item = array[element_index] 
        
        if(current_item < smallest_item):
            smallest_item=current_item
            smallest_index=element_index

    return smallest_index


my_array = [1,9,32,45,2,36,14,6]
print("Unsorted array", my_array)
new_array=[]

def selectionSort(my_array):

    for element_index in range(len(my_array)):
        smallest=findSmallest(my_array)
        new_array.append(my_array[smallest])
        my_array.pop(smallest)

    return new_array


new_array=selectionSort(my_array)


print("this is the sorted array",new_array)    


