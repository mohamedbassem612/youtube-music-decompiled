package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajlx extends aihn implements aiis {
    public static final ajlx a;
    public int b;
    public ajly c;
    private ajlw d;
    private byte e = 2;

    static {
        ajlx ajlxVar = new ajlx();
        a = ajlxVar;
        aihn.registerDefaultInstance(ajlx.class, ajlxVar);
    }

    private ajlx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf2a1♋\uf6f4⾞\u0002\u0000\u0000\u0002\uf2a1♋ᐉ\u0000\uf6f4⾞ᐉ\u0001", new Object[]{"b", "d", "c"});
            case 3:
                return new ajlx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajlx.class);
            default:
                return null;
        }
    }
}
