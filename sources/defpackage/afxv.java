package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxv extends aihn implements aiis {
    public static final afxv a;
    public String b;
    public boolean c;

    static {
        afxv afxvVar = new afxv();
        a = afxvVar;
        aihn.registerDefaultInstance(afxv.class, afxvVar);
    }

    private afxv() {
        aigj aigjVar = aigj.d;
        this.b = "";
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\b\u0002\u0000\u0000\u0000\u0002Ȉ\b\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new afxv();
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
        return aihn.getParserForClass(afxv.class);
    }
}
