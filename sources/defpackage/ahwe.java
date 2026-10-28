package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwe extends aihn implements aiis {
    public static final ahwe a;
    public aihv b = emptyIntList();
    public aiie c = emptyProtobufList();

    static {
        ahwe ahweVar = new ahwe();
        a = ahweVar;
        aihn.registerDefaultInstance(ahwe.class, ahweVar);
    }

    private ahwe() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002\u001a", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ahwe();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ahwe.class);
    }
}
