package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arot extends aihn implements aiis {
    public static final arot a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        arot arotVar = new arot();
        a = arotVar;
        aihn.registerDefaultInstance(arot.class, arotVar);
    }

    private arot() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ufff8╗ﾟⶡ\u0002\u0000\u0000\u0001\ufff8╗м\u0000ﾟⶡ<\u0000", new Object[]{"c", "b", arov.class, arou.class});
            case 3:
                return new arot();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arot.class);
            default:
                return null;
        }
    }
}
