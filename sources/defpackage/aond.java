package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aond extends aihi implements aihj {
    public static final aond a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        aond aondVar = new aond();
        a = aondVar;
        aihn.registerDefaultInstance(aond.class, aondVar);
    }

    private aond() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0004\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aond();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aond.class);
            default:
                return null;
        }
    }
}
