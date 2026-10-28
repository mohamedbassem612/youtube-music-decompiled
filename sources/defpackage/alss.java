package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alss extends aihn implements aiis {
    public static final alss a;
    public int b;
    public alop c;
    public ajwm f;
    public aigj g;
    private ajwm h;
    private albe i;
    private byte j = 2;
    public aiie d = emptyProtobufList();
    public String e = "";

    static {
        alss alssVar = new alss();
        a = alssVar;
        aihn.registerDefaultInstance(alss.class, alssVar);
    }

    private alss() {
        aigj aigjVar = aigj.d;
        this.g = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0005\u0001ᐉ\u0000\u0003Л\u0007ᐉ\u0005\bည\u0007\tဈ\u0001\nᐉ\u0006̉ᐉ\b", new Object[]{"b", "c", "d", alst.class, "f", "g", "e", "h", "i"});
            case 3:
                return new alss();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alss.class);
            default:
                return null;
        }
    }
}
