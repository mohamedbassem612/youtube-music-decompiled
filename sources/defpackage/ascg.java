package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ascg extends aihn implements aiis {
    public static final ascg a;
    public int b;
    public anzd c;
    public ascf d;
    public areu e;
    public int f;
    private byte g = 2;

    static {
        ascg ascgVar = new ascg();
        a = ascgVar;
        aihn.registerDefaultInstance(ascg.class, ascgVar);
    }

    private ascg() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဌ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ascg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ascg.class);
            default:
                return null;
        }
    }
}
