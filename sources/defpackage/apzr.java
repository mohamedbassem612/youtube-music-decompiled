package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apzr extends aihn implements aiis {
    public static final apzr a;
    public aqpq b;
    private int c;
    private byte d = 2;

    static {
        apzr apzrVar = new apzr();
        a = apzrVar;
        aihn.registerDefaultInstance(apzr.class, apzrVar);
    }

    private apzr() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new apzr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzr.class);
            default:
                return null;
        }
    }
}
