package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aohy extends aihn implements aiis {
    public static final aohy a;
    public int b;
    public akmh c;
    public arat d;
    public akdd e;
    private byte f = 2;

    static {
        aohy aohyVar = new aohy();
        a = aohyVar;
        aihn.registerDefaultInstance(aohy.class, aohyVar);
    }

    private aohy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001ﱃ\u196f\ue607⨅\u0003\u0000\u0000\u0003ﱃ\u196fᐉ\u0000\uf321Ẑᐉ\u0002\ue607⨅ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new aohy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohy.class);
            default:
                return null;
        }
    }
}
