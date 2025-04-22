
package Inheritance;


    class WhatsappV1
    {
        void chat()
        {
        System.out.println("Texting....");
    }
}
class WhatsappV2 extends WhatsappV1
{
    void calling()
        {
        System.out.println("Voice/Video Calling..");
}
}
class WhatsappV3 extends WhatsappV2
{
    void Status()
        {
        System.out.println("Status for fav GF/BF");
}
}
public class MultiLevelInheritance {
    public static void main(String[] args)
    {
        WhatsappV3 wa=new WhatsappV3();
        wa.chat();
        wa.calling();
        wa.Status();
    }
}
