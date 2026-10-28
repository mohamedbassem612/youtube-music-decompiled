package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atwx extends aihn implements aiis {
    public static final atwx a;
    public aiie b = emptyProtobufList();

    static {
        atwx atwxVar = new atwx();
        a = atwxVar;
        aihn.registerDefaultInstance(atwx.class, atwxVar);
    }

    private atwx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", atww.class});
        }
        if (iOrdinal == 3) {
            return new atwx();
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
        return aihn.getParserForClass(atwx.class);
    }
}
