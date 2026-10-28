package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqjq extends aihn implements aiis {
    public static final aqjq a;
    public int b;
    public alay c;
    public alay d;
    public apji e;
    public apji f;
    private byte g = 2;

    static {
        aqjq aqjqVar = new aqjq();
        a = aqjqVar;
        aihn.registerDefaultInstance(aqjq.class, aqjqVar);
    }

    private aqjq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqjq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjq.class);
            default:
                return null;
        }
    }
}
