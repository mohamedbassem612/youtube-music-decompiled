package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxf extends aihn implements aiis {
    public static final atxf a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public atsr e;
    public int f;
    public long g;

    static {
        atxf atxfVar = new atxf();
        a = atxfVar;
        aihn.registerDefaultInstance(atxf.class, atxfVar);
    }

    private atxf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0005\f\u0006\u0002", new Object[]{"b", "c", "d", atsr.class, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new atxf();
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
        return aihn.getParserForClass(atxf.class);
    }
}
