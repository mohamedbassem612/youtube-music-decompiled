package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aofe extends aihn implements aiis {
    public static final aofe a;
    public int b;
    public String c = "";
    public String d = "";
    public String e;
    public String f;
    public int g;
    public String h;
    public int i;
    public long j;
    public int k;
    public anok l;
    public String m;

    static {
        aofe aofeVar = new aofe();
        a = aofeVar;
        aihn.registerDefaultInstance(aofe.class, aofeVar);
    }

    private aofe() {
        emptyProtobufList();
        this.e = "";
        this.f = "";
        this.h = "";
        this.m = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0006ဈ\u0004\u0007ဈ\u0005\b᠌\u0006\tဈ\u0007\n᠌\b\u000bဂ\t\f᠌\n\rဉ\u000b\u000eဈ\f", new Object[]{"b", "c", "d", "e", "f", "g", anms.e, "h", "i", amyr.u, "j", "k", aofw.d, "l", "m"});
        }
        if (iOrdinal == 3) {
            return new aofe();
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
        return aihn.getParserForClass(aofe.class);
    }
}
