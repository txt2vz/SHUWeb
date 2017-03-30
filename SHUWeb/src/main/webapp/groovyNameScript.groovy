def name = params.shuname ?: "No Name"  //elvis
def writer = new StringWriter()  // html written by markup builder
def markup = new groovy.xml.MarkupBuilder(writer)  // the builder
 
markup.html{
	h1("SHU Information")
		table (border: "1") {
		tr {
			td("SHU name: ")
		  td(style: "color: red", "Prof. $name ")
		}
	tr {
		 td("r2 c1")
		 td("r2 c2")
	   }
	}
}

println writer.toString()