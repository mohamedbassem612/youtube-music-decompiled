package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atrf extends aihn implements aiis {
    public static final atrf a;
    public int b;
    public aiie c = emptyProtobufList();
    private int d;

    static {
        atrf atrfVar = new atrf();
        a = atrfVar;
        aihn.registerDefaultInstance(atrf.class, atrfVar);
    }

    private atrf() {
        emptyFloatList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"d", "b", "c", atrk.class});
        }
        if (iOrdinal == 3) {
            return new atrf();
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
        return aihn.getParserForClass(atrf.class);
    }
}
