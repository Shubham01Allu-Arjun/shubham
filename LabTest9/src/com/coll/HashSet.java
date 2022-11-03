package com.coll;
class HashSet {
public static void main(String[] args) {
    HashSet<Student> set = new HashSet<>();
    set.add(new Student(101, "A"));
    set.add(new Student(102, "B"));
    set.add(new Student(103, "C"));
    set.add(new Student(104, "D"));
    set.add(new Student(105, "E"));

    Iterator<Student> iterator = set.iterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      if (student.getId() > 103) {
        System.out.println(student.getName());
      }
    }
}
}

