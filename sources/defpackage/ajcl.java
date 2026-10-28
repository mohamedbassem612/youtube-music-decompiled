package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcl extends aihn implements aiis {
    public static final ajcl a;
    public int b;
    private int c;

    static {
        ajcl ajclVar = new ajcl();
        a = ajclVar;
        aihn.registerDefaultInstance(ajcl.class, ajclVar);
    }

    private ajcl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aibu.r});
        }
        if (iOrdinal == 3) {
            return new ajcl();
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
        return aihn.getParserForClass(ajcl.class);
    }
}
