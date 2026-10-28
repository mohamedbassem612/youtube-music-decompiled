package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aldz extends aihn implements aiis {
    public static final aldz a;
    public Object c;
    public alop d;
    private int e;
    public int b = 0;
    private byte f = 2;

    static {
        aldz aldzVar = new aldz();
        a = aldzVar;
        aihn.registerDefaultInstance(aldz.class, aldzVar);
    }

    private aldz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002м\u0000\u0003<\u0000", new Object[]{"c", "b", "e", "d", aldx.class, aldy.class});
            case 3:
                return new aldz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldz.class);
            default:
                return null;
        }
    }
}
