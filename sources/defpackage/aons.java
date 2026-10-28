package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aons extends aihn implements aiis {
    public static final aons a;
    public aiie b;

    static {
        aons aonsVar = new aons();
        a = aonsVar;
        aihn.registerDefaultInstance(aons.class, aonsVar);
    }

    private aons() {
        emptyProtobufList();
        this.b = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aons();
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
        return aihn.getParserForClass(aons.class);
    }
}
