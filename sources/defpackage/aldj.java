package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aldj extends aihn implements aiis {
    public static final aldj a;
    public static final aihl b;

    static {
        aldj aldjVar = new aldj();
        a = aldjVar;
        aihn.registerDefaultInstance(aldj.class, aldjVar);
        b = aihn.newSingularGeneratedExtension(asni.a, aldjVar, aldjVar, null, 346458202, aika.MESSAGE, aldj.class);
    }

    private aldj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aldj();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aldj.class);
        }
        return null;
    }
}
