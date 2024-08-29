#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <stdio.h>
#include <string>

char map[2200][2200];
void init_map();
void star(int n, int x, int y);


using namespace std;
int main() {
    int n;
    cin >> n;

    init_map();
    star(n, 0, 0);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            cout<< map[i][j];
        cout << endl;
    }

    return 0;
}

void init_map() {
    for (int i = 0; i < 2200; i++)
        for (int j = 0; j < 2200; j++)
            map[i][j] = ' ';
}

void star(int n, int x, int y) {
    if (n == 1) {
        map[x][y] = '*';
        return;
    }

    int div = n / 3;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == 1 && j == 1);
            else
                star(div, (j * div) + x, (i * div) + y);
        }
    }

}