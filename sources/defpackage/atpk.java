package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpk extends aihn implements aiis {
    public static final atpk a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        atpk atpkVar = new atpk();
        a = atpkVar;
        aihn.registerDefaultInstance(atpk.class, atpkVar);
    }

    private atpk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new atpk();
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
        return aihn.getParserForClass(atpk.class);
    }
}
