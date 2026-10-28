package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augr extends aihn implements aiis {
    public static final augr a;
    public int b;
    public int f;
    public boolean j;
    public boolean k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        augr augrVar = new augr();
        a = augrVar;
        aihn.registerDefaultInstance(augr.class, augrVar);
    }

    private augr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006᠌\u0006\u0007ဈ\u0007\bဈ\b\nဈ\n\u000bဇ\u000b\fဇ\f\rဈ\u0003", new Object[]{"b", "c", "d", "f", audg.e, "g", "h", "i", "j", "k", "e"});
        }
        if (iOrdinal == 3) {
            return new augr();
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
        return aihn.getParserForClass(augr.class);
    }
}
