package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asgp extends aihn implements aiis {
    public static final asgp a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public ajoj f;

    static {
        asgp asgpVar = new asgp();
        a = asgpVar;
        aihn.registerDefaultInstance(asgp.class, asgpVar);
    }

    private asgp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"b", "c", ajoj.class, "d", ajoj.class, "e", ajoj.class, "f"});
        }
        if (iOrdinal == 3) {
            return new asgp();
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
        return aihn.getParserForClass(asgp.class);
    }
}
