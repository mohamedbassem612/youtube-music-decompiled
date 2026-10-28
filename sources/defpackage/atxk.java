package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxk extends aihn implements aiis {
    public static final atxk a;
    public int b;
    public int c;
    public int d;
    public atsr e;
    public atsr f;
    public float g;
    public long h;

    static {
        atxk atxkVar = new atxk();
        a = atxkVar;
        aihn.registerDefaultInstance(atxk.class, atxkVar);
    }

    private atxk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0001\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new atxk();
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
        return aihn.getParserForClass(atxk.class);
    }
}
