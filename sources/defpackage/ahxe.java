package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahxe extends aihn implements aiis {
    public static final ahxe a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        ahxe ahxeVar = new ahxe();
        a = ahxeVar;
        aihn.registerDefaultInstance(ahxe.class, ahxeVar);
    }

    private ahxe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", agzi.u, "e", ahxv.b, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ahxe();
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
        return aihn.getParserForClass(ahxe.class);
    }
}
