package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqvq extends aihn implements aiis {
    public static final aqvq a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        aqvq aqvqVar = new aqvq();
        a = aqvqVar;
        aihn.registerDefaultInstance(aqvq.class, aqvqVar);
    }

    private aqvq() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqvq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvq.class);
            default:
                return null;
        }
    }
}
