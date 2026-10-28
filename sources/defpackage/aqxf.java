package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxf extends aihn implements aiis {
    public static final aqxf a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private ajng h;
    private ajng i;
    private ajng j;
    private byte k = 2;

    static {
        aqxf aqxfVar = new aqxf();
        a = aqxfVar;
        aihn.registerDefaultInstance(aqxf.class, aqxfVar);
    }

    private aqxf() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0004\u0010\b\u0000\u0000\b\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\u000bᐉ\n\rᐉ\u000b\u000eᐉ\f\u0010ᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aqxf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxf.class);
            default:
                return null;
        }
    }
}
