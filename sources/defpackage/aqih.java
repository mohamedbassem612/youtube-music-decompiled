package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqih extends aihn implements aiis {
    public static final aqih a;
    public int b;
    public int c;
    public aqif d;
    public aqie e;
    public aigj f = aigj.d;
    public aqib g;
    public ajbk h;
    public aqhz i;
    public aqid j;
    public aqia k;
    public ajdo l;

    static {
        aqih aqihVar = new aqih();
        a = aqihVar;
        aihn.registerDefaultInstance(aqih.class, aqihVar);
    }

    private aqih() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u001b\n\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\tဉ\u0006\fဉ\t\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0012\u001bဉ\u0015", new Object[]{"b", "c", apdr.q, "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new aqih();
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
        return aihn.getParserForClass(aqih.class);
    }
}
