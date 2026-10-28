package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axgm extends aihn implements aiis {
    public static final axgm a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    static {
        axgm axgmVar = new axgm();
        a = axgmVar;
        aihn.registerDefaultInstance(axgm.class, axgmVar);
    }

    private axgm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\n\u0000\u0001\u0011\u001b\n\u0000\u0000\u0000\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017\u0019ဂ\u0018\u001aဂ\u0019\u001bဂ\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new axgm();
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
        return aihn.getParserForClass(axgm.class);
    }
}
