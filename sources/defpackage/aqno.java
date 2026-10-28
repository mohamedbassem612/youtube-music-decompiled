package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqno extends aihn implements aiis {
    public static final aqno a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private ajwo g;
    private ajwo h;
    private byte i = 2;

    static {
        aqno aqnoVar = new aqno();
        a = aqnoVar;
        aihn.registerDefaultInstance(aqno.class, aqnoVar);
    }

    private aqno() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\u0003", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case 3:
                return new aqno();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqno.class);
            default:
                return null;
        }
    }
}
