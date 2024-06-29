

  public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        n = n - 1;
        m = m - 1;
        while (m >= 0 || n >= 0) {
            if (m >= 0 && n >= 0 && nums1[m] >= nums2[n]) {
                nums1[end--] = nums1[m--];
            } else if (n >= 0) {
                nums1[end--] = nums2[n--];
            } else {
                break;
            }
        }
    ///

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main =new Main();

    @Test
    void merge() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        int[] expected = new int[]{1,2,2,3,5,6};
        main. merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
    @Test
    void merge2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int m = 1;
        int n = 0;
        int[] expected = new int[]{1};
        main. merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
    @Test
    void merge3() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;
        int[] expected = new int[]{1};
        main. merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
    @Test
    void merge4() {
        int[] nums1 = new int[]{2,0};
        int[] nums2 = new int[]{1};
        int m = 1;
        int n = 1;
        int[] expected = new int[]{1,2};
        main. merge(nums1,m,nums2,n);
        assertArrayEquals(expected,nums1);
    }
}
