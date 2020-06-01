public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        double slope = (double) (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        double constant = coordinates[0][1] - slope * coordinates[0][0];
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][1] != slope * coordinates[i][0] + constant)
                return false;
        }
        return true;
    }
}
