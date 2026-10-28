package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajlg extends aihn implements aiis {
    public static final ajlg a;

    static {
        ajlg ajlgVar = new ajlg();
        a = ajlgVar;
        aihn.registerDefaultInstance(ajlg.class, ajlgVar);
    }

    private ajlg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ajlg();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ajlg.class);
        }
        return null;
    }
}
