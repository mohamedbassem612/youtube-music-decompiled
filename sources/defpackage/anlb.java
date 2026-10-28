package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anlb extends aihn implements aiis {
    public static final anlb a;
    public aihy b = emptyLongList();

    static {
        anlb anlbVar = new anlb();
        a = anlbVar;
        aihn.registerDefaultInstance(anlb.class, anlbVar);
    }

    private anlb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new anlb();
        }
        if (iOrdinal == 4) {
            return new aihf((int[][][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(anlb.class);
        }
        return null;
    }
}
