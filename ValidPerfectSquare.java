public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {//binary search
        if (num == 1 || num == 0)
            return true;
        long right = num;
        long left = 1;
        long center;
        while (left < right) {
            center = (right - left) / 2 + left;
            if (center * center == num)
                return true;
            if (center * center > num) right = center;
            else left = center + 1;
        }
        return false;
    }
}
