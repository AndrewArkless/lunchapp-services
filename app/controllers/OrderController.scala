package controllers

import models.Order
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller, InjectedController}

/**
  * Created by andrew on 22/08/17.
  */
class OrderController extends InjectedController {
  def get()=Action{
    val order=Order("Andrew","Hazlerigg","Pie")
    Ok(Json.toJson(order))
  }

  def recieveOrder=Action{ request =>
    Ok
  }
}
