# Design choices
For the storing method of the groups I use a HashMap. The key would represent the letters which the words should contain 
to be assigned to the group, while the values would be a List of words that fit the group criteria. 

I used a BufferedReader
for the method of reading all words as it's optimal for the problem with its quick reading capabilities and also a FileReader
to access the input file. The try-catch block would throw an exception in case the files doesn't exist.

The keys of each group are transformed to lower case so this implementation would be case-insensitive in case of words that 
have the same letters but are different when it comes to casing.


Basically we go through each word, and if the letters are already used as a key, we just add the word to  the group, else 
we create a new group to which future words can be added.
# Scalability considerations
For 10 million words this implementation wouldn't be a problem as we are reading line by line, not loading up the whole 
file at once. Storing these words in the HashMap also wouldn't be a problem at this scale.

For 100 billion words the HashMap wouldn't work as we would require a huge amount of RAM. One method would be storing 
the groups after a certain amount in some files, to free RAM up. Also, we could read the file at the same time on different
points using multithreading, which would help us get through the file faster.
