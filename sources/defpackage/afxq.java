package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxq extends aihn implements aiis {
    public static final afxq a;
    public int b;
    public int c;
    public afxs d;
    public aiie e = emptyProtobufList();
    public afxy f;

    static {
        afxq afxqVar = new afxq();
        a = afxqVar;
        aihn.registerDefaultInstance(afxq.class, afxqVar);
    }

    private afxq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0004\f\u0007ဉ\u0005", new Object[]{"b", "d", "e", afxz.class, "c", "f"});
        }
        if (iOrdinal == 3) {
            return new afxq();
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
        return aihn.getParserForClass(afxq.class);
    }
}
