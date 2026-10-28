package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arkw extends aihn implements aiis {
    public static final arkw a;
    public int b;
    public arkz d;
    public arky e;
    public arlc f;
    public int g;
    public aiie c = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();

    static {
        arkw arkwVar = new arkw();
        a = arkwVar;
        aihn.registerDefaultInstance(arkw.class, arkwVar);
    }

    private arkw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005᠌\u0003\u0006\u001b\u0007\u001b", new Object[]{"b", "c", arlf.class, "d", "e", "f", "g", albk.i, "h", armj.class, "i", armj.class});
        }
        if (iOrdinal == 3) {
            return new arkw();
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
        return aihn.getParserForClass(arkw.class);
    }
}
