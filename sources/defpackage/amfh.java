package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amfh extends aihn implements aiis {
    public static final amfh a;
    public int b;
    public askp c;
    public askp d;
    public apji e;
    public amfg f;
    private apji g;
    private askp h;
    private apji i;
    private byte j = 2;

    static {
        amfh amfhVar = new amfh();
        a = amfhVar;
        aihn.registerDefaultInstance(amfh.class, amfhVar);
    }

    private amfh() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\nဉ\f\fᐉ\b\u000eᐉ\n", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i"});
            case 3:
                return new amfh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amfh.class);
            default:
                return null;
        }
    }
}
