package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivg extends aihn implements aiis {
    public static final aivg a;
    public aiie b = emptyProtobufList();
    public int c;
    private int d;

    static {
        aivg aivgVar = new aivg();
        a = aivgVar;
        aihn.registerDefaultInstance(aivg.class, aivgVar);
    }

    private aivg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"d", "b", aivh.class, "c"});
        }
        if (iOrdinal == 3) {
            return new aivg();
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
        return aihn.getParserForClass(aivg.class);
    }
}
