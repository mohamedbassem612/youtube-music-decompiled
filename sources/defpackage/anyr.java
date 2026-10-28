package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anyr extends aihn implements aiis {
    public static final anyr a;
    public static final aihl b;
    public int c;
    public int e;
    public anzd f;
    public ankd g;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public long n;
    private byte o = 2;
    public aigj d = aigj.d;
    public String h = "";
    public String i = "";

    static {
        anyr anyrVar = new anyr();
        a = anyrVar;
        aihn.registerDefaultInstance(anyr.class, anyrVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, anyrVar, anyrVar, null, 356057097, aika.MESSAGE, anyr.class);
    }

    private anyr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0002\u0001ည\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\nဇ\b\u000b᠌\t\fဇ\n\u000eဂ\f", new Object[]{"c", "d", "e", aofw.n, "f", "g", "h", "i", "j", "k", "l", aofw.d, "m", "n"});
            case 3:
                return new anyr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anyr.class);
            default:
                return null;
        }
    }
}
