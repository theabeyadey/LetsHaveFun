collected_score = 0
sum_of_scores = 0
average_of_scores = 0
counter = 0

for collected_scores in range(1,11):
    collected_score = int(input('Enter a score: '))

    counter = counter + 1

    if(counter % 2 == 0):
        sum_of_scores += collected_score

print('Sum of even scores index:',sum_of_scores)
