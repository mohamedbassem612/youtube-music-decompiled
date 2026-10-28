package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aocx extends aihn implements aiis {
    public static final aocx a;
    public aqed b;
    private int c;
    private byte d = 2;

    static {
        aocx aocxVar = new aocx();
        a = aocxVar;
        aihn.registerDefaultInstance(aocx.class, aocxVar);
    }

    private aocx() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new aocx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aocx.class);
            default:
                return null;
        }
    }
}
