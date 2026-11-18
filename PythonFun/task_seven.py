collected_score = 0
sum_of_scores = 0
average_of_scores = 0
counter = 0

for collected_scores in range(1,11):
    collected_score = int(input('Enter a score: '))

    counter = counter + 1

    if(collected_score % 2 == 0):
        sum_of_scores += collected_score

        average_of_scores = sum_of_scores / 10

print('Sum of even scores:',sum_of_scores)
print('Average of even scores:',average_of_scores)
