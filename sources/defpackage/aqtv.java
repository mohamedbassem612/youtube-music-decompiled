package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqtv extends aihn implements aiis {
    public static final aqtv a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private apup g;
    private byte h = 2;

    static {
        aqtv aqtvVar = new aqtv();
        a = aqtvVar;
        aihn.registerDefaultInstance(aqtv.class, aqtvVar);
    }

    private aqtv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0005\bᐉ\u0002", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new aqtv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtv.class);
            default:
                return null;
        }
    }
}
