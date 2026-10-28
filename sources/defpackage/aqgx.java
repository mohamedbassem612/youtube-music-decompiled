package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqgx extends aihn implements aiis {
    public static final aqgx a;
    public int b;
    public aqgt c;
    public aqgk d;
    public aqgo e;
    private aqgm f;
    private anji g;
    private byte h = 2;

    static {
        aqgx aqgxVar = new aqgx();
        a = aqgxVar;
        aihn.registerDefaultInstance(aqgx.class, aqgxVar);
    }

    private aqgx() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\ue55e⡇\uec8bꎥ\u0005\u0000\u0000\u0005\ue55e⡇ᐉ\u0000\ue1c5㙻ᐉ\u0001\uf6b6䣧ᐉ\u0002\ue628堙ᐉ\u0003\uec8bꎥᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqgx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgx.class);
            default:
                return null;
        }
    }
}
