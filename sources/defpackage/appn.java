package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class appn extends aihn implements aiis {
    public static final appn a;
    public static final aihl b;

    static {
        appn appnVar = new appn();
        a = appnVar;
        aihn.registerDefaultInstance(appn.class, appnVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, appnVar, appnVar, null, 239906307, aika.MESSAGE, appn.class);
    }

    private appn() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new appn();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(appn.class);
        }
        return null;
    }
}
