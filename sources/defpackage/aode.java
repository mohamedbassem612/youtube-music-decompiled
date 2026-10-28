package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aode extends aihn implements aiis {
    public static final aode a;
    public int b;
    public aodc c;
    public boolean d;
    public boolean e;
    public aodd f;
    public boolean g;

    static {
        aode aodeVar = new aode();
        a = aodeVar;
        aihn.registerDefaultInstance(aode.class, aodeVar);
    }

    private aode() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\b\u0019\u0005\u0000\u0000\u0000\bဉ\t\nဇ\n\rဇ\f\u0013ဉ\u000e\u0019ဇ\u0012", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aode();
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
        return aihn.getParserForClass(aode.class);
    }
}
