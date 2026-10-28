package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class andp extends aihn implements aiis {
    public static final andp a;
    public aiie b = emptyProtobufList();

    static {
        andp andpVar = new andp();
        a = andpVar;
        aihn.registerDefaultInstance(andp.class, andpVar);
    }

    private andp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", andq.class});
        }
        if (iOrdinal == 3) {
            return new andp();
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
        return aihn.getParserForClass(andp.class);
    }
}
