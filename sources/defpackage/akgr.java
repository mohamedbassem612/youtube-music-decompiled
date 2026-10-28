package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akgr extends aihn implements aiis {
    public static final akgr a;
    public int b;
    public boolean c;
    public aiie d = emptyProtobufList();
    public aihv e = emptyIntList();
    public aiie f = emptyProtobufList();

    static {
        akgr akgrVar = new akgr();
        a = akgrVar;
        aihn.registerDefaultInstance(akgr.class, akgrVar);
    }

    private akgr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0003\u0000\u0002ဇ\u0001\u0003\u001b\u0004ࠬ\u0005\u001b", new Object[]{"b", "c", "d", akgq.class, "e", ajzp.n, "f", apsr.class});
        }
        if (iOrdinal == 3) {
            return new akgr();
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
        return aihn.getParserForClass(akgr.class);
    }
}
