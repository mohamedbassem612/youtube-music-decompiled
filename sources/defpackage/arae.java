package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arae extends aihn implements aiis {
    public static final arae a;

    static {
        arae araeVar = new arae();
        a = araeVar;
        aihn.registerDefaultInstance(arae.class, araeVar);
    }

    private arae() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new arae();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(arae.class);
        }
        return null;
    }
}
