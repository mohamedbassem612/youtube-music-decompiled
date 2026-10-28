package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axhv extends aihn implements aiis {
    public static final axhv a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public aiie k = emptyProtobufList();

    static {
        axhv axhvVar = new axhv();
        a = axhvVar;
        aihn.registerDefaultInstance(axhv.class, axhvVar);
    }

    private axhv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", axhu.class});
        }
        if (iOrdinal == 3) {
            return new axhv();
        }
        if (iOrdinal == 4) {
            return new aihf((char[]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(axhv.class);
        }
        return null;
    }
}
