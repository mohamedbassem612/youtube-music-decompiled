package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alhg extends aihn implements aiis {
    public static final alhg a;
    public static final aihl b;

    static {
        alhg alhgVar = new alhg();
        a = alhgVar;
        aihn.registerDefaultInstance(alhg.class, alhgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, alhgVar, alhgVar, null, 518935746, aika.MESSAGE, alhg.class);
    }

    private alhg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new alhg();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(alhg.class);
        }
        return null;
    }
}
