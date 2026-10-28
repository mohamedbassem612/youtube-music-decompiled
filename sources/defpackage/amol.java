package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amol extends aihn implements aiis {
    public static final amol a;
    public Object c;
    private int d;
    private apji e;
    public int b = 0;
    private byte f = 2;

    static {
        amol amolVar = new amol();
        a = amolVar;
        aihn.registerDefaultInstance(amol.class, amolVar);
    }

    private amol() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001м\u0000\u0005м\u0000\u0007ᐉ\u0003", new Object[]{"c", "b", "d", alay.class, apji.class, "e"});
            case 3:
                return new amol();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amol.class);
            default:
                return null;
        }
    }
}
