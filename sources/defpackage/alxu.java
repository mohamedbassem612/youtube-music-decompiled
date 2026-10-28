package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alxu extends aihn implements aiis {
    public static final alxu a;
    public int b;
    public int c;
    public int d;
    public int f;
    public alxt i;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public String e = "";
    public aihv g = emptyIntList();
    public String h = "";
    public aiie j = emptyProtobufList();

    static {
        alxu alxuVar = new alxu();
        a = alxuVar;
        aihn.registerDefaultInstance(alxu.class, alxuVar);
    }

    private alxu() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001&\u000f\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0002\u0004ဈ\u0006\u0005ဉ\b\u0006\u001b\tဋ\r\nဋ\u000e\u000bဋ\u000f\u0013ဋ\u0012\u0014ဋ\u0013\u0017᠌\u0004\u001d᠌\u0001\u001fࠞ%ဋ\n&ဇ\t", new Object[]{"b", "c", alre.l, "e", "h", "i", "j", alxt.class, "m", "n", "o", "p", "q", "f", alre.j, "d", alre.i, "g", alre.h, "l", "k"});
        }
        if (iOrdinal == 3) {
            return new alxu();
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
        return aihn.getParserForClass(alxu.class);
    }
}
