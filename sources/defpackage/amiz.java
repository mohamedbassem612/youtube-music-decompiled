package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amiz extends aihn implements aiis {
    public static final amiz a;
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public long j;
    public boolean k;
    public boolean l;
    public int m;
    public amja n;
    public boolean o;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        amiz amizVar = new amiz();
        a = amizVar;
        aihn.registerDefaultInstance(amiz.class, amizVar);
    }

    private amiz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = amjn.d;
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဈ\u0006\bဂ\u0007\tဇ\b\nဇ\t\u000b᠌\n\fဉ\u000b\rဇ\f", new Object[]{"b", "c", "d", "e", aihtVar, "f", aihtVar, "g", amys.i, "h", amys.h, "i", "j", "k", "l", "m", amys.g, "n", "o"});
        }
        if (iOrdinal == 3) {
            return new amiz();
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
        return aihn.getParserForClass(amiz.class);
    }
}
