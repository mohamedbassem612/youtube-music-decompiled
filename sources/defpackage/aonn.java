package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonn extends aihn implements aiis {
    public static final aonn a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aonn aonnVar = new aonn();
        a = aonnVar;
        aihn.registerDefaultInstance(aonn.class, aonnVar);
    }

    private aonn() {
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000\ueca8㠇\uf173韏\u0003\u0000\u0000\u0003\ueca8㠇м\u0000\uf492䤳м\u0000\uf173韏м\u0000", new Object[]{"c", "b", aonl.class, akrn.class, aonk.class});
            case 3:
                return new aonn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aonn.class);
            default:
                return null;
        }
    }
}
