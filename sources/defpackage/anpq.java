package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpq extends aihn implements aiis {
    public static final anpq a;
    public int b;
    public apji c;
    public int e;
    public apji f;
    public boolean g;
    public aiqe i;
    private byte j = 2;
    public aiie d = emptyProtobufList();
    public aigj h = aigj.d;

    static {
        anpq anpqVar = new anpq();
        a = anpqVar;
        aihn.registerDefaultInstance(anpq.class, anpqVar);
    }

    private anpq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0005ည\u0005\u0006ဉ\u0006\u0007ဇ\u0003\b᠌\u0001", new Object[]{"b", "c", "d", apji.class, "f", "h", "i", "g", "e", ajpr.s});
            case 3:
                return new anpq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpq.class);
            default:
                return null;
        }
    }
}
