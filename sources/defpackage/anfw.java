package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anfw extends aihn implements aiis {
    public static final anfw a;
    public int b;
    public alay c;
    public alja d;
    public alja e;
    public ajwo f;
    public anfu h;
    public boolean i;
    public int j;
    private byte l = 2;
    public aigj g = aigj.d;
    public boolean k = true;

    static {
        anfw anfwVar = new anfw();
        a = anfwVar;
        aihn.registerDefaultInstance(anfw.class, anfwVar);
    }

    private anfw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0005\u0005ည\u0007\u0007ဉ\b\bဇ\n\t᠌\u000b\u000bᐉ\u0004\u000eဇ\u000e", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", amyr.f, "e", "k"});
            case 3:
                return new anfw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfw.class);
            default:
                return null;
        }
    }
}
