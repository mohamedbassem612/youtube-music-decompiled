package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aull extends aihn implements aiis {
    public static final aull a;
    public int b;
    public int c;
    public long e;
    public long f;
    public String d = "";
    public aiie g = emptyProtobufList();

    static {
        aull aullVar = new aull();
        a = aullVar;
        aihn.registerDefaultInstance(aull.class, aullVar);
    }

    private aull() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aull();
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
        return aihn.getParserForClass(aull.class);
    }
}
