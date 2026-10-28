package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahaq extends aihn implements aiis {
    public static final ahaq a;
    public int b;
    public int c;
    public int d;
    public aiie e = emptyProtobufList();
    public long f;

    static {
        ahaq ahaqVar = new ahaq();
        a = ahaqVar;
        aihn.registerDefaultInstance(ahaq.class, ahaqVar);
    }

    private ahaq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဂ\u0002", new Object[]{"b", "c", agzi.p, "d", agzi.q, "e", ahai.class, "f"});
        }
        if (iOrdinal == 3) {
            return new ahaq();
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
        return aihn.getParserForClass(ahaq.class);
    }
}
