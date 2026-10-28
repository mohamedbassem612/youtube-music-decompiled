package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqjp extends aihn implements aiis {
    public static final aqjp a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        aqjp aqjpVar = new aqjp();
        a = aqjpVar;
        aihn.registerDefaultInstance(aqjp.class, aqjpVar);
    }

    private aqjp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u0004\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aqjp();
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
        return aihn.getParserForClass(aqjp.class);
    }
}
