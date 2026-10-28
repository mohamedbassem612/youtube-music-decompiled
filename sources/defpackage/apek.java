package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apek extends aihn implements aiis {
    public static final aihw a = new apej(0);
    public static final apek b;
    public aihv c = emptyIntList();

    static {
        apek apekVar = new apek();
        b = apekVar;
        aihn.registerDefaultInstance(apek.class, apekVar);
    }

    private apek() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", aram.d});
        }
        if (iOrdinal == 3) {
            return new apek();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(apek.class);
    }
}
