package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfh extends aihn implements aiis {
    public static final ajfh a;
    public int b;
    public aqif c;
    public aiie d = emptyProtobufList();
    public long e;
    public long f;
    public ajfg g;

    static {
        ajfh ajfhVar = new ajfh();
        a = ajfhVar;
        aihn.registerDefaultInstance(ajfh.class, ajfhVar);
    }

    private ajfh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\bဉ\u0006", new Object[]{"b", "c", "d", ajfe.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ajfh();
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
        return aihn.getParserForClass(ajfh.class);
    }
}
