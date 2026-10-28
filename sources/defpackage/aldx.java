package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aldx extends aihn implements aiis {
    public static final aldx a;
    public ajwo b;
    public boolean c;
    public boolean d;
    private int e;
    private byte f = 2;

    static {
        aldx aldxVar = new aldx();
        a = aldxVar;
        aihn.registerDefaultInstance(aldx.class, aldxVar);
    }

    private aldx() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0001\u0002ᐉ\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"e", "b", "c", "d"});
            case 3:
                return new aldx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldx.class);
            default:
                return null;
        }
    }
}
