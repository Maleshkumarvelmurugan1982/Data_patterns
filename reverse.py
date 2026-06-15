sentence = input("Enter sentence: ")
words = sentence.split()
words.reverse()
for word in words:
    print(word, end=" ")
