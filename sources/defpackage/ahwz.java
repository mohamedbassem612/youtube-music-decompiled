package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahwz extends aihn implements aiis {
    public static final ahwz a;

    static {
        ahwz ahwzVar = new ahwz();
        a = ahwzVar;
        aihn.registerDefaultInstance(ahwz.class, ahwzVar);
    }

    private ahwz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ahwz();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ahwz.class);
        }
        return null;
    }
}
