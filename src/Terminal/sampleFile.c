// this is a sample file to be used in this task. Please enter your responses in the file src/Terminal/answers.txt

//below is a sample C program (for question 2)
#include <stdio.h>
#define END_NUM 10

int main() {
    int i = 0;
    int sum = 0;
    for (i = 1; i < END_NUM; i++) {
        sum += i;
    }
    printf("sum is %d", sum);
    return 0;
}