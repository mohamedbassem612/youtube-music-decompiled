package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajql extends aihn implements aiis {
    public static final ajql a;
    private int b;
    private ajqk c;
    private ajqk d;
    private ajqk e;
    private ajqk f;
    private byte g = 2;

    static {
        ajql ajqlVar = new ajql();
        a = ajqlVar;
        aihn.registerDefaultInstance(ajql.class, ajqlVar);
    }

    private ajql() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajql();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajql.class);
            default:
                return null;
        }
    }
}
