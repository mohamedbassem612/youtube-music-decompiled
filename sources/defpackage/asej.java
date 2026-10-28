package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asej extends aihn implements aiis {
    public static final asej a;
    public int b;
    public int c;
    public int d;
    public askp e;
    public airx f;
    public int g;
    public askp h;
    public int i;
    public aseh j;
    public int k;
    private askp l;
    private askp m;
    private byte n = 2;

    static {
        asej asejVar = new asej();
        a = asejVar;
        aihn.registerDefaultInstance(asej.class, asejVar);
    }

    private asej() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0005\u0001᠌\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ᐉ\t\u0007ᐉ\n\bᐉ\u0005\tင\u0006\nဉ\u0007\f᠌\b", new Object[]{"b", "c", asel.a, "d", asel.b, "e", "f", "g", arke.t, "l", "m", "h", "i", "j", "k", arke.u});
            case 3:
                return new asej();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asej.class);
            default:
                return null;
        }
    }
}
