package groovy

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   youyifan
 * 创建时间: 2017/5/22 10:46
 * 功能描述:
 * 修改历史:
 */
class Ex20170522 {
    static void main(args) {
//        2.2. Maps
//        2.2.1. Map literals
//        def map = [name: 'Gromit', likes: 'cheese', id: 1234]
//        assert map.get('name') == 'Gromit'
//        assert map.get('id') == 1234
//        assert map['name'] == 'Gromit'
//        assert map['id'] == 1234
//        assert map instanceof java.util.Map
//
//        def emptyMap = [:]
//        assert emptyMap.size() == 0
//        emptyMap.put("foo", 5)
//        assert emptyMap.size() == 1
//        assert emptyMap.get("foo") == 5

//        def a = 'Bob'
//        def ages = [a: 43]
//        assert ages['Bob'] == null // `Bob` is not found
//        assert ages['a'] == 43     // because `a` is a literal!
//
//        ages = [(a): 43]            // now we escape `a` by using parenthesis
//        assert ages['Bob'] == 43   // and the value is found!

//        def map = [
//                simple : 123,
//                complex: [a: 1, b: 2]
//        ]
//        def map2 = map.clone()
//        assert map2.get('simple') == map.get('simple')
//        assert map2.get('complex') == map.get('complex')
//        map2.get('complex').put('c', 3)
//        assert map.get('complex').get('c') == 3

//        2.2.2. Map property notation
//        def map = [name: 'Gromit', likes: 'cheese', id: 1234]
//        assert map.name == 'Gromit'     // can be used instead of map.get('name')
//        assert map.id == 1234
//
//        def emptyMap = [:]
//        assert emptyMap.size() == 0
//        emptyMap.foo = 5
//        assert emptyMap.size() == 1
//        assert emptyMap.foo == 5

//        def map = [name: 'Gromit', likes: 'cheese', id: 1234]
//        assert map.class == null
//        assert map.get('class') == null
//        assert map.getClass() == LinkedHashMap // this is probably what you want
//
//        map = [1      : 'a',
//               (true) : 'p',
//               (false): 'q',
//               (null) : 'x',
//               'null' : 'z']
//        assert map.containsKey(1) // 1 is not an identifier so used as is
//        assert map.true == null
//        assert map.false == null
//        assert map.get(true) == 'p'
//        assert map.get(false) == 'q'
//        assert map.null == 'z'
//        assert map.get(null) == 'x'

//        2.2.3. Iterating on maps
//        def map = [
//                Bob  : 42,
//                Alice: 54,
//                Max  : 33
//        ]
//
//// `entry` is a map entry
//        map.each { entry ->
//            println "Name: $entry.key Age: $entry.value"
//        }
//
//// `entry` is a map entry, `i` the index in the map
//        map.eachWithIndex { entry, i ->
//            println "$i - Name: $entry.key Age: $entry.value"
//        }
//
//// Alternatively you can use key and value directly
//        map.each { key, value ->
//            println "Name: $key Age: $value"
//        }
//
//// Key, value and i as the index in the map
//        map.eachWithIndex { key, value, i ->
//            println "$i - Name: $key Age: $value"
//        }

//        2.2.4. Manipulating maps
//        Adding or removing elements
//        def defaults = [1: 'a', 2: 'b', 3: 'c', 4: 'd']
//        def overrides = [2: 'z', 5: 'x', 13: 'x']
//
//        def result = new LinkedHashMap(defaults)
//        result.put(15, 't')
//        result[17] = 'u'
//        result.putAll(overrides)
//        assert result == [1: 'a', 2: 'z', 3: 'c', 4: 'd', 5: 'x', 13: 'x', 15: 't', 17: 'u']

//        def m = [1:'a', 2:'b']
//        assert m.get(1) == 'a'
//        m.clear()
//        assert m == [:]

//        def key = 'some key'
//        def map = [:]
//        def gstringKey = "${key.toUpperCase()}"
//        map.put(gstringKey,'value')
//        assert map.get('SOME KEY') == null

//        Keys, values and entries
//        def map = [1:'a', 2:'b', 3:'c']
//
//        def entries = map.entrySet()
//        entries.each { entry ->
//            assert entry.key in [1,2,3]
//            assert entry.value in ['a','b','c']
//        }
//
//        def keys = map.keySet()
//        assert keys == [1,2,3] as Set

//        Filtering and searching
//        def people = [
//                1: [name:'Bob', age: 32, gender: 'M'],
//                2: [name:'Johnny', age: 36, gender: 'M'],
//                3: [name:'Claire', age: 21, gender: 'F'],
//                4: [name:'Amy', age: 54, gender:'F']
//        ]
//
//        def bob = people.find { it.value.name == 'Bob' } // find a single entry
//        def females = people.findAll { it.value.gender == 'F' }
//
//// both return entries, but you can use collect to retrieve the ages for example
//        def ageOfBob = bob.value.age
//        def agesOfFemales = females.collect {
//            it.value.age
//        }
//
//        assert ageOfBob == 32
//        assert agesOfFemales == [21,54]
//
//// but you could also use a key/pair value as the parameters of the closures
//        def agesOfMales = people.findAll { id, person ->
//            person.gender == 'M'
//        }.collect { id, person ->
//            person.age
//        }
//        assert agesOfMales == [32, 36]
//
//// `every` returns true if all entries match the predicate
//        assert people.every { id, person ->
//            person.age > 18
//        }
//
//// `any` returns true if any entry matches the predicate
//
//        assert people.any { id, person ->
//            person.age == 54
//        }

//        Grouping
//        assert ['a', 7, 'b', [2, 3]].groupBy {
//            it.class
//        } == [(String)   : ['a', 'b'],
//              (Integer)  : [7],
//              (ArrayList): [[2, 3]]
//        ]
//
//        assert [
//                [name: 'Clark', city: 'London'], [name: 'Sharma', city: 'London'],
//                [name: 'Maradona', city: 'LA'], [name: 'Zhang', city: 'HK'],
//                [name: 'Ali', city: 'HK'], [name: 'Liu', city: 'HK'],
//        ].groupBy { it.city } == [
//                London: [[name: 'Clark', city: 'London'],
//                         [name: 'Sharma', city: 'London']],
//                LA    : [[name: 'Maradona', city: 'LA']],
//                HK    : [[name: 'Zhang', city: 'HK'],
//                         [name: 'Ali', city: 'HK'],
//                         [name: 'Liu', city: 'HK']],
//        ]
//

//        2.3. Ranges
//// an inclusive range
//        def range = 5..8
//        assert range.size() == 4
//        assert range.get(2) == 7
//        assert range[2] == 7
//        assert range instanceof java.util.List
//        assert range.contains(5)
//        assert range.contains(8)
//
//// lets use a half-open range
//        range = 5..<8
//        assert range.size() == 3
//        assert range.get(2) == 7
//        assert range[2] == 7
//        assert range instanceof java.util.List
//        assert range.contains(5)
//        assert !range.contains(8)
//
////get the end points of the range without using indexes
//        range = 1..10
//        assert range.from == 1
//        assert range.to == 10
//
//    }

        // an inclusive range
//        def range = 'a'..'d'
//        assert range.size() == 4
//        assert range.get(2) == 'c'
//        assert range[2] == 'c'
//        assert range instanceof java.util.List
//        assert range.contains('a')
//        assert range.contains('d')
//        assert !range.contains('e')

//        for (i in 1..10) {
//            println "Hello ${i}"
//        }
//
//        (1..10).each { i ->
//            println "Hello ${i}"
//        }

//        switch (years) {
//            case 1..10: interestRate = 0.076; break;
//            case 11..25: interestRate = 0.052; break;
//            default: interestRate = 0.037;
//        }

//        2.4. Syntax enhancements for collections
//
//        2.4.1. GPath support
        def listOfMaps = [['a': 11, 'b': 12], ['a': 21, 'b': 22]]
        assert listOfMaps.a == [11, 21] //GPath notation
        assert listOfMaps*.a == [11, 21] //spread dot notation

        listOfMaps = [['a': 11, 'b': 12], ['a': 21, 'b': 22], null]
        assert listOfMaps*.a == [11, 21, null] // caters for null values
        assert listOfMaps*.a == listOfMaps.collect { it?.a } //equivalent notation
// But this will only collect non-null values
        assert listOfMaps.a == [11,21]












    }
}
