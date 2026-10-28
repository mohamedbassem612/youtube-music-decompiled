package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alvy extends aihn implements aiis {
    public static final alvy a;
    public int b;
    public alop c;
    public int d;
    public alvz e;
    public alwd f;
    public ajwo i;
    public apji k;
    public aigj l;
    public String m;
    public aigj n;
    private ajwo o;
    private albe p;
    private byte q = 2;
    public aiie g = emptyProtobufList();
    public String h = "";
    public aiie j = emptyProtobufList();

    static {
        alvy alvyVar = new alvy();
        a = alvyVar;
        aihn.registerDefaultInstance(alvy.class, alvyVar);
    }

    private alvy() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.l = aigjVar;
        this.m = "";
        this.n = aigjVar;
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
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001̉\u000e\u0000\u0002\b\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0003\u0007Л\bဈ\b\tᐉ\t\nᐉ\n\f\u001b\rᐉ\u0005\u000eᐉ\u000b\u0011ည\r\u0014ဈ\u000f\u0017ည\u0011̉ᐉ\u000e", new Object[]{"b", "c", "d", alre.d, "e", "g", ajwo.class, "h", "i", "o", "j", alwb.class, "f", "k", "l", "m", "n", "p"});
            case 3:
                return new alvy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvy.class);
            default:
                return null;
        }
    }
}
