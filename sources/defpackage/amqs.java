package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqs extends aihn implements aiis {
    public static final amqs a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amqs amqsVar = new amqs();
        a = amqsVar;
        aihn.registerDefaultInstance(amqs.class, amqsVar);
    }

    private amqs() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ueb11ἑﹸ\ue6f4\u0007\u0004\u0000\u0000\u0004\ueb11ἑм\u0000ｙ㼵м\u0000\uf492䤳м\u0000ﹸ\ue6f4\u0007м\u0000", new Object[]{"c", "b", ajnf.class, amop.class, akrn.class, apct.class});
            case 3:
                return new amqs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqs.class);
            default:
                return null;
        }
    }
}
