package com.sophia.java;

public class JavaVarargs {
    //    class Add {
//        void add(int... numbers) {
//            StringBuffer sb = new StringBuffer();
//            int sum = 0;
//            for (int num : numbers) {
//                sb.append(num + "+");
//                sum += num;
//            }
//            sb.setCharAt(sb.length() - 1, '=');
//            sb.append(sum);
//            System.out.println(sb);
//        }
//    }
//}
    class Add {
        public void add(int... arr) {

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {// 1,2
                    System.out.print(arr[i] + "=");
                } else {

                    System.out.print(arr[i] + "+");

                }
                sum = sum + arr[i];

            }
            System.out.print(sum);
            System.out.println();

        }
    }
}
//    As you already stated correctly this java notation is to make the method accept a variable amount of (in this case) int parameter.
//
//        To handle this variable amount of variables you can access it like an array.