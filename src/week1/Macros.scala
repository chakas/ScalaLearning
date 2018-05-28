package week1

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

/*
 *  Macros : 
 *  		-> Special function that it’s run at compile time. 
 *  			 It has access to its arguments not by value (or by name), 
 *  			 but as abstract syntax trees with information about their types
 *  		-> Experimental feature
 *  		
 */
object Macros {
  // debug methods take String param
  def debug(msg:Any): Unit = macro debug_impl
  
  //debug macro implementation which uses dir
//  the same params of the parent -> msg and UNIT
  def debug_impl(c:Context)(msg: c.Expr[Any]):c.Expr[Unit] = {
    import c.universe._
    reify {println("Got input :"+msg.splice)}
  }
}