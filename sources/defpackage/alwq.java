package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwq extends aihn implements aiis {
    public static final alwq a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alwq alwqVar = new alwq();
        a = alwqVar;
        aihn.registerDefaultInstance(alwq.class, alwqVar);
    }

    private alwq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue467╢\uf2e8䕺\u0002\u0000\u0000\u0002\ue467╢м\u0000\uf2e8䕺м\u0000", new Object[]{"c", "b", aovk.class, alat.class});
            case 3:
                return new alwq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwq.class);
            default:
                return null;
        }
    }
}
