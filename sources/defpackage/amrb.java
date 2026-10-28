package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amrb extends aihn implements aiis {
    public static final amrb a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amrb amrbVar = new amrb();
        a = amrbVar;
        aihn.registerDefaultInstance(amrb.class, amrbVar);
    }

    private amrb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf45c㼺\ue932怱\u0003\u0000\u0000\u0003\uf45c㼺м\u0000\uf478㼺м\u0000\ue932怱м\u0000", new Object[]{"c", "b", amrd.class, amrc.class, amra.class});
            case 3:
                return new amrb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amrb.class);
            default:
                return null;
        }
    }
}
