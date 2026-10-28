package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ankj extends aihn implements aiis {
    public static final ankj a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ankj ankjVar = new ankj();
        a = ankjVar;
        aihn.registerDefaultInstance(ankj.class, ankjVar);
    }

    private ankj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf5d8㇁\uf5d8㇁\u0001\u0000\u0000\u0001\uf5d8㇁м\u0000", new Object[]{"c", "b", ankk.class});
            case 3:
                return new ankj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ankj.class);
            default:
                return null;
        }
    }
}
