package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axhy extends aihn implements aiis {
    public static final axhy a;
    public int b;
    public int c;
    private axhx e;
    private byte f = 2;
    public int d = 1;

    static {
        axhy axhyVar = new axhy();
        a = axhyVar;
        aihn.registerDefaultInstance(axhy.class, axhyVar);
    }

    private axhy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", axhk.e, "d", "e"});
            case 3:
                return new axhy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axhy.class);
            default:
                return null;
        }
    }
}
