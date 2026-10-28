package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwl extends aihn implements aiis {
    public static final aqwl a;
    private int b;
    private aqwi c;
    private byte d = 2;

    static {
        aqwl aqwlVar = new aqwl();
        a = aqwlVar;
        aihn.registerDefaultInstance(aqwl.class, aqwlVar);
    }

    private aqwl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf706䋵\uf706䋵\u0001\u0000\u0000\u0001\uf706䋵ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqwl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwl.class);
            default:
                return null;
        }
    }
}
