package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqb extends aihn implements aiis {
    public static final uqb a;
    public int b;
    public aljj e;
    public akqy f;
    public boolean g;
    public String c = "";
    public String d = "";
    public aigj h = aigj.d;

    static {
        uqb uqbVar = new uqb();
        a = uqbVar;
        aihn.registerDefaultInstance(uqb.class, uqbVar);
    }

    private uqb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u0007\u0007ည\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new uqb();
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
        return aihn.getParserForClass(uqb.class);
    }
}
