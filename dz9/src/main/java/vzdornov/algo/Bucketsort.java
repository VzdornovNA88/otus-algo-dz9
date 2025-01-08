package vzdornov.algo;

public class Bucketsort implements ISort {

  @Override
  public void sort(int[] arr) {
    bucketSort(arr);
  }

  void bucketSort(int[] array) {
    int size = array.length;
    int max = array[0];
    for (int i = 1; i < size; i++) {
      if (array[i] > max)
        max = array[i];
    }
    int[] bucketArray = new int[max + 1];
    // for (int i = 0; i < bucketArray.length; i++) {
    //   bucketArray[i] = 0;
    // }
    for (int i = 0; i < size; i++) {
      bucketArray[array[i]]++;
    }
    int index = 0;
    for (int i = 0; i < bucketArray.length; i++) {
      for (int j = 0; j < bucketArray[i]; j++) {
        array[index++] = i;
      }
    }
  }

}
