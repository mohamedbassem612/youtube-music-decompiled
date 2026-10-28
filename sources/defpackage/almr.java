package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almr extends aihn implements aiis {
    public static final almr a;
    public int b;
    public int c;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        almr almrVar = new almr();
        a = almrVar;
        aihn.registerDefaultInstance(almr.class, almrVar);
    }

    private almr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new almr();
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
        return aihn.getParserForClass(almr.class);
    }
}
