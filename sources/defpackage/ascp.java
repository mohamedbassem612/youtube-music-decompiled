package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ascp extends aihn implements aiis {
    public static final ascp a;
    public int b;
    public int c;
    public apkx d;
    public aiie e = emptyProtobufList();

    static {
        ascp ascpVar = new ascp();
        a = ascpVar;
        aihn.registerDefaultInstance(ascp.class, ascpVar);
    }

    private ascp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", ascn.class});
        }
        if (iOrdinal == 3) {
            return new ascp();
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
        return aihn.getParserForClass(ascp.class);
    }
}
