package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahzj extends aihn implements aiis {
    public static final ahzj a;
    public int b;
    public Object d;
    public long f;
    public long h;
    public long i;
    public int c = 0;
    public String e = "";
    public String g = "";
    public String j = "";

    static {
        ahzj ahzjVar = new ahzj();
        a = ahzjVar;
        aihn.registerDefaultInstance(ahzj.class, ahzjVar);
    }

    private ahzj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", ahzh.class, ahzi.class});
        }
        if (iOrdinal == 3) {
            return new ahzj();
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
        return aihn.getParserForClass(ahzj.class);
    }
}
