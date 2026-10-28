package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amjk extends aihn implements aiis {
    public static final amjk a;
    public int b;
    public amjj c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public aihv h = emptyIntList();
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public amip r;

    static {
        amjk amjkVar = new amjk();
        a = amjkVar;
        aihn.registerDefaultInstance(amjk.class, amjkVar);
    }

    private amjk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0001\u0000\u0001ဉ\u0000\u0003᠌\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0007᠌\u0005\bࠬ\tဇ\u0006\nင\u0007\u000bဇ\b\f᠌\t\r᠌\n\u000e᠌\u000b\u0011င\u000e\u0012᠌\u000f\u0013᠌\u0010\u0014ဉ\u0011", new Object[]{"b", "c", "d", allf.p, "e", allf.l, "f", "g", amjn.c, "h", amjn.a, "i", "j", "k", "l", amjn.o, "m", amed.t, "n", amed.u, "o", "p", amju.a, "q", amjn.b, "r"});
        }
        if (iOrdinal == 3) {
            return new amjk();
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
        return aihn.getParserForClass(amjk.class);
    }
}
