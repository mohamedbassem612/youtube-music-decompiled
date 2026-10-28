package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akql extends aihn implements aiis {
    public static final akql a;
    public int b;
    public akqk d;
    public akqk e;
    public int f;
    public int g;
    public int h;
    public int j;
    public float l;
    public String c = "";
    public String i = "";
    public String k = "";

    static {
        akql akqlVar = new akql();
        a = akqlVar;
        aihn.registerDefaultInstance(akql.class, akqlVar);
    }

    private akql() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0012\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005᠌\u0004\b᠌\u0005\tဈ\u0006\n᠌\u0007\u000bဈ\b\u0012ခ\u000f", new Object[]{"b", "c", "d", "e", "f", aram.t, "g", arfr.b, "h", arfr.e, "i", "j", arfr.f, "k", "l"});
        }
        if (iOrdinal == 3) {
            return new akql();
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
        return aihn.getParserForClass(akql.class);
    }
}
