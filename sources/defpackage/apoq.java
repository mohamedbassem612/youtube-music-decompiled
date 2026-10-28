package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apoq extends aihn implements aiis {
    public static final apoq a;
    public static final aihl b;
    public int c;
    public Object e;
    public apoo h;
    public apon i;
    public apji j;
    public apji k;
    public apom n;
    public int o;
    public float q;
    public int r;
    public boolean s;
    public apop t;
    public apok u;
    public apod v;
    public apji w;
    private int x;
    private apor y;
    public int d = 0;
    private byte z = 2;
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public String l = "";
    public aigj m = aigj.d;
    public String p = "";

    static {
        apoq apoqVar = new apoq();
        a = apoqVar;
        aihn.registerDefaultInstance(apoq.class, apoqVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, apoqVar, apoqVar, null, 49399797, aika.MESSAGE, apoq.class);
    }

    private apoq() {
        emptyProtobufList();
        emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0001\u0015\u0001\u0002\u0001.\u0015\u0000\u0002\u000b\u0001Л\u0002Л\u0004ည\f\u0005ᐉ\u0000\u0006ᐉ\u0001\u0007ᐉ\u0005\rဈ\t\u000fᐉ\u0011\u0010᠌\u0012\u0011ဈ\u0013\u0012᠌\u0015\u0013ᐉ\u0006\u0016ᐉ\b\u0017ဇ\u0018\u001a7\u0000\u001fᐉ\u001b ᐉ\u001c\"ခ\u0014#ဉ\u001e(<\u0000.ᐉ&", new Object[]{"e", "d", "c", "x", "f", apox.class, "g", apos.class, "m", "y", "h", "i", "l", "n", "o", apdr.m, "p", "r", apdr.n, "j", "k", "s", "t", "u", "q", "v", apou.class, "w"});
            case 3:
                return new apoq();
            case 4:
                return new aihf((boolean[][][]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apoq.class);
            default:
                return null;
        }
    }
}
