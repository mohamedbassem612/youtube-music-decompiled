package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armp extends aihn implements aiis {
    public static final armp a;
    public String b = "";
    public aiie c = emptyProtobufList();
    private int d;

    static {
        armp armpVar = new armp();
        a = armpVar;
        aihn.registerDefaultInstance(armp.class, armpVar);
    }

    private armp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new armp();
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
        return aihn.getParserForClass(armp.class);
    }
}
