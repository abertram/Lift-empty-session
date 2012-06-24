package code.comet

import net.liftweb.http.js.JE.Call
import net.liftweb.http.CometActor

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 24.06.12
 * Time: 15:40
 */

class MyCometActor extends CometActor {

  override def lowPriority = {
    case s: String => partialUpdate(Call("alert", s).cmd)
  }

  def render = Call("alert", ".").cmd
}