package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aomj extends aihn implements aiis {
    public static final aomj a;
    public static final aihl b;
    public aiie c = emptyProtobufList();
    public String d = "";
    private int e;

    static {
        aomj aomjVar = new aomj();
        a = aomjVar;
        aihn.registerDefaultInstance(aomj.class, aomjVar);
        b = aihn.newSingularGeneratedExtension(akro.a, aomjVar, aomjVar, null, 424441953, aika.MESSAGE, aomj.class);
    }

    private aomj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aomj();
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
        return aihn.getParserForClass(aomj.class);
    }
}
