package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobe extends aihn implements aiis {
    public static final aobe a;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public aiie j = emptyProtobufList();
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        aobe aobeVar = new aobe();
        a = aobeVar;
        aihn.registerDefaultInstance(aobe.class, aobeVar);
    }

    private aobe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0002\r\f\u0000\u0001\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\f᠌\n\r᠌\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", aobd.class, "k", "l", aobi.a, "m", akkx.c, "n", ajhk.o});
        }
        if (iOrdinal == 3) {
            return new aobe();
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
        return aihn.getParserForClass(aobe.class);
    }
}
