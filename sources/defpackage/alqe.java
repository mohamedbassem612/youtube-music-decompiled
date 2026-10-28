package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqe extends aihn implements aiis {
    public static final alqe a;
    public static final aihl b;

    static {
        alqe alqeVar = new alqe();
        a = alqeVar;
        aihn.registerDefaultInstance(alqe.class, alqeVar);
        apfs apfsVar = apfs.a;
        alqc alqcVar = alqc.a;
        b = aihn.newSingularGeneratedExtension(apfsVar, alqcVar, alqcVar, null, 2, aika.MESSAGE, alqc.class);
    }

    private alqe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new alqe();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(alqe.class);
        }
        return null;
    }
}
