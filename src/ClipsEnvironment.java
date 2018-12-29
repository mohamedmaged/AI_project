import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;
import net.sf.clipsrules.jni.PrimitiveValue;

public class ClipsEnvironment {
    private   Environment clips;

    public ClipsEnvironment() {
        clips= new Environment();
        clips.loadFromResource("/flower.clp");
    }
    public void assertdata(String color,String season,String lifecycle,String soil,String size,String perfume,String root)
    {
        color = "(assert (color "+color+"))";
        season ="(assert (season "+season+"))";
        lifecycle = "(assert (cycle "+lifecycle+"))";
        soil = "(assert (soil "+soil+"))";
        size = "(assert (size "+size+"))";
        perfume = "(assert (perfumed "+perfume+"))";
        root = "(assert (root "+root+"))";

        clips.eval(color);
        clips.eval(season);
        clips.eval(lifecycle);
        clips.eval(soil);
        clips.eval(size);
        clips.eval(perfume);
        clips.eval(root);
    }
    public void run()
    {
        clips.run();
    }
    public void reset()
    {
        clips.reset();
    }
    public String getFlower()
    { PrimitiveValue value=clips.eval("(facts)");
        String ou = value.toString();
        System.out.println(ou);
        String output = null;
        MultifieldValue mv = ((MultifieldValue) clips.eval("(find-all-facts ((?x flower)) TRUE)"));
        if(mv.size()==1)
            output = "The Flower is ";
        else if(mv.size() >1)
            output = "The Flower Maybe ";

        for (int i = 0; i <mv.size() ; i++) {


                FactAddressValue fv = (FactAddressValue)mv.get(i);

            try {
                if(mv.size() > 1 && i < mv.size()-1 )
                output = output+fv.getFactSlot("name").toString()+"\n OR ";
                else
                    output = output+fv.getFactSlot("name").toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(output);
        return output;
    }
}
