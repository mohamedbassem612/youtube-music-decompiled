package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arrc extends aihn implements aiis {
    public static final arrc a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        arrc arrcVar = new arrc();
        a = arrcVar;
        aihn.registerDefaultInstance(arrc.class, arrcVar);
    }

    private arrc() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", arrd.class, arrf.class, arre.class, arrg.class});
            case 3:
                return new arrc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arrc.class);
            default:
                return null;
        }
    }
}
