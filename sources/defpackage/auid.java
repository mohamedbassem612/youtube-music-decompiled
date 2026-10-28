package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auid extends aihn implements aiis {
    public static final auid a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public auie e;
    public aqlb f;

    static {
        auid auidVar = new auid();
        a = auidVar;
        aihn.registerDefaultInstance(auid.class, auidVar);
    }

    private auid() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", auic.class, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new auid();
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
        return aihn.getParserForClass(auid.class);
    }
}
