package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arky extends aihn implements aiis {
    public static final arky a;
    public aiie b = emptyProtobufList();

    static {
        arky arkyVar = new arky();
        a = arkyVar;
        aihn.registerDefaultInstance(arky.class, arkyVar);
    }

    private arky() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", arkx.class});
        }
        if (iOrdinal == 3) {
            return new arky();
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
        return aihn.getParserForClass(arky.class);
    }
}
