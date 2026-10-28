package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahyn extends aihn implements aiis {
    public static final ahyn a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();

    static {
        ahyn ahynVar = new ahyn();
        a = ahynVar;
        aihn.registerDefaultInstance(ahyn.class, ahynVar);
    }

    private ahyn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001b", new Object[]{"b", "c", ahxv.l, "d", ahym.class});
        }
        if (iOrdinal == 3) {
            return new ahyn();
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
        return aihn.getParserForClass(ahyn.class);
    }
}
