package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aogo extends aihn implements aiis {
    public static final aogo a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aogo aogoVar = new aogo();
        a = aogoVar;
        aihn.registerDefaultInstance(aogo.class, aogoVar);
    }

    private aogo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000ﱃ\u196f\ue607⨅\u0003\u0000\u0000\u0003ﱃ\u196fм\u0000\uf321Ẑм\u0000\ue607⨅м\u0000", new Object[]{"c", "b", akmh.class, akdd.class, arat.class});
            case 3:
                return new aogo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aogo.class);
            default:
                return null;
        }
    }
}
