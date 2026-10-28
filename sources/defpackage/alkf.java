package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alkf extends aihn implements aiis {
    public static final alkf a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alkf alkfVar = new alkf();
        a = alkfVar;
        aihn.registerDefaultInstance(alkf.class, alkfVar);
    }

    private alkf() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002\u083f\u0000", new Object[]{"c", "b", apjh.class, ahxv.a});
            case 3:
                return new alkf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkf.class);
            default:
                return null;
        }
    }
}
