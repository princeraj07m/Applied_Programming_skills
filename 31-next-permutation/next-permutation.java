class Solution {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr,i, j);
            i++;
            j--;
        }
    }

    void f(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int pivot1 = -1;
        for (int idx = j - 1; idx >= 0; idx--) {
            if (arr[idx] < arr[idx + 1]) {
                pivot1 = idx;
                break;
            }
        }
        //no pivot case
        if (pivot1 == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        int pivot2 = -1;
        for (int idx = j; idx > pivot1; idx--) {
            if (arr[idx] > arr[pivot1]) {
                pivot2 = idx;
                break;
            }
        }
        swap(arr, pivot1, pivot2);
        reverse(arr, pivot1 + 1, arr.length - 1);

    }

    public void nextPermutation(int[] nums) {
        f(nums);
    }
}