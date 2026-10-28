package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amaf extends aihn implements aiis {
    public static final amaf a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amaf amafVar = new amaf();
        a = amafVar;
        aihn.registerDefaultInstance(amaf.class, amafVar);
    }

    private amaf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf897ᢰ\ue1ab㯆\u0004\u0000\u0000\u0004\uf897ᢰм\u0000\uf8afᢰм\u0000\uedf1㣊м\u0000\ue1ab㯆м\u0000", new Object[]{"c", "b", alzv.class, alzw.class, alby.class, alzq.class});
            case 3:
                return new amaf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amaf.class);
            default:
                return null;
        }
    }
}
