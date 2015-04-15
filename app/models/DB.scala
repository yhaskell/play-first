package models

import sorm._

/**
 * Created by yhaskell on 4/15/2015.
 */
object DB extends Instance(entities = Seq(Entity[Person]()), url="jdbc:h2:mem:test")
