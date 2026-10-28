package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqme extends aihn implements aiis {
    public static final aqme a;
    private int b;
    private askp c;
    private askp d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        aqme aqmeVar = new aqme();
        a = aqmeVar;
        aihn.registerDefaultInstance(aqme.class, aqmeVar);
    }

    private aqme() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0004\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqme();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqme.class);
            default:
                return null;
        }
    }
}
