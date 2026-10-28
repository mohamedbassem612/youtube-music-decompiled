package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajau extends aihn implements aiis {
    public static final ajau a;

    static {
        ajau ajauVar = new ajau();
        a = ajauVar;
        aihn.registerDefaultInstance(ajau.class, ajauVar);
    }

    private ajau() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ajau();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ajau.class);
        }
        return null;
    }
}
