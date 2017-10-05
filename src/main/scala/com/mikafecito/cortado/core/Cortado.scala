package com.mikafecito.cortado.core
import Numeric.Implicits._
import Fractional.Implicits._
import Integral.Implicits._

object Cortado {


  private  def plus[N:Numeric](l: N, r: N): N = {
    l + r
  }

  private  def plus[N:Numeric](l: String, r: N): String = {
    l + r
  }

  private  def plus[N:Numeric](l: N, r: String): String = {
    l + r
  }

  private  def plus(l: String, r: String): String = {
    l + r
  }
  private  def minus[N:Numeric](l: N, r: N): N = {
    l - r
  }


  private  def multiply[N:Numeric](l: N, r: N): N = {
    l * r
  }


  private  def divide[N:Fractional](l: N, r: N): N = {
    l / r
  }

  private  def divideIntegral[B:Integral](l: B, r: B): B = {
    l / r
  }

  implicit class ExtendedListString(val ll: Seq[_]) {
    def ##(rl: Seq[_]): Seq[String] = {
      rl.flatMap(r => ll.map(l => l.toString + r.toString))
    }
    def ##(rl: Any): Seq[String] = {
      ll.map(l => l.toString + rl.toString)
    }

    def #>(rla: String): String = {
      ll.mkString(rla)
    }
  }

  implicit class ExtendedList(val ll: Seq[_]) {
    def #+[N:Numeric](rl: Seq[N]): Seq[N] = {
      rl.flatMap(r => ll.map(
        l => {
          r match {
            case rr:Double => l match {
              case ll:Double => plus(ll,rr)
              case ll:Long => plus(ll,rr)
              case ll:Float => plus(ll,rr)
              case ll:Int => plus(ll,rr)
              case ll:Short => plus(ll,rr)
              case ll:String => plus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Long => l match {
              case ll:Double => plus(ll,rr)
              case ll:Long => plus(ll,rr)
              case ll:Float => plus(ll,rr)
              case ll:Int => plus(ll,rr)
              case ll:Short => plus(ll,rr)
              case ll:String => plus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Float => l match {
              case ll:Double => plus(ll,rr)
              case ll:Long => plus(ll,rr)
              case ll:Float => plus(ll,rr)
              case ll:Int => plus(ll,rr)
              case ll:Short => plus(ll,rr)
              case ll:String => plus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Int => l match {
              case ll:Double => plus(ll,rr)
              case ll:Long => plus(ll,rr)
              case ll:Float => plus(ll,rr)
              case ll:Int => plus(ll,rr)
              case ll:Short => plus(ll,rr)
              case ll:String => plus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Short => l match {
              case ll:Double => plus(ll,rr)
              case ll:Long => plus(ll,rr)
              case ll:Float => plus(ll,rr)
              case ll:Int => plus(ll,rr)
              case ll:Short => plus(ll,rr)
              case ll:String => plus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:String => l match {
              case ll:Double => plus(ll,rr)
              case ll:Long => plus(ll,rr)
              case ll:Float => plus(ll,rr)
              case ll:Int => plus(ll,rr)
              case ll:Short => plus(ll,rr)
              case ll:String => plus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case e => throw new Error("wrong right side type: "+e)
          }
        }
      )).map(_.asInstanceOf[N])
    }

    def #+[N:Numeric](rl: N): Seq[_] = {
      ll #+ List(rl)
    }


    def #-[N:Numeric](_rl: N): Seq[_] = {
      val rl = List(_rl)
      ll #- rl
    }

    def #-(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l => {
          r match {
            case rr:Double => l match {
              case ll:Double => minus(ll,rr)
              case ll:Long => minus(ll,rr)
              case ll:Float => minus(ll,rr)
              case ll:Int => minus(ll,rr)
              case ll:Short => minus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Long => l match {
              case ll:Double => minus(ll,rr)
              case ll:Long => minus(ll,rr)
              case ll:Float => minus(ll,rr)
              case ll:Int => minus(ll,rr)
              case ll:Short => minus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Float => l match {
              case ll:Double => minus(ll,rr)
              case ll:Long => minus(ll,rr)
              case ll:Float => minus(ll,rr)
              case ll:Int => minus(ll,rr)
              case ll:Short => minus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Int => l match {
              case ll:Double => minus(ll,rr)
              case ll:Long => minus(ll,rr)
              case ll:Float => minus(ll,rr)
              case ll:Int => minus(ll,rr)
              case ll:Short => minus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Short => l match {
              case ll:Double => minus(ll,rr)
              case ll:Long => minus(ll,rr)
              case ll:Float => minus(ll,rr)
              case ll:Int => minus(ll,rr)
              case ll:Short => minus(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case e => throw new Error("wrong right side type: "+e)
          }
        }
      ))
    }


    def #*[N:Numeric](_rl: N): Seq[_] = {
      val rl = List(_rl)
      ll #* rl
    }


    def #*(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l => {
          r match {
            case rr:Double => l match {
              case ll:Double => multiply(ll,rr)
              case ll:Long => multiply(ll,rr)
              case ll:Float => multiply(ll,rr)
              case ll:Int => multiply(ll,rr)
              case ll:Short => multiply(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Long => l match {
              case ll:Double => multiply(ll,rr)
              case ll:Long => multiply(ll,rr)
              case ll:Float => multiply(ll,rr)
              case ll:Int => multiply(ll,rr)
              case ll:Short => multiply(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Float => l match {
              case ll:Double => multiply(ll,rr)
              case ll:Long => multiply(ll,rr)
              case ll:Float => multiply(ll,rr)
              case ll:Int => multiply(ll,rr)
              case ll:Short => multiply(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Int => l match {
              case ll:Double => multiply(ll,rr)
              case ll:Long => multiply(ll,rr)
              case ll:Float => multiply(ll,rr)
              case ll:Int => multiply(ll,rr)
              case ll:Short => multiply(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Short => l match {
              case ll:Double => multiply(ll,rr)
              case ll:Long => divideIntegral(ll,rr)
              case ll:Float => multiply(ll,rr)
              case ll:Int => multiply(ll,rr)
              case ll:Short => multiply(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case e => throw new Error("wrong right side type: "+e)
          }
        }
      ))
    }



    def #/(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l =>{
          r match {
            case rr:Double => l match {
              case ll:Double => divide(ll,rr)
              case ll:Long => divide(ll,rr)
              case ll:Float => divide(ll,rr)
              case ll:Int => divide(ll,rr)
              case ll:Short => divide(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Long => l match {
              case ll:Double => divide(ll,rr)
              case ll:Long => divideIntegral(ll,rr)
              case ll:Float => divide(ll,rr)
              case ll:Int => divideIntegral(ll,rr)
              case ll:Short => divideIntegral(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Float => l match {
              case ll:Double => divide(ll,rr)
              case ll:Long => divide(ll,rr)
              case ll:Float => divide(ll,rr)
              case ll:Int => divide(ll,rr)
              case ll:Short => divide(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Int => l match {
              case ll:Double => divide(ll,rr)
              case ll:Long => divideIntegral(ll,rr)
              case ll:Float => divide(ll,rr)
              case ll:Int => divideIntegral(ll,rr)
              case ll:Short => divideIntegral(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case rr:Short => l match {
              case ll:Double => divide(ll,rr)
              case ll:Long => divideIntegral(ll,rr)
              case ll:Float => divide(ll,rr)
              case ll:Int => divideIntegral(ll,rr)
              case ll:Short => divideIntegral(ll,rr)
              case e => throw new Error("wrong left side type: "+e)
            }
            case e => throw new Error("wrong right side type: "+e)
          }
        }
      ))
    }
    def #/[N:Numeric](_rl: N): Seq[_] = {
      val rl = List(_rl)
      ll #/ rl
    }

  }


  implicit class ExtendedNumeric[N:Numeric](val ll: N) {

    def #+(rla: Seq[N]): Seq[N] = {
      List(ll) #+ rla
    }

    def #+(rla: N): Seq[_] = {
      List(ll) #+ List(rla)
    }
    def #-(rla: Seq[N]): Seq[_] = {
      List(ll) #- rla
    }
    def #-(rla: N): Seq[_] = {
      List(ll) #- List(rla)
    }
    def #*(rla: Seq[_]): Seq[_] = {
      List(ll) #/ rla
    }
    def #*(rla: N): Seq[_] = {
      List(ll) #* List(rla)
    }

    def #/(rla: Seq[_]): Seq[_] = {
      List(ll) #/ rla
    }

    def #/(rla: N): Seq[_] = {
      List(ll) #/ List(rla)
    }

    def ##(rla: Seq[_]): String = {
      plus(ll, rla.mkString(""))
    }

    def ##(rla: N): String = {
      plus(ll.toString, rla.toString)
    }

  }


  implicit class ExtendedString(val ll: String) {
    //def #+(rla: Seq[String]): Seq[String] = {
    //  List(ll) #+ rla
    // }

    def ##[N:Numeric](rla: N): Seq[_] = {
      List(ll) #+ List(rla)
    }
    def ##(rla: String): Seq[String] = {
      List(ll) ## List(rla)
    }

    def ##(rla: Seq[_]): Seq[String] = {
      rla.map(ll + _.toString)
    }
    def #>(rla: String): String = {
      ll
    }
  }


}
