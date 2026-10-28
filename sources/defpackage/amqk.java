package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqk extends aihn implements aiis {
    public static final amqk a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amqk amqkVar = new amqk();
        a = amqkVar;
        aihn.registerDefaultInstance(amqk.class, amqkVar);
    }

    private amqk() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf501㸀\uf492䤳\u0003\u0000\u0000\u0003\uf501㸀м\u0000ﳌ䈠м\u0000\uf492䤳м\u0000", new Object[]{"c", "b", amol.class, akuo.class, akrn.class});
            case 3:
                return new amqk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqk.class);
            default:
                return null;
        }
    }
}
