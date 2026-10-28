package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfl extends aihn implements aiis {
    public static final ajfl a;
    private int b;
    private ajfm c;
    private apji d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        ajfl ajflVar = new ajfl();
        a = ajflVar;
        aihn.registerDefaultInstance(ajfl.class, ajflVar);
    }

    private ajfl() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\n\u0004\u0000\u0000\u0003\u0004ဉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u0007\nᐉ\t", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajfl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfl.class);
            default:
                return null;
        }
    }
}
