package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asts extends aihn implements aiis {
    public static final asts a;
    public long b;
    public aiie c = emptyProtobufList();
    public String d = "";
    private int e;

    static {
        asts astsVar = new asts();
        a = astsVar;
        aihn.registerDefaultInstance(asts.class, astsVar);
    }

    private asts() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0003\u001a\u0004ဈ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asts();
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
        return aihn.getParserForClass(asts.class);
    }
}
