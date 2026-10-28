package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajih extends aihn implements aiis {
    public static final ajih a;
    public static final aihl b;
    public boolean c;
    public boolean d;
    public algt e;
    public int f;
    private int g;
    private ajwo h;
    private ajwo i;
    private byte j = 2;

    static {
        ajih ajihVar = new ajih();
        a = ajihVar;
        aihn.registerDefaultInstance(ajih.class, ajihVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajihVar, ajihVar, null, 469554171, aika.MESSAGE, ajih.class);
    }

    private ajih() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0007᠌\u0006", new Object[]{"g", "h", "i", "c", "d", "e", "f", amys.h});
            case 3:
                return new ajih();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajih.class);
            default:
                return null;
        }
    }
}
