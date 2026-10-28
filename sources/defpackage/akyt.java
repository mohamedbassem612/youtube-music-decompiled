package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyt extends aihn implements aiis {
    public static final akyt a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public aigj f = aigj.d;

    static {
        akyt akytVar = new akyt();
        a = akytVar;
        aihn.registerDefaultInstance(akyt.class, akytVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akytVar, akytVar, null, 1051, aika.MESSAGE, akyt.class);
    }

    private akyt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new akyt();
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
        return aihn.getParserForClass(akyt.class);
    }
}
