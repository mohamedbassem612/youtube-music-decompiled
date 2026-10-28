package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class andu extends aihn implements aiis {
    public static final andu a;
    public aiie b = emptyProtobufList();

    static {
        andu anduVar = new andu();
        a = anduVar;
        aihn.registerDefaultInstance(andu.class, anduVar);
    }

    private andu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", andt.class});
        }
        if (iOrdinal == 3) {
            return new andu();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(andu.class);
        }
        return null;
    }
}
