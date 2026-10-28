package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajsd extends aihn implements aiis {
    public static final ajsd a;
    private int b;
    private ajwo c;
    private alay d;
    private byte e = 2;

    static {
        ajsd ajsdVar = new ajsd();
        a = ajsdVar;
        aihn.registerDefaultInstance(ajsd.class, ajsdVar);
    }

    private ajsd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new ajsd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsd.class);
            default:
                return null;
        }
    }
}
