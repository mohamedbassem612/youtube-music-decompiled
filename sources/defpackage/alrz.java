package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alrz extends aihn implements aiis {
    public static final alrz a;
    public Object c;
    public alop d;
    private int f;
    private albe g;
    public int b = 0;
    private byte h = 2;
    public aigj e = aigj.d;

    static {
        alrz alrzVar = new alrz();
        a = alrzVar;
        aihn.registerDefaultInstance(alrz.class, alrzVar);
    }

    private alrz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003м\u0000\u0005ည\u0003\u0006м\u0000̉ᐉ\u0004", new Object[]{"c", "b", "f", "d", alsa.class, "e", ajwo.class, "g"});
            case 3:
                return new alrz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrz.class);
            default:
                return null;
        }
    }
}
