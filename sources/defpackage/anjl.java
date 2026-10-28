package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anjl extends aihn implements aiis {
    public static final anjl a;
    private int b;
    private askp c;
    private askp d;
    private apji e;
    private byte f = 2;

    static {
        anjl anjlVar = new anjl();
        a = anjlVar;
        aihn.registerDefaultInstance(anjl.class, anjlVar);
    }

    private anjl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anjl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anjl.class);
            default:
                return null;
        }
    }
}
