//public class bubblesort {
package sorting;

    public class bubblesort {
        public static void main(String[] args) {
            int a=1;
            int [] Student_marks = {2,4,6,8,3,4,5};
            for(int i = 0 ; i < Student_marks.length -1; i++){
                var flag=true;
                for(int j = 0 ; j < Student_marks.length-1 ; j++){
                    if(Student_marks[j] > Student_marks[j+1]){
                        int temp = Student_marks[j];
                        Student_marks[j] = Student_marks[j+1];
                        Student_marks[j+1] = temp;
                        flag=false;
                    }
                }
                if(flag)break;
            }
            for(int i = 0 ; i < Student_marks.length ; i++){
                System.out.print(Student_marks[i]+" ");
            }
        }
    }

//}
