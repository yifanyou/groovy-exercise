package groovy

import java.beans.PropertyChangeListener

/**
 * 版权：
 * 创建者:   youyifan
 * 创建时间: 2017/5/23 10:07
 * 功能描述:
 * 修改历史:
 */
class Ex20170523 {
    static void main(args) {
//        def slurper = new ConfigSlurper()
//        slurper.registerConditionalBlock('myProject', 'developers')
//
//        def config = slurper.parse('''
//  sendMail = true
//
//  myProject {
//       developers {
//           sendMail = false
//       }
//  }
//''')
//
//        assert !config.sendMail

//        def config = new ConfigSlurper().parse('''
//    app.date = new Date()
//    app.age  = 42
//    app {
//        name = "Test${42}"
//    }
//''')
//
//        def properties = config.toProperties()
//
//        assert properties."app.date" instanceof String
//        assert properties."app.age" == '42'
//        assert properties."app.name" == 'Test42'

        //3.2. Expando
//        def expando = new Expando()
//        expando.name = 'John'
//
//        assert expando.name == 'John'

//        def expando = new Expando()
//        expando.toString = { -> 'John' }
//        expando.say = { String s -> "John says: ${s}" }
//
//        assert expando as String == 'John'
//        assert expando.say('Hi') == 'John says: Hi'

//        3.3. Observable list, map and set
//        def event
//        def listener = {
//            if (it instanceof ObservableList.ElementEvent)  {
//                event = it
//            }
//        } as PropertyChangeListener


//        def observable = [1, 2, 3] as ObservableList
//        observable.addPropertyChangeListener(listener)
//
//        observable.add 42
//
//        assert event instanceof ObservableList.ElementAddedEvent
//
//        def elementAddedEvent = event as ObservableList.ElementAddedEvent
//        assert elementAddedEvent.changeType == ObservableList.ChangeType.ADDED
//        assert elementAddedEvent.index == 3
//        assert elementAddedEvent.oldValue == null
//        assert elementAddedEvent.newValue == 42
//
        def event
        def listener = {
            if (it instanceof ObservableList.ElementEvent)  {
                event = it
            }
        } as PropertyChangeListener


        def observable = [1, 2, 3] as ObservableList
        observable.addPropertyChangeListener(listener)

        observable.clear()

        assert event instanceof ObservableList.ElementClearedEvent

        def elementClearedEvent = event as ObservableList.ElementClearedEvent
        assert elementClearedEvent.values == [1, 2, 3]
        assert observable.size() == 0
    }
}
