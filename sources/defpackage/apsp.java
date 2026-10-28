package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apsp extends aihn implements aiis {
    public static final apsp a;

    static {
        apsp apspVar = new apsp();
        a = apspVar;
        aihn.registerDefaultInstance(apsp.class, apspVar);
    }

    private apsp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apsp();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apsp.class);
        }
        return null;
    }
}
