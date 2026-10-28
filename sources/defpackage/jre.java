package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jre extends aihn implements aiis {
    public static final jre a;
    public long b;
    public int c;
    public int d;
    private int e;
    private byte f = 2;

    static {
        jre jreVar = new jre();
        a = jreVar;
        aihn.registerDefaultInstance(jre.class, jreVar);
    }

    private jre() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"e", "b", "c", "d"});
            case 3:
                return new jre();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(jre.class);
            default:
                return null;
        }
    }
}
