package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzp extends aihn implements aiis {
    public static final jzp a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiie d;
    private int e;

    static {
        jzp jzpVar = new jzp();
        a = jzpVar;
        aihn.registerDefaultInstance(jzp.class, jzpVar);
    }

    private jzp() {
        emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0004\u001b", new Object[]{"e", "b", fxd.k, "c", jzm.class, "d", jzo.class});
        }
        if (iOrdinal == 3) {
            return new jzp();
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
        return aihn.getParserForClass(jzp.class);
    }
}
