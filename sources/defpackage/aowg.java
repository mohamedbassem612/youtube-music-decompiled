package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aowg extends aihn implements aiis {
    public static final aowg a;
    public static final aihl b;
    public int c;
    public int e;
    public String d = "";
    public aigj f = aigj.d;

    static {
        aowg aowgVar = new aowg();
        a = aowgVar;
        aihn.registerDefaultInstance(aowg.class, aowgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aowgVar, aowgVar, null, 1402, aika.MESSAGE, aowg.class);
    }

    private aowg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"c", "d", "e", aotj.e, "f"});
        }
        if (iOrdinal == 3) {
            return new aowg();
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
        return aihn.getParserForClass(aowg.class);
    }
}
