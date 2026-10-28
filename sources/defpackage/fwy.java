package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fwy extends aihn implements aiis {
    public static final fwy a;

    static {
        fwy fwyVar = new fwy();
        a = fwyVar;
        aihn.registerDefaultInstance(fwy.class, fwyVar);
    }

    private fwy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new fwy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(fwy.class);
        }
        return null;
    }
}
