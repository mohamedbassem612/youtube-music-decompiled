package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aulm extends aihn implements aiis {
    public static final aulm a;
    public aiie b = emptyProtobufList();

    static {
        aulm aulmVar = new aulm();
        a = aulmVar;
        aihn.registerDefaultInstance(aulm.class, aulmVar);
    }

    private aulm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aull.class});
        }
        if (iOrdinal == 3) {
            return new aulm();
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
        return aihn.getParserForClass(aulm.class);
    }
}
