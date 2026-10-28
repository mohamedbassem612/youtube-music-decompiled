package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahzk extends aihn implements aiis {
    public static final ahzk a;
    public int b;
    public int c = -1;
    public aiie d = emptyProtobufList();

    static {
        ahzk ahzkVar = new ahzk();
        a = ahzkVar;
        aihn.registerDefaultInstance(ahzk.class, ahzkVar);
    }

    private ahzk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"b", "c", "d", ahzj.class});
        }
        if (iOrdinal == 3) {
            return new ahzk();
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
        return aihn.getParserForClass(ahzk.class);
    }
}
