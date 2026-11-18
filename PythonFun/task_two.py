collected_score = 0
sum_of_scores = 0
average_of_scores = 0
counter = 0

for collected_scores in range(1,11):
    collected_score = int(input('Enter a score: '))

    counter = counter + 1
    sum_of_scores += collected_score
    average_of_scores = sum_of_scores / counter

print('Sum of scores: ',sum_of_scores)
