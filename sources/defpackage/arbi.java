package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arbi extends aihn implements aiis {
    public static final arbi a;
    public static final aihl b;

    static {
        arbi arbiVar = new arbi();
        a = arbiVar;
        aihn.registerDefaultInstance(arbi.class, arbiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arbiVar, arbiVar, null, 215442723, aika.MESSAGE, arbi.class);
    }

    private arbi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new arbi();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(arbi.class);
        }
        return null;
    }
}
