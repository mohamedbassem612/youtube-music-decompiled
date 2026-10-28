package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akcu extends aihn implements aiis {
    public static final akcu a;
    public aiie b = emptyProtobufList();
    public String c = "";
    public int d;
    private int e;

    static {
        akcu akcuVar = new akcu();
        a = akcuVar;
        aihn.registerDefaultInstance(akcu.class, akcuVar);
    }

    private akcu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0001\u0004᠌\u0002", new Object[]{"e", "b", akct.class, "c", "d", ajzp.e});
        }
        if (iOrdinal == 3) {
            return new akcu();
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
        return aihn.getParserForClass(akcu.class);
    }
}
