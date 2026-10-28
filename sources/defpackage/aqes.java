package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqes extends aihn implements aiis {
    public static final aqes a;
    public static final aihl b;
    public aiie c = emptyProtobufList();
    public String d = "";
    public String e = "";
    private int f;

    static {
        aqes aqesVar = new aqes();
        a = aqesVar;
        aihn.registerDefaultInstance(aqes.class, aqesVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqesVar, aqesVar, null, 68997349, aika.MESSAGE, aqes.class);
    }

    private aqes() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"f", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aqes();
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
        return aihn.getParserForClass(aqes.class);
    }
}
