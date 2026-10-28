package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aslb extends aihn implements aiis {
    public static final aslb a;
    public Object c;
    public int b = 0;
    public aihv d = emptyIntList();
    public aihu e = emptyFloatList();

    static {
        aslb aslbVar = new aslb();
        a = aslbVar;
        aihn.registerDefaultInstance(aslb.class, aslbVar);
    }

    private aslb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001d\u0002\u0013\u00034\u0000\u0004<\u0000", new Object[]{"c", "b", "d", "e", asla.class});
        }
        if (iOrdinal == 3) {
            return new aslb();
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
        return aihn.getParserForClass(aslb.class);
    }
}
