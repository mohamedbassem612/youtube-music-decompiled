package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjt extends aihn implements aiis {
    public static final akjt a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public String g = "";
    public String h = "";

    static {
        akjt akjtVar = new akjt();
        a = akjtVar;
        aihn.registerDefaultInstance(akjt.class, akjtVar);
    }

    private akjt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", akjs.a, "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new akjt();
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
        return aihn.getParserForClass(akjt.class);
    }
}
