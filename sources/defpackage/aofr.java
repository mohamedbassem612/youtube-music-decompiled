package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aofr extends aihn implements aiis {
    public static final aofr a;
    public int b;
    public String c = "";
    public int d;
    public argn e;
    public int f;
    public int g;
    public boolean h;

    static {
        aofr aofrVar = new aofr();
        a = aofrVar;
        aihn.registerDefaultInstance(aofr.class, aofrVar);
    }

    private aofr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0005ဉ\u0003\u0006င\u0005\u0007င\u0006\tဇ\b", new Object[]{"b", "c", "d", aobi.f, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aofr();
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
        return aihn.getParserForClass(aofr.class);
    }
}
