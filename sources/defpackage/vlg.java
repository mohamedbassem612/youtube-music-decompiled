package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vlg extends aihn implements aiis {
    public static final vlg a;
    public int b;
    public long c;
    public aiip d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public String k;
    public boolean l;
    private int m;
    private aiip n;
    private aiip o;
    private ajwo p;
    private byte q;

    static {
        vlg vlgVar = new vlg();
        a = vlgVar;
        aihn.registerDefaultInstance(vlg.class, vlgVar);
    }

    private vlg() {
        aiip aiipVar = aiip.a;
        this.d = aiipVar;
        this.n = aiipVar;
        this.o = aiipVar;
        this.q = (byte) 2;
        this.j = "";
        this.k = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0003\u0017\u000e\u0003\u0000\u0001\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\bȈ\tȈ\n\u0007\u000b2\f\u0004\u000f2\u00122\u0016\u0004\u0017ᐉ\u0000", new Object[]{"m", "c", "e", "f", "g", "h", "j", "k", "l", "d", new ahud(aikaVar, (Object) "", aika.INT64, (Object) 0L), "b", "n", new ahud(aikaVar, (Object) "", aika.INT32, (Object) 0), "o", new ahud(aikaVar, "", aika.BOOL, Boolean.FALSE), "i", "p"});
            case 3:
                return new vlg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(vlg.class);
            default:
                return null;
        }
    }
}
