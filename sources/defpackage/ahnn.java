package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahnn extends aihn implements aiis {
    public static final ahnn a;
    public int b;
    public Object d;
    public Object f;
    public boolean h;
    public aigj j;
    public int k;
    public long l;
    public aigj m;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public aiie i = emptyProtobufList();

    static {
        ahnn ahnnVar = new ahnn();
        a = ahnnVar;
        aihn.registerDefaultInstance(ahnn.class, ahnnVar);
    }

    private ahnn() {
        emptyIntList();
        aigj aigjVar = aigj.d;
        this.j = aigjVar;
        this.m = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u001a\u0005ည\u0002\u0007;\u0001\t᠌\u0005\n;\u0001\u000bဇ\u0001\rဎ\u0007\u000eည\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", agzi.t, "h", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new ahnn();
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
        return aihn.getParserForClass(ahnn.class);
    }
}
