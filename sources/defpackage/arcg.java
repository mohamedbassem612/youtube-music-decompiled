package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arcg extends aihn implements aiis {
    public static final arcg a;
    public int b;
    public Object d;
    public aivg f;
    public int g;
    public aivn h;
    public ajwo i;
    public aivj j;
    public arce l;
    public aivo n;
    public aiua o;
    public boolean p;
    public int q;
    public String r;
    public int s;
    public boolean t;
    public boolean u;
    public String v;
    public boolean w;
    private alay x;
    private apji y;
    public int c = 0;
    private byte z = 2;
    public aigj e = aigj.d;
    public aiie k = emptyProtobufList();
    public String m = "";

    static {
        arcg arcgVar = new arcg();
        a = arcgVar;
        aihn.registerDefaultInstance(arcg.class, arcgVar);
    }

    private arcg() {
        emptyProtobufList();
        this.r = "";
        this.v = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0001\u0001\u0001'\u0018\u0000\u0001\u0006\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\bᐉ\u0006\tဉ\b\nЛ\fᐉ\u0007\rᐉ\n\u000eဈ\f\u0010ᐉ\r\u0011ᐉ\u000b\u0013ဉ\u000f\u0014:\u0000\u0017:\u0000\u0018ဇ\u0012\u001bင\u0015\u001c:\u0000\u001eဈ\u0017 င\u0018\"ဇ\u001a%ဇ\u001d&ဈ\u001e'ဇ\u001f", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", amgu.class, "x", "l", "m", "n", "y", "o", "p", "q", "r", "s", "t", "u", "v", "w"});
            case 3:
                return new arcg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arcg.class);
            default:
                return null;
        }
    }
}
