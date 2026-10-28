package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atse extends aihn implements aiis {
    public static final atse a;
    public int b;
    public int c = 0;
    public Object d;
    public atsb e;

    static {
        atse atseVar = new atse();
        a = atseVar;
        aihn.registerDefaultInstance(atse.class, atseVar);
    }

    private atse() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003ဉ\u0000\u0004<\u0000", new Object[]{"d", "c", "b", atsc.class, "e", atsd.class});
        }
        if (iOrdinal == 3) {
            return new atse();
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
        return aihn.getParserForClass(atse.class);
    }
}
