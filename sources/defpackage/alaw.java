package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alaw extends aihi implements aihj {
    public static final aihw a = new aiat(10);
    public static final alaw b;
    public alav A;
    public double B;
    public double C;
    public int D;
    public ajoj E;
    public int F;
    public long G;
    public long H;
    public int I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public int c;
    public int d;
    public int e;
    public int h;
    public int i;
    public int k;
    public int l;
    public int m;
    public alax n;
    public alax o;
    public long p;
    public long q;
    public int u;
    public int v;
    public int w;
    public int x;
    public ajhl y;
    public arfx z;
    private byte P = 2;
    public String f = "";
    public String g = "";
    public String r = "";
    public aihv s = emptyIntList();
    public String t = "";

    static {
        alaw alawVar = new alaw();
        b = alawVar;
        aihn.registerDefaultInstance(alaw.class, alawVar);
    }

    private alaw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.P);
            case 1:
                this.P = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001$\u0000\u0002\u0001:$\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0005ဈ\u0002\u0006င\u0003\u0007င\u0005\bင\u0006\tဉ\b\nဉ\t\u000bဂ\n\fဂ\u000b\u0017ဈ\r\u0018ࠞ\u0019င\u0007\u001aဈ\u000e\u001b᠌\u000f\u001cဉ\u0013\u001fင\u0004 ᠌\u0010!ဉ\u0015#က\u0017%᠌\u0011&က\u0019)᠌\u001b*ဉ\u001c+᠌\u001d,ဃ\u001e-ဃ\u001f.ဋ /ခ!1ဇ$2᠌%5ခ\"7᠌\u00128᠌(9ဉ\u0014:ဇ)", new Object[]{"c", "d", "e", "f", "g", "h", "k", "l", "n", "o", "p", "q", "r", "s", amjn.r, "m", "t", "u", akux.u, "y", "i", "v", albk.b, "A", "B", "w", aqcj.f, "C", "D", akux.q, "E", "F", ajhd.c, "G", "H", "I", "J", "L", "M", akux.f, "K", "x", akux.r, "N", aiod.g, "z", "O"});
            case 3:
                return new alaw();
            case 4:
                return new aihh(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(alaw.class);
            default:
                return null;
        }
    }
}
