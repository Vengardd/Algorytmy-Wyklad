package _1.SlidingWindow.Front_Back;

public class RainWater {

    public int maxArea(int[] height) {
        int actualLeftPointer = 0;
        int actualRightPointer = height.length - 1;
        int actualSize = countSize(height, actualLeftPointer, actualRightPointer);
        int maxSize = actualSize;
        while(actualRightPointer > actualLeftPointer) {
            actualSize = countSize(height, actualLeftPointer, actualRightPointer);
            if(actualSize > maxSize) {
                maxSize = actualSize;
            }
            if(height[actualLeftPointer] > height[actualRightPointer])
                actualRightPointer--;
            else
                actualLeftPointer++;
        }
        return maxSize;
    }

    private int countSize(int[] tab, int leftMaxPointer, int rightMaxPointer) {
        int smaller = tab[leftMaxPointer] < tab[rightMaxPointer] ? tab[leftMaxPointer] : tab[rightMaxPointer];
        return (rightMaxPointer - leftMaxPointer) * smaller;
    }

}
