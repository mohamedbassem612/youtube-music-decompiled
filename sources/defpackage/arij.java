package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arij extends aihn implements aiis {
    public static final arij a;
    public aigj A;
    public String B;
    public String C;
    private arhy D;
    public int b;
    public int c;
    public int f;
    public boolean i;
    public boolean j;
    public float k;
    public String l;
    public String m;
    public aril n;
    public String o;
    public int p;
    public aojv q;
    public arid r;
    public arii s;
    public aric t;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public arig z;
    public aiip u = aiip.a;
    private byte E = 2;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";

    static {
        arij arijVar = new arij();
        a = arijVar;
        aihn.registerDefaultInstance(arij.class, arijVar);
    }

    private arij() {
        emptyProtobufList();
        this.l = "";
        this.m = "";
        this.o = "";
        this.A = aigj.d;
        this.B = "";
        this.C = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aika aikaVar = aika.STRING;
                return newMessageInfo(a, "\u0001\u001b\u0000\u0002\u0001\uf49c䄩\u001b\u0001\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0005ဈ\u0005\u0006ဇ\u0006\u0007ခ\b\tဈ\u000b\f᠌\u0012\rဈ\u0003\u0010ဉ\u0018\u00122\u0014ဇ\u001c\u0015ᐉ\u001d\u0016᠌\u001e\u0017ဇ \u0019ဇ\u0007\u001aဉ\"\u001cည$ ဈ'!ဈ\u000f'ဈ\f)ဈ-+င\u001f\uf70f⁾ဉ\u000e\ue8f4☔ဉ\u0013\ue6d2⸏ဉ\u0015\uf49c䄩ᐉ\u0017", new Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "l", "p", amyr.e, "g", "t", "u", new ahud(aikaVar, "", aikaVar, ""), "v", "D", "w", aobi.g, "y", "j", "z", "A", "B", "o", "m", "C", "x", "n", "q", "r", "s"});
            case 3:
                return new arij();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arij.class);
            default:
                return null;
        }
    }
}
