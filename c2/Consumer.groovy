package c2
 
import phw.util.*
import jcsp.lang.*


class Consumer implements CSProcess {
  
  def ChannelInput inChannel
  
  void run() {
    def i = inChannel.read()
    while ( i > 0 ) {
      //insert a modified println statement
	  println "the multiplied value is $i"
      i = inChannel.read()
    }
    println "Finished"
  }
}

