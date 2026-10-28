package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anih extends aihn implements aiis {
    public static final anih a;
    public int b;
    public ajwo c;
    private int d;
    private byte e = 2;

    static {
        anih anihVar = new anih();
        a = anihVar;
        aihn.registerDefaultInstance(anih.class, anihVar);
    }

    private anih() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", aomi.m, "c"});
            case 3:
                return new anih();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anih.class);
            default:
                return null;
        }
    }
}
