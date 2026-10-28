package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoye extends aihn implements aiis {
    public static final aoye a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        aoye aoyeVar = new aoye();
        a = aoyeVar;
        aihn.registerDefaultInstance(aoye.class, aoyeVar);
        b = aihn.newSingularGeneratedExtension(aksn.a, aoyeVar, aoyeVar, null, 413030470, aika.MESSAGE, aoye.class);
    }

    private aoye() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"c"});
        }
        if (iOrdinal == 3) {
            return new aoye();
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
        return aihn.getParserForClass(aoye.class);
    }
}
