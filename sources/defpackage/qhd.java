package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qhd extends aihn implements aiis {
    public static final qhd a;
    public String b = "";
    public aiie c = emptyProtobufList();
    public boolean d;
    private int e;

    static {
        qhd qhdVar = new qhd();
        a = qhdVar;
        aihn.registerDefaultInstance(qhd.class, qhdVar);
    }

    private qhd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "b", "c", qhc.class, "d"});
        }
        if (iOrdinal == 3) {
            return new qhd();
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
        return aihn.getParserForClass(qhd.class);
    }
}
