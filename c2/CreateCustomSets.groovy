package c2

import jcsp.lang.*
import phw.util.*

class CreateCustomSets implements CSProcess{
	
	def ChannelInput inChannel

	void run(){
		def outList = []
		def v = inChannel.read()
		while (v != -1) {
			int custom_list_size = Ask.Int ("next: ", 2, 24)
			for ( i in 0 .. (custom_list_size - 1) ) {
				// put v into outList and read next input
				outList.add(v)
				v = inChannel.read()
			}
			println " Custom Size Object is ${outList}"
			outList = []
		}
		println "Finished"
	}
}