package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auec extends aihn implements aiis {
    public static final auec a;
    public int b;
    public audk c;
    public auef d;
    public int e;
    public long f;
    public long g;
    public aued h;
    public auee i;
    public aueq j;
    public audv k;
    public aiie l = emptyProtobufList();
    public aiie m = emptyProtobufList();

    static {
        auec auecVar = new auec();
        a = auecVar;
        aihn.registerDefaultInstance(auec.class, auecVar);
    }

    private auec() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0000\u0001ဉ\u0001\u0002᠌\u0002\u0003ဃ\u0003\u0004ဃ\u0004\u0005ဉ\u0005\u0007ဉ\u0000\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\f\u001b", new Object[]{"b", "d", "e", atxs.u, "f", "g", "h", "c", "i", "j", "k", "l", auep.class, "m", audu.class});
        }
        if (iOrdinal == 3) {
            return new auec();
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
        return aihn.getParserForClass(auec.class);
    }
}
