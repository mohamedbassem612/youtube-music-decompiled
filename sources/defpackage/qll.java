package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qll extends aihn implements aiis {
    public static final qll a;
    public aiip b = aiip.a;

    static {
        qll qllVar = new qll();
        a = qllVar;
        aihn.registerDefaultInstance(qll.class, qllVar);
    }

    private qll() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, qlk.a)});
        }
        if (iOrdinal == 3) {
            return new qll();
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
        return aihn.getParserForClass(qll.class);
    }
}
