package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivs extends aihn implements aiis {
    public static final aivs a;
    public int b;
    public int d;
    public aivr f;
    public int g;
    public String c = "";
    public int e = 1;
    public String h = "";

    static {
        aivs aivsVar = new aivs();
        a = aivsVar;
        aihn.registerDefaultInstance(aivs.class, aivsVar);
    }

    private aivs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", aixp.b, "e", "f", "g", aiwd.u, "h"});
        }
        if (iOrdinal == 3) {
            return new aivs();
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
        return aihn.getParserForClass(aivs.class);
    }
}
