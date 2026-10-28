package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alxv extends aihn implements aiis {
    public static final alxv a;
    private Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alxv alxvVar = new alxv();
        a = alxvVar;
        aihn.registerDefaultInstance(alxv.class, alxvVar);
    }

    private alxv() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000黎䄊ﵮ䄊\u0002\u0000\u0000\u0002黎䄊м\u0000ﵮ䄊м\u0000", new Object[]{"c", "b", amof.class, amog.class});
            case 3:
                return new alxv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxv.class);
            default:
                return null;
        }
    }
}
