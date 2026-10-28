package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aplw extends aihn implements aiis {
    public static final aplw a;

    static {
        aplw aplwVar = new aplw();
        a = aplwVar;
        aihn.registerDefaultInstance(aplw.class, aplwVar);
    }

    private aplw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aplw();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aplw.class);
        }
        return null;
    }
}
