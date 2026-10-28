package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amjy extends aihn implements aiis {
    public static final amjy a;
    public Object c;
    public Object e;
    public Object g;
    public Object i;
    public Object k;
    public Object m;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    public int h = 0;
    public int j = 0;
    public int l = 0;
    private byte n = 2;

    static {
        amjy amjyVar = new amjy();
        a = amjyVar;
        aihn.registerDefaultInstance(amjy.class, amjyVar);
    }

    private amjy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0006\u0000\u0001\f\f\u0000\u0000\u0006\u00017\u0000\u00027\u0001\u00037\u0002\u00047\u0003\u00057\u0004\u00067\u0005\u0007м\u0000\bм\u0001\tм\u0002\nм\u0003\u000bм\u0004\fм\u0005", new Object[]{"c", "b", "e", "d", "g", "f", "i", "h", "k", "j", "m", "l", amzi.class, amzi.class, amzi.class, amzi.class, amzi.class, amzi.class});
            case 3:
                return new amjy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amjy.class);
            default:
                return null;
        }
    }
}
