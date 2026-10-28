package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiuc extends aihn implements aiis {
    public static final aiuc a;
    public int b;
    public String c = "";
    public int d;
    public aiua e;

    static {
        aiuc aiucVar = new aiuc();
        a = aiucVar;
        aihn.registerDefaultInstance(aiuc.class, aiucVar);
    }

    private aiuc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", aiwd.k, "e"});
        }
        if (iOrdinal == 3) {
            return new aiuc();
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
        return aihn.getParserForClass(aiuc.class);
    }
}
