package freestyle

import monix.eval.Task

object monix {
  implicit val freestyleMonixCaptureInstance: Capture[Task] = Capture[Task] {
    override def capture[A](a: => A) = Task(a)
  }
}
