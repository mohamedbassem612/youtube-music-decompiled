package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqu extends aihn implements aiis {
    public static final amqu a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amqu amquVar = new amqu();
        a = amquVar;
        aihn.registerDefaultInstance(amqu.class, amquVar);
    }

    private amqu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue68a㶈\ue9ba\uf05c\u0007\u0003\u0000\u0000\u0003\ue68a㶈м\u0000\uf407媆м\u0000\ue9ba\uf05c\u0007м\u0000", new Object[]{"c", "b", amnw.class, amqd.class, amqc.class});
            case 3:
                return new amqu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqu.class);
            default:
                return null;
        }
    }
}
