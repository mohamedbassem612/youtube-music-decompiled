package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asff extends aihn implements aiis {
    public static final asff a;
    public int b;
    public aiie c = emptyProtobufList();
    public int d;

    static {
        asff asffVar = new asff();
        a = asffVar;
        aihn.registerDefaultInstance(asff.class, asffVar);
    }

    private asff() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"b", "c", asfe.class, "d"});
        }
        if (iOrdinal == 3) {
            return new asff();
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
        return aihn.getParserForClass(asff.class);
    }
}
