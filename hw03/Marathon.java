class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
        "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
        "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
        "Aaron", "Kate"
        };
        int[] times = {
        341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
        343, 317, 265
        };

        int first_index = findFirst(times);
        int second_index = findSecond(times);

        System.out.println(names[first_index] + ":" + times[first_index]);
        System.out.println(names[second_index] + ":" + times[second_index]);
    }

    public static int findFirst (int[] times) {
        int min = times[0];
        int index = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < min){
                min = times[i];
                index = i;
            }
        }
        return index;
    }

    public static int findSecond (int[] times) {
        int jumpIndex = findFirst(times);
        
        int min;
        int index;
        if (jumpIndex == 0) {
            min = times[1];
            index = 1;
        }
        else {
            min = times[0];
            index = 0;
        }


        for (int i = 1; i < times.length; i++) {
            if (i == jumpIndex) {
                continue;
            }

            if (times[i] < min){
                min = times[i];
                index = i;
            }
        }
        return index;
    }
}