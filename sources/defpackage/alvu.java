package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alvu extends aihn implements aiis {
    public static final alvu a;
    public static final aihl b;

    static {
        alvu alvuVar = new alvu();
        a = alvuVar;
        aihn.registerDefaultInstance(alvu.class, alvuVar);
        apfs apfsVar = apfs.a;
        alvt alvtVar = alvt.a;
        b = aihn.newSingularGeneratedExtension(apfsVar, alvtVar, alvtVar, null, 1, aika.MESSAGE, alvt.class);
    }

    private alvu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new alvu();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(alvu.class);
        }
        return null;
    }
}
