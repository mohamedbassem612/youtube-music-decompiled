package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amkr extends aihn implements aiis {
    public static final amkr a;
    public static final aihl b;
    public static final aihl c;

    static {
        amkr amkrVar = new amkr();
        a = amkrVar;
        aihn.registerDefaultInstance(amkr.class, amkrVar);
        b = aihn.newSingularGeneratedExtension(amks.a, Boolean.FALSE, null, null, 116410864, aika.BOOL, Boolean.class);
        c = aihn.newSingularGeneratedExtension(amks.a, amlg.LIKE, null, amlg.d, 116390062, aika.ENUM, amlg.class);
    }

    private amkr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amkr();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amkr.class);
        }
        return null;
    }
}
