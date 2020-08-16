
//回溯法的整体遍历顺序类似于深度优先遍历，先把1开头条件的遍历完，再遍历2开头的
class Solution {
  List<List<Integer>> output = new LinkedList();
  int n;
  int k;

  public void backtrack(int first, LinkedList<Integer> curr) {
    // curr的大小等于题目要求的组合长度时
    if (curr.size() == k)
      output.add(new LinkedList(curr));

    for (int i = first; i < n + 1; ++i) {
      // add i into the current combination
      curr.add(i);
      // use next integers to complete the combination
      backtrack(i + 1, curr);
      // 把不符合条件的减去
      curr.removeLast();
    }
  }

  public List<List<Integer>> combine(int n, int k) {
    this.n = n;
    this.k = k;
    backtrack(1, new LinkedList<Integer>());
    return output;
  }
}
