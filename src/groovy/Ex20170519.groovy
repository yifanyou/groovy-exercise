package groovy

/**
 * 版权：    
 * 创建者:   youyifan
 * 创建时间: 2017/5/19 20:53
 * 功能描述:
 * 修改历史:
 */
class Ex20170519 {
    static void main(args) {
//        1.5. Executing External Processes
//        def process = "ls -l".execute()
//        println "Found text ${process.text}"

//        def process = "dir".execute()
//        println "${process.text}"

//        def process = "cmd /c dir".execute()
//        println "${process.text}"

        //2.1.1. List literals
//        def list = [5, 6, 7, 8]
//        assert list.get(2) == 7
//        assert list[2] == 7
//        assert list instanceof java.util.List
//
//        def emptyList = []
//        assert emptyList.size() == 0
//        emptyList.add(5)
//        assert emptyList.size() == 1

//        def list1 = ['a', 'b', 'c']
////construct a new list, seeded with the same items as in list1
//        def list2 = new ArrayList<String>(list1)
//        assert list2 == list1 // == checks that each corresponding element is the same
//
//// clone() can also be called
//        def list3 = list1.clone()
//        assert list3 == list1


//        def list = [5, 6, 7, 8]
//        assert list.size() == 4
//        assert list.getClass() == ArrayList     // the specific kind of list being used
//
//        assert list[2] == 7                     // indexing starts at 0
//        assert list.getAt(2) == 7               // equivalent method to subscript operator []
//        assert list.get(2) == 7                 // alternative method
//
//        list[2] = 9
//        assert list == [5, 6, 9, 8,]           // trailing comma OK
//
//        list.putAt(2, 10)                       // equivalent method to [] when value being changed
//        assert list == [5, 6, 10, 8]
//        assert list.set(2, 11) == 10            // alternative method that returns old value
//        assert list == [5, 6, 11, 8]
//
//        assert ['a', 1, 'a', 'a', 2.5, 2.5f, 2.5d, 'hello', 7g, null, 9 as byte]
////objects can be of different types; duplicates allowed
//
//        assert [1, 2, 3, 4, 5][-1] == 5             // use negative indices to count from the end
//        assert [1, 2, 3, 4, 5][-2] == 4
//        assert [1, 2, 3, 4, 5].getAt(-2) == 4       // getAt() available with negative index...
//        try {
//            [1, 2, 3, 4, 5].get(-2)                 // but negative index not allowed with get()
//            assert false
//        } catch (e) {
//            assert e instanceof ArrayIndexOutOfBoundsException
//        }

//        //2.1.2. List as a boolean expression
//        assert ![]             // an empty list evaluates as false
//
////all other lists, irrespective of contents, evaluate as true
//        assert [1] && ['a'] && [0] && [0.0] && [false] && [null]


        //2.1.3. Iterating on a list
//        [1, 2, 3].each {
//            println "Item: $it" // `it` is an implicit parameter corresponding to the current element
//        }
//        ['a', 'b', 'c'].eachWithIndex { it, i -> // `it` is the current element, while `i` is the index
//            println "$i: $it"
//        }

//        assert [1, 2, 3].collect { it * 2 } == [2, 4, 6]
//
//// shortcut syntax instead of collect
//        assert [1, 2, 3]*.multiply(2) == [1, 2, 3].collect { it.multiply(2) }
//
//        def list = [0]
//// it is possible to give `collect` the list which collects the elements
//        assert [1, 2, 3].collect(list) { it * 2 } == [0, 2, 4, 6]
//        assert list == [0, 2, 4, 6]

        //2.1.4. Manipulating lists
        //Filtering and searching
//        assert [1, 2, 3].find { it > 1 } == 2           // find 1st element matching criteria
//        assert [1, 2, 3].findAll { it > 1 } == [2, 3]   // find all elements matching critieria
//        assert ['a', 'b', 'c', 'd', 'e'].findIndexOf {      // find index of 1st element matching criteria
//            it in ['c', 'e', 'g']
//        } == 2
//
//        assert ['a', 'b', 'c', 'd', 'c'].indexOf('c') == 2  // index returned
//        assert ['a', 'b', 'c', 'd', 'c'].indexOf('z') == -1 // index -1 means value not in list
//        assert ['a', 'b', 'c', 'd', 'c'].lastIndexOf('c') == 4
//
//        assert [1, 2, 3].every { it < 5 }               // returns true if all elements match the predicate
//        assert ![1, 2, 3].every { it < 3 }
//        assert [1, 2, 3].any { it > 2 }                 // returns true if any element matches the predicate
//        assert ![1, 2, 3].any { it > 3 }
//
//        assert [1, 2, 3, 4, 5, 6].sum() == 21                // sum anything with a plus() method
//        assert ['a', 'b', 'c', 'd', 'e'].sum {
//            it == 'a' ? 1 : it == 'b' ? 2 : it == 'c' ? 3 : it == 'd' ? 4 : it == 'e' ? 5 : 0
//            // custom value to use in sum
//        } == 15
//        assert ['a', 'b', 'c', 'd', 'e'].sum { ((char) it) - ((char) 'a') } == 10
//        assert ['a', 'b', 'c', 'd', 'e'].sum() == 'abcde'
//        assert [['a', 'b'], ['c', 'd']].sum() == ['a', 'b', 'c', 'd']
//
//// an initial value can be provided
//        assert [].sum(1000) == 1000
//        assert [1, 2, 3].sum(1000) == 1006
//
//        assert [1, 2, 3].join('-') == '1-2-3'           // String joining
//        assert [1, 2, 3].inject('counting: ') {
//            str, item -> str + item                     // reduce operation
//        } == 'counting: 123'
//        assert [1, 2, 3].inject(0) { count, item ->
//            count + item
//        } == 6

//        def list = [9, 4, 2, 10, 5]
//        assert list.max() == 10
//        assert list.min() == 2
//
//// we can also compare single characters, as anything comparable
//        assert ['x', 'y', 'a', 'z'].min() == 'a'
//
//// we can use a closure to specify the sorting behaviour
//        def list2 = ['abc', 'z', 'xyzuvw', 'Hello', '321']
//        assert list2.max { it.size() } == 'xyzuvw'
//        assert list2.min { it.size() } == 'z'

//        Comparator mc = { a, b -> a == b ? 0 : (a < b ? -1 : 1) }
//
//        def list = [7, 4, 9, -6, -1, 11, 2, 3, -9, 5, -13]
//        assert list.max(mc) == 11
//        assert list.min(mc) == -13
//
//        Comparator mc2 = { a, b -> a == b ? 0 : (Math.abs(a) < Math.abs(b)) ? -1 : 1 }
//
//
//        assert list.max(mc2) == -13
//        assert list.min(mc2) == -1
//
//        assert list.max { a, b -> a.equals(b) ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1 } == -13
//        assert list.min { a, b -> a.equals(b) ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1 } == -1


        //Adding or removing elements
//        def list = []
//        assert list.empty
//
//        list << 5
//        assert list.size() == 1
//
//        list << 7 << 'i' << 11
//        assert list == [5, 7, 'i', 11]
//
//        list << ['m', 'o']
//        assert list == [5, 7, 'i', 11, ['m', 'o']]
//
////first item in chain of << is target list
//        assert ([1, 2] << 3 << [4, 5] << 6) == [1, 2, 3, [4, 5], 6]
//
////using leftShift is equivalent to using <<
//        assert ([1, 2, 3] << 4) == ([1, 2, 3].leftShift(4))


//        assert [1, 2] + 3 + [4, 5] + 6 == [1, 2, 3, 4, 5, 6]
//// equivalent to calling the `plus` method
//        assert [1, 2].plus(3).plus([4, 5]).plus(6) == [1, 2, 3, 4, 5, 6]
//
//        def a = [1, 2, 3]
//        a += 4      // creates a new list and assigns it to `a`
//        a += [5, 6]
//        assert a == [1, 2, 3, 4, 5, 6]
//
//        assert [1, *[222, 333], 456] == [1, 222, 333, 456]
//        assert [*[1, 2, 3]] == [1, 2, 3]
//        assert [1, [2, 3, [4, 5], 6], 7, [8, 9]].flatten() == [1, 2, 3, 4, 5, 6, 7, 8, 9]
//
//        def list = [1, 2]
//        list.add(3)
//        list.addAll([5, 4])
//        assert list == [1, 2, 3, 5, 4]
//
//        list = [1, 2]
//        list.add(1, 3) // add 3 just before index 1
//        assert list == [1, 3, 2]
//
//        list.addAll(2, [5, 4]) //add [5,4] just before index 2
//        assert list == [1, 3, 5, 4, 2]
//
//        list = ['a', 'b', 'z', 'e', 'u', 'v', 'g']
//        list[8] = 'x' // the [] operator is growing the list as needed
//// nulls inserted if required
//        assert list == ['a', 'b', 'z', 'e', 'u', 'v', 'g', null, 'x']


//        assert ['a','b','c','b','b'] - 'c' == ['a','b','b','b']
//        assert ['a','b','c','b','b'] - 'b' == ['a','c']
//        assert ['a','b','c','b','b'] - ['b','c'] == ['a']
//
//        def list = [1,2,3,4,3,2,1]
//        list -= 3           // creates a new list by removing `3` from the original one
//        assert list == [1,2,4,2,1]
//        assert ( list -= [2,4] ) == [1,1]

//        def list = [1,2,3,4,5,6,2,2,1]
//        assert list.remove(2) == 3          // remove the third element, and return it
//        assert list == [1,2,4,5,6,2,2,1]

//        def list= ['a','b','c','b','b']
//        assert list.remove('c')             // remove 'c', and return true because element removed
//        assert list.remove('b')             // remove first 'b', and return true because element removed
//
//        assert ! list.remove('z')           // return false because no elements removed
//        assert list == ['a','b','b']

//        def list= ['a',2,'c',4]
//        list.clear()
//        assert list == []

        //Set operations
//        assert 'a' in ['a','b','c']             // returns true if an element belongs to the list
//        assert ['a','b','c'].contains('a')      // equivalent to the `contains` method in Java
//        assert [1,3,4].containsAll([1,4])       // `containsAll` will check that all elements are found
//
//        assert [1,2,3,3,3,3,4,5].count(3) == 4  // count the number of elements which have some value
//        assert [1,2,3,3,3,3,4,5].count {
//            it%2==0                             // count the number of elements which match the predicate
//        } == 2
//
//        assert [1,2,4,6,8,10,12].intersect([1,3,6,9,12]) == [1,6,12]
//
//        assert [1,2,3].disjoint( [4,6,9] )
//        assert ![1,2,3].disjoint( [2,4,6] )


        //Sorting
//        assert [6, 3, 9, 2, 7, 1, 5].sort() == [1, 2, 3, 5, 6, 7, 9]
//
//        def list = ['abc', 'z', 'xyzuvw', 'Hello', '321']
//        assert list.sort {
//            it.size()
//        } == ['z', 'abc', '321', 'Hello', 'xyzuvw']
//
//        def list2 = [7, 4, -6, -1, 11, 2, 3, -9, 5, -13]
//        assert list2.sort { a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1 } ==
//                [-1, 2, 3, 4, 5, -6, 7, -9, 11, -13]
//
//        Comparator mc = { a, b -> a == b ? 0 : Math.abs(a) < Math.abs(b) ? -1 : 1 }
//
//// JDK 8+ only
//// list2.sort(mc)
//// assert list2 == [-1, 2, 3, 4, 5, -6, 7, -9, 11, -13]
//
//        def list3 = [6, -3, 9, 2, -7, 1, 5]
//
//        Collections.sort(list3)
//        assert list3 == [-7, -3, 1, 2, 5, 6, 9]
//
//        Collections.sort(list3, mc)
//        assert list3 == [1, 2, -3, 5, 6, -7, 9]


        //Duplicating elements
//        assert [1, 2, 3] * 3 == [1, 2, 3, 1, 2, 3, 1, 2, 3]
//        assert [1, 2, 3].multiply(2) == [1, 2, 3, 1, 2, 3]
//        assert Collections.nCopies(3, 'b') == ['b', 'b', 'b']
//
//// nCopies from the JDK has different semantics than multiply for lists
//        assert Collections.nCopies(2, [1, 2]) == [[1, 2], [1, 2]] //not [1,2,1,2]










    }
}
