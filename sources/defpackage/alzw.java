package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alzw extends aihn implements aiis {
    public static final alzw a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private byte f = 2;

    static {
        alzw alzwVar = new alzw();
        a = alzwVar;
        aihn.registerDefaultInstance(alzw.class, alzwVar);
    }

    private alzw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0000\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alzw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzw.class);
            default:
                return null;
        }
    }
}
