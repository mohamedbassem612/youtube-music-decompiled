package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahar extends aihn implements aiis {
    public static final ahar a;
    public int b;
    public ahai c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        ahar aharVar = new ahar();
        a = aharVar;
        aihn.registerDefaultInstance(ahar.class, aharVar);
    }

    private ahar() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", agzi.m, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ahar();
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
        return aihn.getParserForClass(ahar.class);
    }
}
