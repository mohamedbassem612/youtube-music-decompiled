package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class argm extends aihn implements aiis {
    public static final argm a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aiie e = emptyProtobufList();

    static {
        argm argmVar = new argm();
        a = argmVar;
        aihn.registerDefaultInstance(argm.class, argmVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, argmVar, argmVar, null, 492, aika.MESSAGE, argm.class);
    }

    private argm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"c", "d", "e", argl.class});
        }
        if (iOrdinal == 3) {
            return new argm();
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
        return aihn.getParserForClass(argm.class);
    }
}
