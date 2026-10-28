package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asnc extends aihn implements aiis {
    public static final asnc a;
    public int b;
    public int d;
    public int g;
    public asnb j;
    public asmz k;
    public int m;
    public asmy n;
    public float p;
    public int q;
    public int c = 120;
    public String e = "";
    public String f = "";
    public aihv h = emptyIntList();
    public String i = "";
    public String l = "";
    public String o = "";

    static {
        asnc asncVar = new asnc();
        a = asncVar;
        aihn.registerDefaultInstance(asnc.class, asncVar);
    }

    private asnc() {
    }

    public final void a() {
        aihv aihvVar = this.h;
        if (aihvVar.c()) {
            return;
        }
        this.h = aihn.mutableCopy(aihvVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\bဈ\u0005\tဉ\u0006\n'\u000bဉ\u0007\fဈ\b\rင\t\u000eဉ\n\u000fဈ\u000b\u0010ခ\f\u0011င\r", new Object[]{"b", "c", asel.t, "d", aqvi.f, "e", "f", "g", "i", "j", "h", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (iOrdinal == 3) {
            return new asnc();
        }
        if (iOrdinal == 4) {
            return new aihf((short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(asnc.class);
        }
        return null;
    }
}
