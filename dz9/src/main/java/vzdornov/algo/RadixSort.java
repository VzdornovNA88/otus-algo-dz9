package vzdornov.algo;

public class RadixSort implements ISort {

  @Override
  public void sort(int[] arr) {
    radixSort(arr);
  }

  void countingSort(int[] array, int place) {
    int size = array.length;
    int[] output = new int[size + 1];
    int max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
    }
    int[] count = new int[max + 1];
    // for (int i = 0; i < max; ++i)
    //   count[i] = 0;
    for (int i = 0; i < size; i++)
      count[(array[i] / place) % 10]++;
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];
    for (int i = size - 1; i >= 0; i--) {
      output[count[(array[i] / place) % 10] - 1] = array[i];
      count[(array[i] / place) % 10]--;
    }
    if (size >= 0)
      System.arraycopy(output, 0, array, 0, size);
  }

  int getMax(int[] array) {
    int n = array.length;
    int max = array[0];
    for (int i = 1; i < n; i++)
      if (array[i] > max)
        max = array[i];
    return max;
  }

  void radixSort(int[] array) {
    int max = getMax(array);
    for (int place = 1; max / place > 0; place *= 10)
      countingSort(array, place);
  }

}
