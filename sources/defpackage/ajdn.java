package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajdn extends aihn implements aiis {
    public static final ajdn a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public boolean i;
    private int j;

    static {
        ajdn ajdnVar = new ajdn();
        a = ajdnVar;
        aihn.registerDefaultInstance(ajdn.class, ajdnVar);
    }

    private ajdn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0005\u0017\b\u0000\u0000\u0000\u0005ဂ\u0006\u0007ဂ\u000e\bဂ\u000b\u000b᠌\u0014\u0012ဂ\u0005\u0014ဂ\u0003\u0016ဂ\u0004\u0017ဇ\u0017", new Object[]{"j", "e", "g", "f", "h", aibu.s, "d", "b", "c", "i"});
        }
        if (iOrdinal == 3) {
            return new ajdn();
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
        return aihn.getParserForClass(ajdn.class);
    }
}
