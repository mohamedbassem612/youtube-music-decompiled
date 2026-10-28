package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ainl extends aihn implements aiis {
    public static final ainl a;
    public int b;
    public boolean f;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie g = emptyProtobufList();

    static {
        ainl ainlVar = new ainl();
        a = ainlVar;
        aihn.registerDefaultInstance(ainl.class, ainlVar);
    }

    private ainl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", ainn.class});
        }
        if (iOrdinal == 3) {
            return new ainl();
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
        return aihn.getParserForClass(ainl.class);
    }
}
