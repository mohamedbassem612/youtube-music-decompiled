package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhx extends aihn implements aiis {
    public static final lhx a;
    public int b;
    public int c;
    public boolean e;
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        lhx lhxVar = new lhx();
        a = lhxVar;
        aihn.registerDefaultInstance(lhx.class, lhxVar);
    }

    private lhx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"b", "c", fxd.m, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new lhx();
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
        return aihn.getParserForClass(lhx.class);
    }
}
