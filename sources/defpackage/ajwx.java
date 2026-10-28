package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajwx extends aihn implements aiis {
    public static final ajwx a;
    private int b;
    private alay c;
    private ajwo d;
    private byte e = 2;

    static {
        ajwx ajwxVar = new ajwx();
        a = ajwxVar;
        aihn.registerDefaultInstance(ajwx.class, ajwxVar);
    }

    private ajwx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new ajwx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajwx.class);
            default:
                return null;
        }
    }
}
