fun main() {
   
    println("1. A mutable list and its operations.")
    println()
    
    val  myList = mutableListOf("Abel", 78, "67", "Jane")
    
    println(myList)
    
    var checkListElement = myList[2]
    
    println(checkListElement)
    
    myList.add("Jake")
    myList.add("Tom")
    myList.add(56)
    
    
    println(myList)
    
    println(myList.size)
    
    println(myList[myList.size-1])
    println()
    
    var clearList = myList.clear()
    println(myList)
    println()
    
    
    println("2. A mutable set and its operations.")
    println()
    
    val mySet = mutableSetOf("56", 67, "April", 8, "Charlie")
    
    println(mySet)
    
    mySet.add("Kim")
    mySet.remove(8)
    mySet.add("Jenga")
    mySet.add("Kim") //will not be outputed
    
    println(mySet)
    
    var checkSetElement = mySet.elementAtOrNull(4)
    
    println(checkSetElement)
    
    println(mySet.first())
    println(mySet.last())
    
    var clearSet = mySet.clear()
    println(mySet)
    println()
    
    println("3. An empty mutable list and set containing STRINGS.")
    println()
    
    var colorList = mutableListOf<String>()
    var colorSet = mutableSetOf<String>()
    
    println(colorList)
    println(colorSet)
    
    colorList.add("Blue") //you cannot add more than one element in the same function for lists
    colorList.add("Yellow")
    colorList.add("Yellow")
    colorList.add("Yellow")
    colorList.add("Pink")
    
    colorSet.add("Red") //you cannot add more than one element in the same function for sets
    colorSet.add("Orange")
    colorSet.add("Red")//will not be added since its a duplicate
    //colorSet.add(7) //this will not work since the set takes only STRING elements
   
    
    println(colorList)
    println(colorSet)
    
    //the follwing piece of code adds all the elements in the list and adds them to the set
    //in this case, some elements in the list repeat (see "Yellow"), and hence the duplicates will not be taken in the set
    for(uniqueColor in colorList){
        colorSet.add(uniqueColor)
    }
    
    println(colorSet)   
      
      
}
