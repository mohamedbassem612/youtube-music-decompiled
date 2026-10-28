package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alys extends aihn implements aiis {
    public static final alys a;
    public int b;
    public aiie c = emptyProtobufList();
    public long d;

    static {
        alys alysVar = new alys();
        a = alysVar;
        aihn.registerDefaultInstance(alys.class, alysVar);
    }

    private alys() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"b", "c", alyq.class, "d"});
        }
        if (iOrdinal == 3) {
            return new alys();
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
        return aihn.getParserForClass(alys.class);
    }
}
