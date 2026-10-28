package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aong extends aihn implements aiis {
    public static final aong a;
    public int b;
    private int c;
    private aonf d;
    private byte e = 2;

    static {
        aong aongVar = new aong();
        a = aongVar;
        aihn.registerDefaultInstance(aong.class, aongVar);
    }

    private aong() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\b\u0002\u0000\u0000\u0001\u0003ᐉ\u0002\b᠌\u0006", new Object[]{"c", "d", "b", aomi.g});
            case 3:
                return new aong();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aong.class);
            default:
                return null;
        }
    }
}
