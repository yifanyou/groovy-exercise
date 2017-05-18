package groovy

/**
 * 版权：
 * 创建者:   youyifan
 * 创建时间: 2017/5/9 20:53
 * 功能描述:
 * 修改历史:
 */
class Ex20170509 {
    static void main(args) {
        String baseDir = "D:\\Projects\\github\\yifanyou\\groovy-exercise\\file";

//        new File(baseDir, 'haiku.txt').eachLine { line ->
//            println line
//        }

        // the method makes sure that the resource is properly closed.
//        new File(baseDir, 'haiku.txt').eachLine { line, nb ->
//            println "Line $nb: $line"
//        }

        def count = 0, MAXSIZE = 3
        new File(baseDir,"haiku.txt").withReader { reader ->
            def str
            while (str = reader.readLine()) {
                println str
                if (++count > MAXSIZE) {
                    throw new RuntimeException('Haiku should only have 3 verses')
                }
            }
        }






    }
}
