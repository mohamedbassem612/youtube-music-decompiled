package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ailq extends aihn implements aiis {
    public static final ailq a;
    public int b;
    public boolean c = true;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;

    static {
        ailq ailqVar = new ailq();
        a = ailqVar;
        aihn.registerDefaultInstance(ailq.class, ailqVar);
    }

    private ailq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ailq();
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
        return aihn.getParserForClass(ailq.class);
    }
}
