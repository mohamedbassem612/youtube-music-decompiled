package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qnd extends aihn implements aiis {
    public static final qnd a;
    public int b;
    public long f;
    public String c = "";
    public aigj d = aigj.d;
    public String e = "";
    public aiie g = emptyProtobufList();

    static {
        qnd qndVar = new qnd();
        a = qndVar;
        aihn.registerDefaultInstance(qnd.class, qndVar);
    }

    private qnd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", qne.class});
        }
        if (iOrdinal == 3) {
            return new qnd();
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
        return aihn.getParserForClass(qnd.class);
    }
}
