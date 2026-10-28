package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqen extends aihn implements aiis {
    public static final aqen a;
    public int b;
    public alay d;
    public alay e;
    public alay f;
    public boolean g;
    public boolean h;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private ajng p;
    private aqem q;
    private aqep r;
    private aqeq s;
    private alhs t;
    private ajwo u;
    private byte v = 2;
    public String c = "";
    public aiie i = emptyProtobufList();

    static {
        aqen aqenVar = new aqen();
        a = aqenVar;
        aihn.registerDefaultInstance(aqen.class, aqenVar);
    }

    private aqen() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001 \u0013\u0000\u0001\u0010\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ဇ\n\u0004ဇ\f\u0005ᐉ\u0011\u0007ဈ\u0000\tᐉ\b\nᐉ\t\u000bᐉ\u0012\fᐉ\u0002\rᐉ\u0003\u0010ᐉ\u0007\u0012Л\u0014ᐉ\u0005\u0015ᐉ\u000e\u0016ᐉ\u0010\u0017ᐉ\u0006\u0018ᐉ\u0014 ᐉ\u001f", new Object[]{"b", "j", "k", "g", "h", "r", "c", "n", "o", "s", "d", "e", "m", "i", ajwo.class, "l", "p", "q", "f", "t", "u"});
            case 3:
                return new aqen();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqen.class);
            default:
                return null;
        }
    }
}
