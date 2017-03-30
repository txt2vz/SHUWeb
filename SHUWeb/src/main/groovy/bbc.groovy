import groovy.json.*

def jsonBbc = new URL("http://www.bbc.co.uk/tv/programmes/genres/drama/scifiandfantasy/schedules/upcoming.json").getText()
def slurper = new JsonSlurper()
def bbc =slurper.parseText(jsonBbc)

println "bbc data:  "
bbc.broadcasts.each  {println it.programme.short_synopsis}

println("****************************************")

//just the first two elements
bbc.broadcasts[0..1].each  {println it.programme.short_synopsis}