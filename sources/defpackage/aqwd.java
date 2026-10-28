package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwd extends aihn implements aiis {
    public static final aqwd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajng g;
    private ajng h;
    private ajng i;
    private byte j = 2;

    static {
        aqwd aqwdVar = new aqwd();
        a = aqwdVar;
        aihn.registerDefaultInstance(aqwd.class, aqwdVar);
    }

    private aqwd() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\b\nᐉ\u0003\fᐉ\n\rᐉ\t", new Object[]{"b", "c", "d", "e", "g", "f", "i", "h"});
            case 3:
                return new aqwd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwd.class);
            default:
                return null;
        }
    }
}
