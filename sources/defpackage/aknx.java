package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aknx extends aihn implements aiis {
    public static final aknx a;
    public int b;
    public long c;
    public boolean d;
    public String e = "";
    public String f;
    public aihv g;
    public aigj h;
    public int i;

    static {
        aknx aknxVar = new aknx();
        a = aknxVar;
        aihn.registerDefaultInstance(aknx.class, aknxVar);
    }

    private aknx() {
        aigj aigjVar = aigj.d;
        this.f = "";
        this.g = emptyIntList();
        this.h = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0003\u000b\u0007\u0000\u0001\u0000\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\bဈ\u0007\t\u0016\nည\b\u000bင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aknx();
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
        return aihn.getParserForClass(aknx.class);
    }
}
