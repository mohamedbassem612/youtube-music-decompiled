package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alhn extends aihn implements aiis {
    public static final alhn a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alhn alhnVar = new alhn();
        a = alhnVar;
        aihn.registerDefaultInstance(alhn.class, alhnVar);
    }

    private alhn() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue9d4㋊\ue9d4㋊\u0001\u0000\u0000\u0001\ue9d4㋊м\u0000", new Object[]{"c", "b", alhj.class});
            case 3:
                return new alhn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhn.class);
            default:
                return null;
        }
    }
}
