#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <stdio.h>
#include <string>


void hanoi(int n, int from, int by, int to);
int count(int n);
using namespace std;

int main() {

    int n;
    cin >> n;

    cout << count(n) << endl;

    hanoi(n, 1, 2, 3);

    return 0;
}

void hanoi(int n, int from, int by, int to) {

    if (n == 1)
        printf("%d %d\n", from, to);
    else{
        hanoi(n - 1, from, to, by);
        printf("%d %d\n", from, to);
        hanoi(n - 1, by, from, to);
    }
}

int count(int n) {
    int result = 1;
    for (int i = 0; i < n; i++)
        result *= 2;

    return result - 1;
}