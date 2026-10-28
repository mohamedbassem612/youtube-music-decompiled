package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asjc extends aihn implements aiis {
    public static final asjc a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        asjc asjcVar = new asjc();
        a = asjcVar;
        aihn.registerDefaultInstance(asjc.class, asjcVar);
    }

    private asjc() {
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003<\u0000", new Object[]{"c", "b", asja.class, asiz.class, asix.class});
            case 3:
                return new asjc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asjc.class);
            default:
                return null;
        }
    }
}
