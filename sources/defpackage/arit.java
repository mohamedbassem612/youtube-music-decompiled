package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arit extends aihn implements aiis {
    public static final arit a;
    private int b;
    private aris c;
    private aris d;
    private akcz e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        arit aritVar = new arit();
        a = aritVar;
        aihn.registerDefaultInstance(arit.class, aritVar);
    }

    private arit() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new arit();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arit.class);
            default:
                return null;
        }
    }
}
