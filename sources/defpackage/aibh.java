package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aibh extends aihn implements aiis {
    public static final aibh a;
    public int b;
    public aiby c;
    public long e;
    public String d = "";
    public String f = "";

    static {
        aibh aibhVar = new aibh();
        a = aibhVar;
        aihn.registerDefaultInstance(aibh.class, aibhVar);
    }

    private aibh() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဉ\u0001\u0006ဈ\u0002\u0007ဂ\u0003\bဈ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aibh();
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
        return aihn.getParserForClass(aibh.class);
    }
}
