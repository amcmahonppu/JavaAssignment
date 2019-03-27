import UIKit

var firstName = "Alex"
var lastName = "McMahon"
var suffix = " III"
var fullName = firstName + " " + lastName
fullName.append(suffix)

var tvShow = "game of thrones"
tvShow = tvShow.capitalized

var movie = "I AM NUMBER FOUR"

movie = movie.capitalized

var statement = "Lance will ask another question"

if statement.contains("Sammy") || statement.contains("Pittsburgh"){
    print("Sorry students")
}else{
    print("Sorry the keywords were not located")
}

statement.replacingOccurrences(of: "Lance", with: "Sammy")	
