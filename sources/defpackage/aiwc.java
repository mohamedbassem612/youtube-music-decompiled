package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiwc extends aihn implements aiis {
    public static final aiwc a;
    public aiwe b;
    public ajwo c;
    private int d;
    private ajwo e;
    private byte f = 2;

    static {
        aiwc aiwcVar = new aiwc();
        a = aiwcVar;
        aihn.registerDefaultInstance(aiwc.class, aiwcVar);
    }

    private aiwc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"d", "b", "c", "e"});
            case 3:
                return new aiwc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwc.class);
            default:
                return null;
        }
    }
}
