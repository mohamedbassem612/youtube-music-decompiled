package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aril extends aihn implements aiis {
    public static final aril a;
    public int b;
    public aoow c;
    public aoov d;
    public aoox e;

    static {
        aril arilVar = new aril();
        a = arilVar;
        aihn.registerDefaultInstance(aril.class, arilVar);
    }

    private aril() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf027₅\ue433ⲧ\u0003\u0000\u0000\u0000\uf027₅ဉ\u0001\ue7c7₡ဉ\u0000\ue433ⲧဉ\u0003", new Object[]{"b", "d", "c", "e"});
        }
        if (iOrdinal == 3) {
            return new aril();
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
        return aihn.getParserForClass(aril.class);
    }
}
