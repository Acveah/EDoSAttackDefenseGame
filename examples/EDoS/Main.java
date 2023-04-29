//package EDoS;
//
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        double[][] acc = {
//                {0.29, 0.33, 0.33},
//                {0.33, 0.53, 0.55},
//                {0.34, 0.79, 0.74},
//                {0.34, 0.82, 0.74},
//                {0.34, 0.85, 0.81},
//                {0.35, 0.90, 0.84},
//                {0.35, 0.93, 0.85},
//                {0.35, 0.93, 0.86},
//                {0.37, 0.94, 0.87},
//                {0.40, 0.96, 0.89}
//        };
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 0; j < 3; j++) {
//                String a = Double.toString(acc[i-1][j]);
//                String[] s = {a,Integer.toString(i*5),Integer.toString(j)};
//                EDoS.main(s);
//            }
//        }
////    }
//}
