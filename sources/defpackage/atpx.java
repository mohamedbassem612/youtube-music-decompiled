package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atpx extends aihn implements aiis {
    public static final atpx a;
    public aihy b = emptyLongList();

    static {
        atpx atpxVar = new atpx();
        a = atpxVar;
        aihn.registerDefaultInstance(atpx.class, atpxVar);
    }

    private atpx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new atpx();
        }
        if (iOrdinal == 4) {
            return new jrq((byte[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpx.class);
        }
        return null;
    }
}
