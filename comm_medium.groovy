def amount = 1000

if (amount < 100) {
    print("connect with customer using email")
} else if (amount >= 100 && amount < 500) {
    print("communicate on call")
} else {
    print("Schedule a meeting")
}

int classone = 1
List classtwo = [1,2,3] 
print(classtwo)
print("\n Sze is " )
println(classtwo.size())

class Email {
    String from 
    String to
    Date    createdOn
    String  message

    def displayEmail() {
        println("From: $from \n To: $to \n Date: $createdOn \n message: $message ")
    }
}

Email email = new Email()
email.from = "noreply@gmail.com"
email.to = "support@gmail.com"
email.createdOn = new Date()
email.message = "Hey Buddy, What's your plan for the evening and life"

email.displayEmail()

