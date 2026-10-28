package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ojb extends aihn implements aiis {
    public static final ojb a;
    public int b;
    public int d;
    public boolean e;
    public long f;
    public int h;
    public String c = "";
    public String g = "";

    static {
        ojb ojbVar = new ojb();
        a = ojbVar;
        aihn.registerDefaultInstance(ojb.class, ojbVar);
    }

    private ojb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005᠌\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"b", "c", "d", oia.l, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ojb();
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
        return aihn.getParserForClass(ojb.class);
    }
}
