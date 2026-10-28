package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alyp extends aihn implements aiis {
    public static final alyp a;
    public int b;
    public alop c;
    public apji d;
    private ajwo f;
    private albe g;
    private byte h = 2;
    public aigj e = aigj.d;

    static {
        alyp alypVar = new alyp();
        a = alypVar;
        aihn.registerDefaultInstance(alyp.class, alypVar);
    }

    private alyp() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "f", "e", "g"});
            case 3:
                return new alyp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyp.class);
            default:
                return null;
        }
    }
}
