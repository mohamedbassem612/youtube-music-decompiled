package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxn extends aihn implements aiis {
    public static final anxn a;
    public int b;
    public alay c;
    public alja d;
    public int e;
    public int f;
    public apji g;
    public boolean h;
    public aiqe i;
    private byte k = 2;
    public aigj j = aigj.d;

    static {
        anxn anxnVar = new anxn();
        a = anxnVar;
        aihn.registerDefaultInstance(anxn.class, anxnVar);
    }

    private anxn() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0004ဉ\u0006\u0005ည\u0007\u0007ဇ\u0005\b᠌\u0002\t᠌\u0003", new Object[]{"b", "c", "d", "g", "i", "j", "h", "e", anvw.m, "f", anvw.l});
            case 3:
                return new anxn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxn.class);
            default:
                return null;
        }
    }
}
