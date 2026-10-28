package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajir extends aihn implements aiis {
    public static final ajir a;
    public int b;
    public int c;
    public ajwo d;
    public ajiq e;
    private ajwo f;
    private ajiq g;
    private ajwo h;
    private ajiq i;
    private byte j = 2;

    static {
        ajir ajirVar = new ajir();
        a = ajirVar;
        aihn.registerDefaultInstance(ajir.class, ajirVar);
    }

    private ajir() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", ajhd.g, "d", "f", "h", "e", "g", "i"});
            case 3:
                return new ajir();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajir.class);
            default:
                return null;
        }
    }
}
