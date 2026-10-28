package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdl extends aihn implements aiis {
    public static final amdl a;
    public int b;
    public int c;

    static {
        amdl amdlVar = new amdl();
        a = amdlVar;
        aihn.registerDefaultInstance(amdl.class, amdlVar);
    }

    private amdl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aomi.r});
        }
        if (iOrdinal == 3) {
            return new amdl();
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
        return aihn.getParserForClass(amdl.class);
    }
}
