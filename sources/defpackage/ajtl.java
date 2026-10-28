package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajtl extends aihn implements aiis {
    public static final ajtl a;
    public boolean b;
    public boolean c;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    private int f;

    static {
        ajtl ajtlVar = new ajtl();
        a = ajtlVar;
        aihn.registerDefaultInstance(ajtl.class, ajtlVar);
    }

    private ajtl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b", new Object[]{"f", "b", "c", "d", ajtm.class, "e", ajtn.class});
        }
        if (iOrdinal == 3) {
            return new ajtl();
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
        return aihn.getParserForClass(ajtl.class);
    }
}
