package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ailx extends aihn implements aiis {
    public static final ailx a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        ailx ailxVar = new ailx();
        a = ailxVar;
        aihn.registerDefaultInstance(ailx.class, ailxVar);
    }

    private ailx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001c\u0002\u001c", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ailx();
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
        return aihn.getParserForClass(ailx.class);
    }
}
