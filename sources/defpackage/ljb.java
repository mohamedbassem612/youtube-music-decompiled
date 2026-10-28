package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljb extends aihn implements aiis {
    public static final ljb a;
    public int b;
    public int c;
    public aiie d = emptyProtobufList();
    public String e = "";
    public String f = "";
    public boolean g;
    public double h;

    static {
        ljb ljbVar = new ljb();
        a = ljbVar;
        aihn.registerDefaultInstance(ljb.class, ljbVar);
    }

    private ljb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"b", "c", fxd.u, "d", ljb.class, "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ljb();
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
        return aihn.getParserForClass(ljb.class);
    }
}
