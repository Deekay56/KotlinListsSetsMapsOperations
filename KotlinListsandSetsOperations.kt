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
    
    println("3. An empty mutable list that can take ANY values.")
    println()
    
    val  myEmptyList = mutableListOf<Any?>()
    
    println(myEmptyList)
    
    myEmptyList.add(5)
    myEmptyList.add(76)
    myEmptyList.add("Jool")
    myEmptyList.add(56)
    
    println(myEmptyList)
    println()
    
    println("4. An empty mutable list and set that can only take STRINGS.")
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
    
    //the following piece of code adds all the elements in the list and adds them to the set
    //in this case, some elements in the list repeat (see "Yellow"), and hence the duplicates will not be taken in the set
    for(uniqueColor in colorList){
        colorSet.add(uniqueColor)
    }
    
    println(colorSet)
    println()
    
    println("5. An mutable map and its operations.")
    println() 
    
    val myMap = mutableMapOf("33" to "34", 5 to "Blooper", "Faze" to 34, 56 to 78)
    
    println(myMap)
    
    var findValueOfKey = myMap["33"] //in maps, to find the value, you need to speficy the key element. in this case key "33" gives the value "34"
    var findValueOfKey2 = myMap["Faze"]
    
    println(findValueOfKey)
    println(findValueOfKey2)
    
    var mapKeys = myMap.keys
    var mapValues = myMap.values
    
    println(mapKeys)
    println(mapValues)
    
    //reassign the value of a key-value pair using the key
    myMap["Faze"] = 60
    
    println(myMap)
    
    //adding key-value pairs to the map
    myMap.put(2, 100)
    myMap.put(56, 78) //as with sets, this entry will not be added since there exists already a similar one in the map
    myMap.put("Sekta", 666)
    myMap.put("Jool", "Spot")
    
    println(myMap)
    
    //to remove any key-value pair in the map, you need to remove the key with the remove() function
    myMap.remove("Jool")
    
    println(myMap)
    
    //to find if an element exists in the map, you can use the containsKey() or containsValue() functions
    
    var hasKey = myMap.containsKey(2)
    var hasValue = myMap.containsValue(667)    
    
    println(hasKey)
    println(hasValue)
         
      
}
