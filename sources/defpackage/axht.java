package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axht extends aihi implements aihj {
    public static final axht a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public axhw k;
    public int m;
    public int n;
    public int o;
    public axhw p;
    public int q;
    private byte r = 2;
    public aiie l = emptyProtobufList();

    static {
        axht axhtVar = new axht();
        a = axhtVar;
        aihn.registerDefaultInstance(axht.class, axhtVar);
    }

    private axht() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b\u000eင\f", new Object[]{"b", "c", "d", "f", "i", "l", axhs.class, "m", "e", "g", "h", "k", "n", "o", "p", "q"});
            case 3:
                return new axht();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axht.class);
            default:
                return null;
        }
    }
}
