package controllers.subproject

import play.api._
import play.api.mvc._

import controllers.subproject.lib._
object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Play 2.1 - Sub Module with routes example."))
  }

  def foo = Action {
    Ok("Foo updated in sub project")
  }
  
  def bar = Action { 
    Ok(Bar.bar())
  }
}
