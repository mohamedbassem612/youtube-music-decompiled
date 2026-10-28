package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augu extends aihn implements aiis {
    public static final augu a;
    public int b;
    public float d;
    public aimw e;
    public aimw f;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public String c = "";
    public String g = "";
    public String m = "";

    static {
        augu auguVar = new augu();
        a = auguVar;
        aihn.registerDefaultInstance(augu.class, auguVar);
    }

    private augu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0004\u0007ဌ\u0005\b᠌\u0006\t᠌\u0007\nဇ\b\u000b᠌\t\fဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", atxs.g, "j", aram.q, "k", "l", arfr.e, "m"});
        }
        if (iOrdinal == 3) {
            return new augu();
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
        return aihn.getParserForClass(augu.class);
    }
}
