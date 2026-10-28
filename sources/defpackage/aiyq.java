package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiyq extends aihn implements aiis {
    public static final aiyq a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g;

    static {
        aiyq aiyqVar = new aiyq();
        a = aiyqVar;
        aihn.registerDefaultInstance(aiyq.class, aiyqVar);
    }

    private aiyq() {
        emptyProtobufList();
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0006\u001b", new Object[]{"b", "c", "d", aizm.class, "e", aizm.class, "f", aizm.class, "g", aizm.class});
        }
        if (iOrdinal == 3) {
            return new aiyq();
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
        return aihn.getParserForClass(aiyq.class);
    }
}
