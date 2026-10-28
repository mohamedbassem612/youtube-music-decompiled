package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aizd extends aihn implements aiis {
    public static final aizd a;

    static {
        aizd aizdVar = new aizd();
        a = aizdVar;
        aihn.registerDefaultInstance(aizd.class, aizdVar);
    }

    private aizd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aizd();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aizd.class);
        }
        return null;
    }
}
