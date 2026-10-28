package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class assr extends aihi implements aihj {
    public static final assr a;
    public int b;
    public Object d;
    public boolean e;
    public int c = 0;
    private byte f = 2;

    static {
        assr assrVar = new assr();
        a = assrVar;
        aihn.registerDefaultInstance(assr.class, assrVar);
    }

    private assr() {
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0004ဇ\u0001", new Object[]{"d", "c", "b", asnk.class, "e"});
            case 3:
                return new assr();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assr.class);
            default:
                return null;
        }
    }
}
