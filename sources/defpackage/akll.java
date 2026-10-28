package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akll extends aihn implements aiis {
    public static final akll a;
    public int b;
    public int c;
    private alop d;
    private byte e = 2;

    static {
        akll akllVar = new akll();
        a = akllVar;
        aihn.registerDefaultInstance(akll.class, akllVar);
    }

    private akll() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001", new Object[]{"b", "d", "c", apep.q});
            case 3:
                return new akll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akll.class);
            default:
                return null;
        }
    }
}
