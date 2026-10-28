package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apmt extends aihn implements aiis {
    public static final apmt a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public akoj j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;

    static {
        apmt apmtVar = new apmt();
        a = apmtVar;
        aihn.registerDefaultInstance(apmt.class, apmtVar);
    }

    private apmt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0007ဇ\u0006\bင\u0007\tဉ\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eဇ\r", new Object[]{"b", "c", "d", "e", "f", apjs.m, "g", apjs.l, "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new apmt();
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
        return aihn.getParserForClass(apmt.class);
    }
}
