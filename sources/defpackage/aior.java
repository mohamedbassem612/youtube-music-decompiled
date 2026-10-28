package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aior extends aihn implements aiis {
    public static final aior a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public String i;
    public aioo j;
    public aiie k;

    static {
        aior aiorVar = new aior();
        a = aiorVar;
        aihn.registerDefaultInstance(aior.class, aiorVar);
    }

    private aior() {
        emptyProtobufList();
        this.i = "";
        this.k = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003ဃ\u0002\u0004᠌\u0003\u0005\u001b\u0006\u001b\nဈ\u0006\u000bဉ\u0007\f\u001b", new Object[]{"b", "c", "d", "e", "f", aiod.d, "g", aioq.class, "h", aiop.class, "i", "j", "k", aion.class});
        }
        if (iOrdinal == 3) {
            return new aior();
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
        return aihn.getParserForClass(aior.class);
    }
}
