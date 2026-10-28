package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atry extends aihn implements aiis {
    public static final atry a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;

    static {
        atry atryVar = new atry();
        a = atryVar;
        aihn.registerDefaultInstance(atry.class, atryVar);
    }

    private atry() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ခ\u0003", new Object[]{"b", "c", atxs.b, "d", assp.u, "e", assp.t, "f"});
        }
        if (iOrdinal == 3) {
            return new atry();
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
        return aihn.getParserForClass(atry.class);
    }
}
