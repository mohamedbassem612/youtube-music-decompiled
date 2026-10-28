package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqp extends aihn implements aiis {
    public static final aiqp a;
    private int b;
    private aiqq c;
    private byte d = 2;

    static {
        aiqp aiqpVar = new aiqp();
        a = aiqpVar;
        aihn.registerDefaultInstance(aiqp.class, aiqpVar);
    }

    private aiqp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new aiqp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiqp.class);
            default:
                return null;
        }
    }
}
