package models

import play.api.libs.json.Json

/**
 * Created by yhaskell on 4/15/2015.
 */
case class Person(name:String)

object Person {
  implicit val personFormat = Json.format[Person]
}
