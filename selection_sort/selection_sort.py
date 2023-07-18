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
new_array=[]

def selectionSort(my_array):

    for element_index in range(len(my_array)):
        smallest=findSmallest(my_array)
        new_array.append(my_array[smallest])
        my_array.pop(smallest)

    return new_array


new_array=selectionSort(my_array)

for i in  range(len(new_array)):
    print(new_array[i])    


