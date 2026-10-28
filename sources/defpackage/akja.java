package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akja extends aihn implements aiis {
    public static final akja a;
    public amuo b;
    public boolean c;
    public int d;
    public aiie e = emptyProtobufList();
    private int f;

    static {
        akja akjaVar = new akja();
        a = akjaVar;
        aihn.registerDefaultInstance(akja.class, akjaVar);
    }

    private akja() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u000fဇ\u000e\u0010င\u000f\u0011\u001b", new Object[]{"f", "b", "c", "d", "e", akjb.class});
        }
        if (iOrdinal == 3) {
            return new akja();
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
        return aihn.getParserForClass(akja.class);
    }
}
