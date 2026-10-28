package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atyl extends aihn implements aiis {
    public static final atyl a;
    public int b = 0;
    public Object c;

    static {
        atyl atylVar = new atyl();
        a = atylVar;
        aihn.registerDefaultInstance(atyl.class, atylVar);
    }

    private atyl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001;\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new atyl();
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
        return aihn.getParserForClass(atyl.class);
    }
}
