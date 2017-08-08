//program to calculate how many line contains 'faiz ul'

val textFile = spark.read.textFile("c:\\hadoop\\a1.txt")
textFile.filter(line => line.contains("faiz ul")).count()