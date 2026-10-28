package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alez extends aihn implements aiis {
    public static final alez a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        alez alezVar = new alez();
        a = alezVar;
        aihn.registerDefaultInstance(alez.class, alezVar);
    }

    private alez() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", aleu.class, aley.class, alet.class, alev.class, alex.class, alew.class});
        }
        if (iOrdinal == 3) {
            return new alez();
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
        return aihn.getParserForClass(alez.class);
    }
}
