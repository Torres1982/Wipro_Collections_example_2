fun main(args: Array<String>) {
	var numbersList: List<Int?> = listOf(1, 2, 3, 5, null, 7, 8, 13, null, 23, 24, 27, null, 34)

    filterNullValuesAndOddNumbers(numbersList)
}

fun filterNullValuesAndOddNumbers(list: List<Int?>) {
	var filteredList = list.filter{e -> e == null || e % 2 != 0}

    println("Original List:\t${list}")
    println("Filtered List:\t${filteredList}")
}