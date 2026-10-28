package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajhw extends aihn implements aiis {
    public static final ajhw a;

    static {
        ajhw ajhwVar = new ajhw();
        a = ajhwVar;
        aihn.registerDefaultInstance(ajhw.class, ajhwVar);
    }

    private ajhw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ajhw();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ajhw.class);
        }
        return null;
    }
}
