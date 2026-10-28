package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajqw extends aihn implements aiis {
    public static final ajqw a;
    public int b;
    public asnm d;
    public boolean e;
    public int f;
    private byte g = 2;
    public String c = "";

    static {
        ajqw ajqwVar = new ajqw();
        a = ajqwVar;
        aihn.registerDefaultInstance(ajqw.class, ajqwVar);
    }

    private ajqw() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0005ᐉ\u0001\u0006ဇ\u0002\u0007᠌\u0003", new Object[]{"b", "c", "d", "e", "f", aomi.f});
            case 3:
                return new ajqw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqw.class);
            default:
                return null;
        }
    }
}
