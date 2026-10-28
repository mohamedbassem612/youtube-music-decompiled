package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxb extends aihn implements aiis {
    public static final fxb a;
    public int b;
    public long d;
    public int i;
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        fxb fxbVar = new fxb();
        a = fxbVar;
        aihn.registerDefaultInstance(fxb.class, fxbVar);
    }

    private fxb() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u000bဈ\n\r᠌\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", fxd.b});
        }
        if (iOrdinal == 3) {
            return new fxb();
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
        return aihn.getParserForClass(fxb.class);
    }
}
