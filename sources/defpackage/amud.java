package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amud extends aihi implements aihj {
    public static final aihw a = new qle(8);
    public static final amud b;
    public int c;
    public argh e;
    public aldf f;
    public ajuz h;
    public atqc i;
    private byte k = 2;
    public aigj d = aigj.d;
    public aihv g = emptyIntList();

    static {
        amud amudVar = new amud();
        b = amudVar;
        aihn.registerDefaultInstance(amud.class, amudVar);
    }

    private amud() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0002\u0001ည\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ࠞ\u0007ᐉ\u0003\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", allf.r, "h", "i"});
            case 3:
                return new amud();
            case 4:
                return new aihh(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(amud.class);
            default:
                return null;
        }
    }
}
