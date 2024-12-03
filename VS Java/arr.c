#include <stdio.h>
int main() {
    int t;
    scanf("%d", &t);
    while(t--)
    {
        int ar[3];
        scanf("%d %d %d", &ar[0],&ar[1],&ar[2]);
    
        if (ar[0] + ar[1] >= 10 || ar[0] + ar[2] >= 10 || ar[1] + ar[2] >= 10) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }
}

