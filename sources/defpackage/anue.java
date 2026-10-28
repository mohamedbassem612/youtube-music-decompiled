package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anue extends aihn implements aiis {
    public static final anue a;
    public static final aihl b;
    public int c;
    public Object e;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean l;
    public boolean m;
    public aofu n;
    public int d = 0;
    private byte o = 2;
    public aigj f = aigj.d;
    public String k = "";

    static {
        anue anueVar = new anue();
        a = anueVar;
        aihn.registerDefaultInstance(anue.class, anueVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, anueVar, anueVar, null, 369956688, aika.MESSAGE, anue.class);
    }

    private anue() {
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
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ည\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004\u0006;\u0000\u0007;\u0000\bဈ\u0005\tဇ\u0006\nဇ\u0007\u000bᐉ\b", new Object[]{"e", "d", "c", "f", "g", aofw.n, "h", "i", "j", aofw.d, "k", "l", "m", "n"});
            case 3:
                return new anue();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anue.class);
            default:
                return null;
        }
    }
}
