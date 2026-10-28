package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aigv extends aihn implements aiis {
    public static final aigv a;

    static {
        aigv aigvVar = new aigv();
        a = aigvVar;
        aihn.registerDefaultInstance(aigv.class, aigvVar);
    }

    private aigv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aigv();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aigv.class);
        }
        return null;
    }
}
