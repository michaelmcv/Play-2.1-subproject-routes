package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    val x = controllers.subproject.lib.Bar.bar()
   // val x = " 1" 
    Ok(views.html.index(" Bar is : " + x ) )
  }
  
}
