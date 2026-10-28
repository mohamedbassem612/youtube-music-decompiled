package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzt extends aihn implements aiis {
    public static final agzt a;
    public int b;
    public agzw c;
    public long d;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public int j;

    static {
        agzt agztVar = new agzt();
        a = agztVar;
        aihn.registerDefaultInstance(agzt.class, agztVar);
    }

    private agzt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"b", "c", "d", "e", agzs.class, "f", agzq.class, "g", agzv.class, "h", agzu.class, "i", agzr.class, "j"});
        }
        if (iOrdinal == 3) {
            return new agzt();
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
        return aihn.getParserForClass(agzt.class);
    }
}
