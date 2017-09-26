package com.mikafecito.cortado.core

object Cortado {


  private  def plus(l: Any, r: Any): Any = {
    l match {
      case ld: Double => {
        r match {
          case rd: Double => ld + rd
          case rl: Long => ld + rl
          case rf: Float => ld + rf
          case ri: Int => ld + ri
          case rs: String => ld + rs
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Long => {
        r match {
          case rd: Double => ld + rd
          case rl: Long => ld + rl
          case rf: Float => ld + rf
          case ri: Int => ld + ri
          case rs: String => ld + rs
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Float => {
        r match {
          case rd: Double => ld + rd
          case rl: Long => ld + rl
          case rf: Float => ld + rf
          case ri: Int => ld + ri
          case rs: String => ld + rs
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Int => {
        r match {
          case rd: Double => ld + rd
          case rl: Long => ld + rl
          case rf: Float => ld + rf
          case ri: Int => ld + ri
          case rs: String => ld + rs
          case e => throw new MatchError("Unsupported type for right side:" + e)
        }
      }
      case ld: String => {
        r match {
          case rd: Double => ld + rd
          case rl: Long => ld + rl
          case rf: Float => ld + rf
          case ri: Int => ld + ri
          case rs: String => ld + rs
          case e => throw new MatchError("Unsupported type for right side:" + e)
        }
      }

      case e => throw new MatchError("Unsupported type for left side:" + e)
    }
  }

  private  def minus(l: Any, r: Any): Any = {
    l match {
      case ld: Double => {
        r match {
          case rd: Double => ld - rd
          case rl: Long => ld - rl
          case rf: Float => ld - rf
          case ri: Int => ld - ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Long => {
        r match {
          case rd: Double => ld - rd
          case rl: Long => ld - rl
          case rf: Float => ld - rf
          case ri: Int => ld - ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Float => {
        r match {
          case rd: Double => ld - rd
          case rl: Long => ld - rl
          case rf: Float => ld - rf
          case ri: Int => ld - ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Int => {
        r match {
          case rd: Double => ld - rd
          case rl: Long => ld - rl
          case rf: Float => ld - rf
          case ri: Int => ld - ri
          case e => throw new MatchError("Unsupported type for right side:" + e)
        }
      }
      case e => throw new MatchError("Unsupported type for left side:" + e)
    }
  }


  private  def multiply(l: Any, r: Any): Any = {
    l match {
      case ld: Double => {
        r match {
          case rd: Double => ld * rd
          case rl: Long => ld * rl
          case rf: Float => ld * rf
          case ri: Int => ld * ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Long => {
        r match {
          case rd: Double => ld * rd
          case rl: Long => ld * rl
          case rf: Float => ld * rf
          case ri: Int => ld * ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Float => {
        r match {
          case rd: Double => ld * rd
          case rl: Long => ld * rl
          case rf: Float => ld * rf
          case ri: Int => ld * ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Int => {
        r match {
          case rd: Double => ld * rd
          case rl: Long => ld * rl
          case rf: Float => ld * rf
          case ri: Int => ld * ri
          case e => throw new MatchError("Unsupported type for right side:" + e)
        }
      }
      case e => throw new MatchError("Unsupported type for left side:" + e)
    }
  }

  private  def divide(l: Any, r: Any): Any = {
    l match {
      case ld: Double => {
        r match {
          case rd: Double => ld / rd
          case rl: Long => ld / rl
          case rf: Float => ld / rf
          case ri: Int => ld / ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Long => {
        r match {
          case rd: Double => ld / rd
          case rl: Long => ld / rl
          case rf: Float => ld / rf
          case ri: Int => ld / ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Float => {
        r match {
          case rd: Double => ld / rd
          case rl: Long => ld / rl
          case rf: Float => ld / rf
          case ri: Int => ld / ri
          case e => throw new MatchError("Unsupported type:" + e)
        }
      }
      case ld: Int => {
        r match {
          case rd: Double => ld / rd
          case rl: Long => ld / rl
          case rf: Float => ld / rf
          case ri: Int => ld / ri
          case e => throw new MatchError("Unsupported type for right side:" + e)
        }
      }
      case e => throw new MatchError("Unsupported type for left side:" + e)
    }
  }


  implicit class ExtendedList(val ll: Seq[_]) {
    def +++(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l => {
          plus(l, r)
        }
      ))
    }

    def +++(rl: Double): Seq[_] = {
      ll +++ List(rl)
    }

    def +++(rl: Float): Seq[_] = {
      ll +++ List(rl)

    }

    def +++(rl: Long): Seq[_] = {
      ll +++ List(rl)

    }

    def +++(_rl: Int): Seq[_] = {
      val rl = List(_rl)
      ll +++ rl
    }

    def +++(_rl: String): Seq[_] = {
      val rl = List(_rl)
      ll +++ rl
    }

    def ---(_rl: Double): Seq[_] = {
      val rl = List(_rl)
      ll --- rl
    }

    def ---(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l => minus(l, r)
      ))
    }

    def ---(_rl: Float): Seq[_] = {
      val rl = List(_rl)
      ll --- rl
    }

    def ---(_rl: Long): Seq[_] = {
      val rl = List(_rl)
      ll --- rl
    }

    def ---(_rl: Int): Seq[_] = {
      val rl = List(_rl)
      ll --- rl
    }

    def ***(_rl: Double): Seq[_] = {
      val rl = List(_rl)
      ll *** rl
    }

    def ***(_rl: Float): Seq[_] = {
      val rl = List(_rl)
      ll *** rl
    }

    def ***(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l => multiply(l, r)
      ))
    }

    def ***(_rl: Long): Seq[_] = {
      val rl = List(_rl)
      ll *** rl
    }

    def ***(_rl: Int): Seq[_] = {
      val rl = List(_rl)
      ll *** rl
    }

    def |||(rl: Seq[_]): Seq[_] = {
      rl.flatMap(r => ll.map(
        l => divide(l, r)
      ))
    }

    def |||(_rl: Double): Seq[_] = {
      val rl = List(_rl)
      ll ||| rl
    }

    def |||(_rl: Float): Seq[_] = {
      val rl = List(_rl)
      ll ||| rl
    }

    def |||(_rl: Long): Seq[_] = {
      val rl = List(_rl)
      ll ||| rl
    }

    def |||(_rl: Int): Seq[_] = {
      val rl = List(_rl)
      ll ||| rl
    }



    def ###(_rl: Double): String = {
      ll.mkString("")+_rl
    }

    def ###(_rl: Float): String = {
      ll.mkString("")+_rl

    }

    def ###(_rl: Long): String = {
      ll.mkString("")+_rl

    }

    def ###(_rl: Int): String = {
      ll.mkString("")+_rl
    }

    def @@@(rla: String): String = {
      println("argument>>"+rla+"made"+ll.mkString("ddd"))
        ll.mkString(rla)
    }


  }


  trait ExtendedAny {
    val ll: Any

    def +++(rla: Seq[_]): Seq[_] = {
      List(ll) +++ rla
    }

    def +++(rla: Any): Seq[_] = {
      List(ll) +++ List(rla)
    }

    def ---(rla: Seq[Any]): Seq[_] = {
      List(ll) --- rla
    }

    def ---(rla: Any): Seq[_] = {
      List(ll) +++ List(rla)
    }

    def ***(rla: Seq[_]): Seq[_] = {
      List(ll) ||| rla

    }

    def ***(rla: Any): Seq[_] = {
      List(ll) *** List(rla)
    }

    def |||(rla: Seq[_]): Seq[_] = {
      List(ll) ||| rla
    }

    def |||(rla: Any): Seq[_] = {
      List(ll) ||| List(rla)
    }

    def ###(rla: Seq[_]): Any = {
      plus(ll, rla.mkString(""))
    }

    def ###(rla: Any): Any = {
      plus(ll, rla)
    }

  }

  implicit class ExtendedDouble(val ll: Double) extends ExtendedAny

  implicit class ExtendedLong(val ll: Long) extends  ExtendedAny

  implicit class ExtendedFloat(val ll: Float) extends  ExtendedAny

  implicit class ExtendedInt(val ll: Int) extends  ExtendedAny

  implicit class ExtendedString(val ll: String) {
    def +++(rla: Seq[_]): Seq[_] = {
      List(ll) +++ rla
    }

    def +++(rla: Any): Seq[_] = {
      List(ll) +++ List(rla)
    }

    def ###(rla: Seq[_]): String = {
      plus(ll, rla.mkString("")).toString
    }

    def ###(rla: Any): String = {
      plus(ll, rla.toString).toString
    }

  }


}
