package userbl

class User {

    def static username
    def static password

    static constraints = {
        username (unique: true, nullable: false)
        password (unique: true, nullable: false)
    }
}
