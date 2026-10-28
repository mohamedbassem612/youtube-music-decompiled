package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aohr extends aihn implements aiis {
    public static final aohr a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        aohr aohrVar = new aohr();
        a = aohrVar;
        aihn.registerDefaultInstance(aohr.class, aohrVar);
    }

    private aohr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"b", "c", "d", aqdp.class});
        }
        if (iOrdinal == 3) {
            return new aohr();
        }
        if (iOrdinal == 4) {
            return new aihf((float[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aohr.class);
        }
        return null;
    }
}
