package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apsa extends aihn implements aiis {
    public static final apsa a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private aprz f;
    private apji g;
    private byte h = 2;

    static {
        apsa apsaVar = new apsa();
        a = apsaVar;
        aihn.registerDefaultInstance(apsa.class, apsaVar);
    }

    private apsa() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\u0002", new Object[]{"b", "c", "e", "f", "g", "d"});
            case 3:
                return new apsa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apsa.class);
            default:
                return null;
        }
    }
}
