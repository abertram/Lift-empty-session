package code

import net.liftweb.http.S
import net.liftweb.common.Empty

object Main {

  S.session.foreach(_.sendCometActorMessage("MyCometActor", Empty, ".."))
}