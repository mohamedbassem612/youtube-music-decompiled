package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahja extends aihn implements aiis {
    public static final ahja a;
    public int b;
    public int c;
    public ahjb d;
    public aigj e;
    public aigj f;
    public aigj g;
    public aigj h;
    public aigj i;
    public aigj j;

    static {
        ahja ahjaVar = new ahja();
        a = ahjaVar;
        aihn.registerDefaultInstance(ahja.class, ahjaVar);
    }

    private ahja() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.f = aigjVar;
        this.g = aigjVar;
        this.h = aigjVar;
        this.i = aigjVar;
        this.j = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ahja();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ahja.class);
    }
}
