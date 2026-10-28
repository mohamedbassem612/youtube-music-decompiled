package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufz extends aihn implements aiis {
    public static final aufz a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        aufz aufzVar = new aufz();
        a = aufzVar;
        aihn.registerDefaultInstance(aufz.class, aufzVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, aufzVar, aufzVar, null, 1001, aika.MESSAGE, aufz.class);
    }

    private aufz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"c", aufy.class});
        }
        if (iOrdinal == 3) {
            return new aufz();
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
        return aihn.getParserForClass(aufz.class);
    }
}
