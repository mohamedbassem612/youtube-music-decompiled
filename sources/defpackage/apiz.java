package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apiz extends aihn implements aiis {
    public static final apiz a;
    public int b;
    public aiie c = emptyProtobufList();
    public String d = "";
    public String e = "";

    static {
        apiz apizVar = new apiz();
        a = apizVar;
        aihn.registerDefaultInstance(apiz.class, apizVar);
    }

    private apiz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new apiz();
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
        return aihn.getParserForClass(apiz.class);
    }
}
