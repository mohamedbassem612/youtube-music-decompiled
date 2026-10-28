package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ailb extends aihn implements aiis {
    public static final ailb a;

    static {
        ailb ailbVar = new ailb();
        a = ailbVar;
        aihn.registerDefaultInstance(ailb.class, ailbVar);
    }

    private ailb() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ailb();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ailb.class);
        }
        return null;
    }
}
