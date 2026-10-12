class CarAndPosition implements Comparable<CarAndPosition> {
    int position, speed;

    public CarAndPosition(int position, int speed) {
        this.position = position;
        this.speed = speed;
    }

    @Override
    public int compareTo(CarAndPosition o) {
        return Integer.compare(this.position, o.position); // sort by POSITION
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<CarAndPosition> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cars.add(new CarAndPosition(position[i], speed[i]));
        }
        Collections.sort(cars);

        Stack<Double> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) { // start at n-1
            CarAndPosition car = cars.get(i);
            double time = (double) (target - car.position) / car.speed; // double division

            // If this car would arrive later than the fleet ahead, it can't catch up,
            // so it starts a new fleet. Otherwise it joins that fleet and isn't pushed.
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
