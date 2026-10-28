package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmt extends aihn implements aiis {
    public static final ajmt a;
    public static final aihl b;
    public apoi c;
    private int d;

    static {
        ajmt ajmtVar = new ajmt();
        a = ajmtVar;
        aihn.registerDefaultInstance(ajmt.class, ajmtVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajmtVar, ajmtVar, null, 1643, aika.MESSAGE, ajmt.class);
    }

    private ajmt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new ajmt();
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
        return aihn.getParserForClass(ajmt.class);
    }
}
