package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiof extends aihn implements aiis {
    public static final aiof a;
    public int b;
    public int f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public long l;
    public int q;
    public String c = "";
    public String d = "";
    public String e = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";

    static {
        aiof aiofVar = new aiof();
        a = aiofVar;
        aihn.registerDefaultInstance(aiof.class, aiofVar);
    }

    private aiof() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"b", "c", "e", "f", "g", "d", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (iOrdinal == 3) {
            return new aiof();
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
        return aihn.getParserForClass(aiof.class);
    }
}
