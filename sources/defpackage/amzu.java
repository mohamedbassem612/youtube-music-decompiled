package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amzu extends aihn implements aiis {
    public static final amzu a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amzu amzuVar = new amzu();
        a = amzuVar;
        aihn.registerDefaultInstance(amzu.class, amzuVar);
    }

    private amzu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0001\u0000\uec64⿻\uec64⿻\u0001\u0000\u0000\u0001\uec64⿻м\u0000", new Object[]{"c", "b", anki.class});
            case 3:
                return new amzu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amzu.class);
            default:
                return null;
        }
    }
}
