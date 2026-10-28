package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afiw extends aihn implements aiis {
    public static final afiw a;
    public int b;
    public int c;
    public afhq d;
    public int e;
    private byte f = 2;

    static {
        afiw afiwVar = new afiw();
        a = afiwVar;
        aihn.registerDefaultInstance(afiw.class, afiwVar);
    }

    private afiw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", fxi.m});
            case 3:
                return new afiw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(afiw.class);
            default:
                return null;
        }
    }
}
