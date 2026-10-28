package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvf extends aihn implements aiis {
    public static final aqvf a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;

    static {
        aqvf aqvfVar = new aqvf();
        a = aqvfVar;
        aihn.registerDefaultInstance(aqvf.class, aqvfVar);
    }

    private aqvf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\f\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005\fᐉ\u0002", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new aqvf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvf.class);
            default:
                return null;
        }
    }
}
