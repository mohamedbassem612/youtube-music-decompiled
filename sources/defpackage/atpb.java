package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atpb extends aihn implements aiis {
    public static final atpb a;
    public int b;
    public int c;
    public int d;
    public long e;

    static {
        atpb atpbVar = new atpb();
        a = atpbVar;
        aihn.registerDefaultInstance(atpb.class, atpbVar);
    }

    private atpb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဃ\u0002", new Object[]{"b", "c", assp.g, "d", assp.f, "e"});
        }
        if (iOrdinal == 3) {
            return new atpb();
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
        return aihn.getParserForClass(atpb.class);
    }
}
