package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asru extends aihn implements aiis {
    public static final asru a;
    public aiie b = emptyProtobufList();

    static {
        asru asruVar = new asru();
        a = asruVar;
        aihn.registerDefaultInstance(asru.class, asruVar);
    }

    private asru() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", asrj.class});
        }
        if (iOrdinal == 3) {
            return new asru();
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
        return aihn.getParserForClass(asru.class);
    }
}
