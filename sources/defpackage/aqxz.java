package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxz extends aihn implements aiis {
    public static final aqxz a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private byte h = 2;

    static {
        aqxz aqxzVar = new aqxz();
        a = aqxzVar;
        aihn.registerDefaultInstance(aqxz.class, aqxzVar);
    }

    private aqxz() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\r\u0005\u0000\u0000\u0005\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\u000bᐉ\u0007\rᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqxz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxz.class);
            default:
                return null;
        }
    }
}
