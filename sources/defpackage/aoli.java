package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoli extends aihn implements aiis {
    public static final aoli a;
    public int b;
    public Object d;
    public int e;
    public aolk f;
    public ajwo g;
    public int h;
    public boolean i;
    public int c = 0;
    private byte j = 2;

    static {
        aoli aoliVar = new aoli();
        a = aoliVar;
        aihn.registerDefaultInstance(aoli.class, aoliVar);
    }

    private aoli() {
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
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001м\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004င\u0000\u0005=\u0000\u0006᠌\u0003\u0007ဇ\u0004", new Object[]{"d", "c", "b", aoln.class, "f", "g", "e", "h", aixp.t, "i"});
            case 3:
                return new aoli();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoli.class);
            default:
                return null;
        }
    }
}
