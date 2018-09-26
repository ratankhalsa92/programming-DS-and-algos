# Question - Write some code, that will flatten an array of arbitrarily nested arrays of integers into
# a flat array of integers. e.g. [[1,2,[3]],4] -> [1,2,3,4].


def flattenArray(myList):						# Method for flattening a given array
    flatList = []

    def makeFlatList(someList):
        for element in someList:
            if type(element) == list:
                makeFlatList(element)
            else:
                flatList.append(element)

    makeFlatList(myList)
    return flatList


if __name__ == '__main__':
    myList1 = [[1, 2, [3]], 4]
    myList2 = [1, [2, 3], [[4, 5, 6]]]
    myList3 = ['ratan', 'david', ['kevin', 'josh']]
    myList4 = [['@', 2], ['python', [-9999]]]

    print(flattenArray(myList1))  				# Works for different types of nested arrays