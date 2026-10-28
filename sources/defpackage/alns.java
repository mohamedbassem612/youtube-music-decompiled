package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alns extends aihn implements aiis {
    public static final alns a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alns alnsVar = new alns();
        a = alnsVar;
        aihn.registerDefaultInstance(alns.class, alnsVar);
    }

    private alns() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue809ᶳ陼퇆\u0004\u0000\u0000\u0004\ue809ᶳм\u0000\ue87bᶳм\u0000\uf492䤳м\u0000陼퇆м\u0000", new Object[]{"c", "b", ajza.class, ajye.class, akrn.class, ajzj.class});
            case 3:
                return new alns();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alns.class);
            default:
                return null;
        }
    }
}
