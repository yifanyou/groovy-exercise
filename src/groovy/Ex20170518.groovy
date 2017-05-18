package groovy

/**
 * 版权：    
 * 创建者:   youyifan
 * 创建时间: 2017/5/9 20:53
 * 功能描述:
 * 修改历史:
 */
class Ex20170518 {
    static void main(args) {
        String baseDir = "D:\\Projects\\github\\yifanyou\\groovy-exercise\\file";

//        def list = new File(baseDir, 'haiku.txt').collect {it}


//      1.2. Writing files
//        new File(baseDir,'haikuw.txt').withWriter('utf-8') { writer ->
//            writer.writeLine 'Into the ancient pond'
//            writer.writeLine 'A frog jumps'
//            writer.writeLine 'Water’s sound!'
//        }

//        new File(baseDir,'haikuw.txt') << '''Into the ancient pond
//        A frog jumps
//        Water’s sound!'''

//        1.4. Data and objects
        def file = new File(baseDir, 'haikuw.txt')


//        boolean b = true
//        String message = 'Hello from Groovy'
//// Serialize data into a file
//        file.withDataOutputStream { out ->
//            out.writeBoolean(b)
//            out.writeUTF(message)
//        }
//// ...
//// Then read it back
//        file.withDataInputStream { input ->
//            assert input.readBoolean() == b
//            assert input.readUTF() == message
//        }

        Person p = new Person(name:'Bob', age:76)
// Serialize data into a file
        file.withObjectOutputStream { out ->
            out.writeObject(p)
        }
// ...
// Then read it back
        file.withObjectInputStream { input ->
            def p2 = input.readObject()
            assert p2.name == p.name
            assert p2.age == p.age
        }


    }
}
