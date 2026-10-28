package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arjy extends aihn implements aiis {
    public static final arjy a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public long h;

    static {
        arjy arjyVar = new arjy();
        a = arjyVar;
        aihn.registerDefaultInstance(arjy.class, arjyVar);
    }

    private arjy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0003\u0004င\u0004\u0005ဇ\u0002\u0006ဂ\u0005", new Object[]{"b", "c", "d", arke.d, "f", "g", "e", "h"});
        }
        if (iOrdinal == 3) {
            return new arjy();
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
        return aihn.getParserForClass(arjy.class);
    }
}
