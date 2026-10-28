package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqbv extends aihn implements aiis {
    public static final aqbv a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private ajwo g;
    private byte h = 2;

    static {
        aqbv aqbvVar = new aqbv();
        a = aqbvVar;
        aihn.registerDefaultInstance(aqbv.class, aqbvVar);
    }

    private aqbv() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u000bᐉ\u0004\fᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqbv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbv.class);
            default:
                return null;
        }
    }
}
