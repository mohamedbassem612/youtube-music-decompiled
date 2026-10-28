package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhg extends aihn implements aiis {
    public static final ajhg a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public amuq m;
    public int n;
    public akiy o;

    static {
        ajhg ajhgVar = new ajhg();
        a = ajhgVar;
        aihn.registerDefaultInstance(ajhg.class, ajhgVar);
    }

    private ajhg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0004\u0004ဇ\u0006\u0005ဇ\u0007\bခ\u0001\tခ\t\nဉ\f\u000bခ\u0002\fခ\u0003\rခ\n\u000eခ\u000b\u000f᠌\r\u0010ဉ\u000e", new Object[]{"b", "c", "g", "h", "i", "d", "j", "m", "e", "f", "k", "l", "n", aibu.n, "o"});
        }
        if (iOrdinal == 3) {
            return new ajhg();
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
        return aihn.getParserForClass(ajhg.class);
    }
}
