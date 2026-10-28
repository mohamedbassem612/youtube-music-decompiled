package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class aopj extends aihn implements aiis {
    public static final aopj a;

    static {
        aopj aopjVar = new aopj();
        a = aopjVar;
        aihn.registerDefaultInstance(aopj.class, aopjVar);
    }

    private aopj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aopj();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aopj.class);
        }
        return null;
    }
}
