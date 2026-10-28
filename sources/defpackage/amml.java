package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amml extends aihn implements aiis {
    public static final amml a;
    public static final aihl b;

    static {
        amml ammlVar = new amml();
        a = ammlVar;
        aihn.registerDefaultInstance(amml.class, ammlVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammlVar, ammlVar, null, 238715030, aika.MESSAGE, amml.class);
    }

    private amml() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amml();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amml.class);
        }
        return null;
    }
}
