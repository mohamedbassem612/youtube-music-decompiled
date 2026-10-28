package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akza extends aihn implements aiis {
    public static final akza a;
    public int b;
    public ajue c;
    public apji d;
    public long e;
    public apji f;
    private byte g = 2;

    static {
        akza akzaVar = new akza();
        a = akzaVar;
        aihn.registerDefaultInstance(akza.class, akzaVar);
    }

    private akza() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0004ဂ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new akza();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akza.class);
            default:
                return null;
        }
    }
}
