package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akaw extends aihn implements aiis {
    public static final akaw a;
    private int b;
    private alay c;
    private alay d;
    private akax e;
    private ajwo f;
    private alay g;
    private apji h;
    private alay i;
    private byte j = 2;

    static {
        akaw akawVar = new akaw();
        a = akawVar;
        aihn.registerDefaultInstance(akaw.class, akawVar);
    }

    private akaw() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0005\bᐉ\u0006\rᐉ\u000b\u000eᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new akaw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akaw.class);
            default:
                return null;
        }
    }
}
