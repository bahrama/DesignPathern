package builder;

public class Runner {
    public static void main(String[] args) {


        Pojo pojo = new Pojo.PojoBuilder(1, 5, 6, 3)
                .f7(8)
                .f12(2)
                .build();

        System.out.println(pojo);

    }
}
