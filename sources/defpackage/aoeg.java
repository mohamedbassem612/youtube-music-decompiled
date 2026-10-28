package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoeg extends aihn implements aiis {
    public static final aoeg a;
    public int b;
    public String c = "";
    public aiie d = emptyProtobufList();
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public aody n;

    static {
        aoeg aoegVar = new aoeg();
        a = aoegVar;
        aihn.registerDefaultInstance(aoeg.class, aoegVar);
    }

    private aoeg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003င\u0001\u0004င\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\t᠌\u0007\u000bဂ\t\f᠌\n\rဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", aofw.n, "l", "m", aofw.d, "n"});
        }
        if (iOrdinal == 3) {
            return new aoeg();
        }
        if (iOrdinal == 4) {
            return new aihf((int[][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aoeg.class);
        }
        return null;
    }
}
