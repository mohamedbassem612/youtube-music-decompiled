package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asnu extends aihn implements aiis {
    public static final asnu a;
    public int b;
    public asnw c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        asnu asnuVar = new asnu();
        a = asnuVar;
        aihn.registerDefaultInstance(asnu.class, asnuVar);
    }

    private asnu() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asnu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnu.class);
            default:
                return null;
        }
    }
}
