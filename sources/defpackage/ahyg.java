package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahyg extends aihn implements aiis {
    public static final ahyg a;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public String f;
    public String g;
    public int h;
    public int i;
    public aigj j;
    public String k;

    static {
        ahyg ahygVar = new ahyg();
        a = ahygVar;
        aihn.registerDefaultInstance(ahyg.class, ahygVar);
    }

    private ahyg() {
        emptyProtobufList();
        this.f = "";
        this.g = "";
        this.j = aigj.d;
        this.k = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002\u0007᠌\u0005\b᠌\u0006\tည\u0007\u000bဈ\t", new Object[]{"b", "c", "d", "f", "g", "e", "h", ahxv.s, "i", ahzf.h, "j", "k"});
        }
        if (iOrdinal == 3) {
            return new ahyg();
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
        return aihn.getParserForClass(ahyg.class);
    }
}
