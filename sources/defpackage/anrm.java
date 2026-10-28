package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anrm extends aihn implements aiis {
    public static final anrm a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        anrm anrmVar = new anrm();
        a = anrmVar;
        aihn.registerDefaultInstance(anrm.class, anrmVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, anrmVar, anrmVar, null, 2212, aika.MESSAGE, anrm.class);
    }

    private anrm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", anrl.class});
        }
        if (iOrdinal == 3) {
            return new anrm();
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
        return aihn.getParserForClass(anrm.class);
    }
}
