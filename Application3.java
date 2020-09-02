public class Application3{

public static void main(Sting[]args){

Bootable bootable=new Bootable(){

public boolean restart(String status,boolean batteryLevel){

if(status.equals("ON")){

System.out.print("Restarting... ananymnous");
}else{
System.out.pintln("can not be restarted");

}

return false;
};

boot.restart("ON",false);

Bootable bootable=  (status,battery) ->{

if(status.equals("ON"){
System.out.print("Restarted ...lambda");
}else{
System.out.print("can not be restarted");

}
return false;
};

bootable.restart("ON",false);

Bootable bootableB = Phone::restartPhone;
bootableB.restart("OFF",true);
}

}

