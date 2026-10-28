package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufv extends aihn implements aiis {
    public static final aufv a;
    public static final aihl b;

    static {
        aufv aufvVar = new aufv();
        a = aufvVar;
        aihn.registerDefaultInstance(aufv.class, aufvVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufvVar, aufvVar, null, 1021, aika.MESSAGE, aufv.class);
    }

    private aufv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aufv();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aufv.class);
        }
        return null;
    }
}
