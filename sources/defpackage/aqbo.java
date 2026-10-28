package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqbo extends aihn implements aiis {
    public static final aqbo a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        aqbo aqboVar = new aqbo();
        a = aqboVar;
        aihn.registerDefaultInstance(aqbo.class, aqboVar);
    }

    private aqbo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new aqbo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbo.class);
            default:
                return null;
        }
    }
}
