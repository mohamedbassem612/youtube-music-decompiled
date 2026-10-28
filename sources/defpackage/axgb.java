package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgb extends aihn implements aiis {
    public static final axgb a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public axfy i;

    static {
        axgb axgbVar = new axgb();
        a = axgbVar;
        aihn.registerDefaultInstance(axgb.class, axgbVar);
    }

    private axgb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new axgb();
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
        return aihn.getParserForClass(axgb.class);
    }
}
