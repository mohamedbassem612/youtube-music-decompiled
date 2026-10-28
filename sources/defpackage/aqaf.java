package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqaf extends aihn implements aiis {
    public static final aqaf a;
    public static final aihl b;

    static {
        aqaf aqafVar = new aqaf();
        a = aqafVar;
        aihn.registerDefaultInstance(aqaf.class, aqafVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqafVar, aqafVar, null, 459770925, aika.MESSAGE, aqaf.class);
    }

    private aqaf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aqaf();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aqaf.class);
        }
        return null;
    }
}
