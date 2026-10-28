package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aida extends aihn implements aiis {
    public static final aida a;
    public int c;
    private int g;
    public boolean b = true;
    public String d = "";
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        aida aidaVar = new aida();
        a = aidaVar;
        aihn.registerDefaultInstance(aida.class, aidaVar);
    }

    private aida() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b", new Object[]{"g", "b", "c", "d", "e", aicz.class, "f", aicy.class});
        }
        if (iOrdinal == 3) {
            return new aida();
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
        return aihn.getParserForClass(aida.class);
    }
}
