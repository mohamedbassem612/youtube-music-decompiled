package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxi extends aihn implements aiis {
    public static final atxi a;
    public int b;
    public int c;
    public int d;
    public aiie e = emptyProtobufList();
    public atsr f;
    public long g;

    static {
        atxi atxiVar = new atxi();
        a = atxiVar;
        aihn.registerDefaultInstance(atxi.class, atxiVar);
    }

    private atxi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u001b\u0004ဉ\u0000\u0005\u0002", new Object[]{"b", "c", "d", "e", atsr.class, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new atxi();
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
        return aihn.getParserForClass(atxi.class);
    }
}
