package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auen extends aihn implements aiis {
    public static final auen a;
    public int b;
    public int d;
    public auer f;
    public audw g;
    public aueg h;
    public auei i;
    public aueu j;
    public long k;
    public long l;
    public float m;
    public boolean n;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        auen auenVar = new auen();
        a = auenVar;
        aihn.registerDefaultInstance(auen.class, auenVar);
    }

    private auen() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001᠌\u0001\u0002\u001b\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဂ\u0007\u0006ဃ\b\u0007ခ\t\bဇ\n\tဉ\u0004\nဉ\u0005\u000bဈ\u0000\fဉ\u0006", new Object[]{"b", "d", audg.a, "e", aues.class, "f", "g", "k", "l", "m", "n", "h", "i", "c", "j"});
        }
        if (iOrdinal == 3) {
            return new auen();
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
        return aihn.getParserForClass(auen.class);
    }
}
