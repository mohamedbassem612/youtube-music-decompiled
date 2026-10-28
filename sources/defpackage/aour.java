package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aour extends aihn implements aiis {
    public static final aour a;
    public Object c;
    public aout d;
    private int e;
    public int b = 0;
    private byte f = 2;

    static {
        aour aourVar = new aour();
        a = aourVar;
        aihn.registerDefaultInstance(aour.class, aourVar);
    }

    private aour() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000\u0003ဉ\u0000", new Object[]{"c", "b", "e", ajwo.class, apji.class, "d"});
            case 3:
                return new aour();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aour.class);
            default:
                return null;
        }
    }
}
