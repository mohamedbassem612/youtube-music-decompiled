package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aibz extends aihn implements aiis {
    public static final aibz a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public aiie f = emptyProtobufList();

    static {
        aibz aibzVar = new aibz();
        a = aibzVar;
        aihn.registerDefaultInstance(aibz.class, aibzVar);
    }

    private aibz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002\u083f\u0000\u0003\u001a\u0004ဈ\u0000", new Object[]{"d", "c", "b", aiby.class, ahzf.o, "f", "e"});
        }
        if (iOrdinal == 3) {
            return new aibz();
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
        return aihn.getParserForClass(aibz.class);
    }
}
