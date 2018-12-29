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

        FactAddressValue fv = (FactAddressValue)((MultifieldValue) clips.eval("(find-fact ((?x flower)) TRUE)")).get(0);
        String output = null;


        try {
            output = fv.getFactSlot("name").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(output);
        return output;
    }
}
