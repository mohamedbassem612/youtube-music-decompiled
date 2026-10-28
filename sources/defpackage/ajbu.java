package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbu extends aihn implements aiis {
    public static final ajbu a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int g;

    static {
        ajbu ajbuVar = new ajbu();
        a = ajbuVar;
        aihn.registerDefaultInstance(ajbu.class, ajbuVar);
    }

    private ajbu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003᠌\u0002\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"g", "b", "c", aibu.p, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ajbu();
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
        return aihn.getParserForClass(ajbu.class);
    }
}
