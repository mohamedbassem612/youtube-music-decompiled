package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aptk extends aihn implements aiis {
    public static final aptk a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        aptk aptkVar = new aptk();
        a = aptkVar;
        aihn.registerDefaultInstance(aptk.class, aptkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aptkVar, aptkVar, null, 73844178, aika.MESSAGE, aptk.class);
    }

    private aptk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aptk();
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
        return aihn.getParserForClass(aptk.class);
    }
}
