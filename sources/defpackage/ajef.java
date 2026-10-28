package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajef extends aihn implements aiis {
    public static final ajef a;
    public int b;
    public long c;
    public long e;
    public long f;
    public long g;
    public long i;
    public long j;
    public aiie d = emptyProtobufList();
    public aiie h = emptyProtobufList();

    static {
        ajef ajefVar = new ajef();
        a = ajefVar;
        aihn.registerDefaultInstance(ajef.class, ajefVar);
    }

    private ajef() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006\u001b\u0007ဂ\u0004\bဂ\u0005", new Object[]{"b", "c", "d", ajee.class, "e", "f", "g", "h", ajee.class, "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ajef();
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
        return aihn.getParserForClass(ajef.class);
    }
}
