package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ardn extends aihn implements aiis {
    public static final ardn a;
    public int b;
    public aiie c = emptyProtobufList();
    private int d;

    static {
        ardn ardnVar = new ardn();
        a = ardnVar;
        aihn.registerDefaultInstance(ardn.class, ardnVar);
    }

    private ardn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a", new Object[]{"d", "b", aram.n, "c"});
        }
        if (iOrdinal == 3) {
            return new ardn();
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
        return aihn.getParserForClass(ardn.class);
    }
}
