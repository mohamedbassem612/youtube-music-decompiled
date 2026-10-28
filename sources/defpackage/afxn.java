package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxn extends aihn implements aiis {
    public static final afxn a;
    public int b;
    public int c = 0;
    public Object d;
    public afxt e;
    public afxv f;
    public afxu g;
    public afxx h;

    static {
        afxn afxnVar = new afxn();
        a = afxnVar;
        aihn.registerDefaultInstance(afxn.class, afxnVar);
    }

    private afxn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0001\u0001\u0001\r\t\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0006Ȼ\u0000\u0007Ȼ\u0000\nဉ\u0007\f<\u0000\r=\u0000", new Object[]{"d", "c", "b", afxr.class, "e", "f", "g", "h", afya.class});
        }
        if (iOrdinal == 3) {
            return new afxn();
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
        return aihn.getParserForClass(afxn.class);
    }
}
