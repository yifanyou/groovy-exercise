package groovy

/**
 * 版权：
 * 创建者:   youyifan
 * 创建时间: 2017/5/18 21:05
 * 功能描述:
 * 修改历史:
 */
class Person implements Serializable {
    def name
    def age

    def getName() {
        return name
    }

    void setName(name) {
        this.name = name
    }

    def getAge() {
        return age
    }

    void setAge(age) {
        this.age = age
    }
}
