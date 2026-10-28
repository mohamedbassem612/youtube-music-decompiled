package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asdf extends aihn implements aiis {
    public static final asdf a;
    public int b;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        asdf asdfVar = new asdf();
        a = asdfVar;
        aihn.registerDefaultInstance(asdf.class, asdfVar);
    }

    private asdf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"b", "c", akhn.class, "d"});
        }
        if (iOrdinal == 3) {
            return new asdf();
        }
        if (iOrdinal == 4) {
            return new aihf((int[][][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(asdf.class);
        }
        return null;
    }
}
