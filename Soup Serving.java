class Solution {
    double memo[][] = new double[200][200];
    public double soupServings(int n) {
        return n > 4800 ? 1 : f((n + 24)/25, (n + 24)/25);
    }
    public double f(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        else if (a <= 0) return 1;
        else if (b <= 0) return 0;
        if (memo[a][b] > 0) return memo[a][b];
        memo[a][b] = 0.25 * (f(a - 4, b) + f(a - 3, b - 1) + f(a - 2, b - 2) + f(a - 1, b - 3));
        return memo[a][b];
    }
}