package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aokn extends aihn implements aiis {
    public static final aokn a;
    public int b;
    public boolean c;
    public long d;
    public int e;

    static {
        aokn aoknVar = new aokn();
        a = aoknVar;
        aihn.registerDefaultInstance(aokn.class, aoknVar);
    }

    private aokn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", aofw.p});
        }
        if (iOrdinal == 3) {
            return new aokn();
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
        return aihn.getParserForClass(aokn.class);
    }
}
