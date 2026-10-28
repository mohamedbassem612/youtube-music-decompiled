package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amgp extends aihn implements aiis {
    public static final amgp a;
    public int b;
    public String c = "";
    public aigj d = aigj.d;
    public aiie e = emptyProtobufList();
    public long f;

    static {
        amgp amgpVar = new amgp();
        a = amgpVar;
        aihn.registerDefaultInstance(amgp.class, amgpVar);
    }

    private amgp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001a\u0005ဂ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amgp();
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
        return aihn.getParserForClass(amgp.class);
    }
}
