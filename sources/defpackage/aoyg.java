package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoyg extends aihn implements aiis {
    public static final aoyg a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private byte g = 2;

    static {
        aoyg aoygVar = new aoyg();
        a = aoygVar;
        aihn.registerDefaultInstance(aoyg.class, aoygVar);
    }

    private aoyg() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\bᐉ\u0000", new Object[]{"b", "d", "e", "f", "c"});
            case 3:
                return new aoyg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoyg.class);
            default:
                return null;
        }
    }
}
