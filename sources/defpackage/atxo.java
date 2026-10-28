package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxo extends aihn implements aiis {
    public static final atxo a;
    public int b;
    public aiie c = emptyProtobufList();

    static {
        atxo atxoVar = new atxo();
        a = atxoVar;
        aihn.registerDefaultInstance(atxo.class, atxoVar);
    }

    private atxo() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0004\u0003\u001b", new Object[]{"b", "c", atxm.class});
        }
        if (iOrdinal == 3) {
            return new atxo();
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
        return aihn.getParserForClass(atxo.class);
    }
}
