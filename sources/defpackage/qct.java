package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qct extends aihn implements aiis {
    public static final qct a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        qct qctVar = new qct();
        a = qctVar;
        aihn.registerDefaultInstance(qct.class, qctVar);
    }

    private qct() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", axgh.class, qcu.class, qcv.class, qcw.class});
            case 3:
                return new qct();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(qct.class);
            default:
                return null;
        }
    }
}
