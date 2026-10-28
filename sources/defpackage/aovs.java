package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aovs extends aihn implements aiis {
    public static final aovs a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        aovs aovsVar = new aovs();
        a = aovsVar;
        aihn.registerDefaultInstance(aovs.class, aovsVar);
    }

    private aovs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003;\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006;\u0000\u0007ဈ\u0003", new Object[]{"d", "c", "b", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new aovs();
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
        return aihn.getParserForClass(aovs.class);
    }
}
