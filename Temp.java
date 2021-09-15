

    public class Temp{
        public static void main(String[] args){
            System.out.println("Sr. No\t\tTemperature(Celsius)\t\tTemperature(Fahrenheit)");
            int celsius,fahrenheit;
            int pos=0;
            while(pos <10){///if condition can also be used

                for( celsius = 0;celsius <= 100 ;celsius+=10)
                {
                     fahrenheit = (celsius*9/5)+32;
                     pos = pos+1;

                    System.out.println(pos+"\t\t"+celsius+"\t\t\t\t\t"+ fahrenheit);
                    
                }
            
            }  
            
        }
    }

