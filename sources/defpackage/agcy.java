package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agcy extends aihn implements aiis {
    public static final agcy a;
    public aiie b = emptyProtobufList();

    static {
        agcy agcyVar = new agcy();
        a = agcyVar;
        aihn.registerDefaultInstance(agcy.class, agcyVar);
    }

    private agcy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", agcx.class});
        }
        if (iOrdinal == 3) {
            return new agcy();
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
        return aihn.getParserForClass(agcy.class);
    }
}
