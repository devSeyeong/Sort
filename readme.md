## 정렬 알고리즘 시간 복잡도 정리

### 🔹 O(n²)
- **삽입 정렬 (Insertion Sort)**  
  앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여 자신의 위치를 찾아 삽입하는 방식

- **버블 정렬 (Bubble Sort)**  
  인접한 두 원소를 비교하여 순서가 잘못되었으면 교환하며 정렬하는 알고리즘

---

### 🔹 O(n log n)
- **Collections.sort(arr)**  
  내부적으로 O(n log n)의 정렬 알고리즘을 사용

- **합병 정렬 (Merge Sort)**  
  배열을 두 개의 균등한 크기로 분할한 뒤, 각각을 정렬하고 합치는 과정에서 정렬 수행  
  👉 참고: https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html

- **힙 정렬 (Heap Sort)**  
  최대 힙 또는 최소 힙으로 구성한 뒤, 루트 노드를 마지막 노드와 교환하고 힙 크기를 줄이는 방식  
  👉 참고: https://gmlwjd9405.github.io/2018/05/10/algorithm-heap-sort.html

---

### 🔹 기타 정렬 방식
- **Array.sort 사용**  
  언어에서 제공하는 기본 정렬 메서드를 사용하여 정렬

- **카운팅 정렬 (Counting Sort)**  
  정렬할 수의 범위가 작은 경우, O(n)에 정렬 가능

- **Custom Sort (좌표 정렬 등)**  
  Comparator 또는 사용자 정의 기준을 사용하여 정렬
```java
Arrays.sort(arr, (e1, e2) -> {
    if (e1[0] == e2[0]) {
        return e1[1] - e2[1];
    } else {
        return e1[0] - e2[0];
    }
});
```

- **Sort Override**  
```java
public static class Point emplements Comparable<Point>{
  public int x;
  public int y;
  public Point (int a, int b){
    x = a; y = b;
  }

  @Override
  public int compareTo (Point p){
    if(this.x > p.x) return 1;
    if(this.x == p.x) {
      if(this.y>p.y) return 1;
      if(this.y==p.y) return 0;
    }
    return -1;
  }
  @Override
  public String toString(){
    return x+" "+y+"\n";
  }
}
```
```java
Array.sort(word, new Comparator<String>() {
    @Override
    pubic int compare(String s1, String s2) {
      if(s1.length() == s2.lentgh()) {
        return s1.compareTo(s2);
      } else {
        return s1.length() - s2.length();
      }
    });
```


