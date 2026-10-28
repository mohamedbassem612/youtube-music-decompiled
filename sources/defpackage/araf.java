package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class araf extends aihn implements aiis {
    public static final araf a;

    static {
        araf arafVar = new araf();
        a = arafVar;
        aihn.registerDefaultInstance(araf.class, arafVar);
    }

    private araf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new araf();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(araf.class);
        }
        return null;
    }
}
