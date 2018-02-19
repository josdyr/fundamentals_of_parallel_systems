package c2

import jcsp.lang.*

class CreateSetsOfSix implements CSProcess{
	
	def ChannelInput inChannel

	void run(){
		def outList = []
		def v = inChannel.read()
		while (v != -1) {
			for ( i in 0 .. 5 ) {
				// put v into outList and read next input
				outList.add(v)
				v = inChannel.read()
			}
			println " Six Object is ${outList}"
			outList = []
		}
		println "Finished"
	}
}