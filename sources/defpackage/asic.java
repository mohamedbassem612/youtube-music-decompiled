package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asic extends aihn implements aiis {
    public static final asic a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        asic asicVar = new asic();
        a = asicVar;
        aihn.registerDefaultInstance(asic.class, asicVar);
    }

    private asic() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"c", "b", aqhn.class, ajlb.class});
            case 3:
                return new asic();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asic.class);
            default:
                return null;
        }
    }
}
