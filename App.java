
abstract class Bevarages
{
abstract void prepare();


}

class Tea extends Bevarages
{
void prepare()
{
System.out.println("Tea Prepared");
}


}

class Coffee extends Bevarages
{
void prepare()
{
System.out.println("Coffe Prepared");
}


}

class LemonTea extends Bevarages
{
void prepare()
{
System.out.println("Lemon Tea Prepared");
}


}



class VendingMachine
{

private Bevarages b;

VendingMachine(Bevarages b)
{
this.b=b;
}

void prepareDrink()
{
b.prepare();
}
}


class App
{
public static void main(String a[])
{

VendingMachine vm=new VendingMachine(new LemonTea());

vm.prepareDrink();


}

}


