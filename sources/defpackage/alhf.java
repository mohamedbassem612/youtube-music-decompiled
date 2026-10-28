package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alhf extends aihn implements aiis {
    public static final alhf a;
    public static final aihl b;
    public int c;
    public Object e;
    public boolean f;
    public ajwo g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int d = 0;
    private byte k = 2;

    static {
        alhf alhfVar = new alhf();
        a = alhfVar;
        aihn.registerDefaultInstance(alhf.class, alhfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, alhfVar, alhfVar, null, 183437148, aika.MESSAGE, alhf.class);
    }

    private alhf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001;\u0000\u0002ဇ\u0000\u0003ᐉ\u0001\u0004<\u0000\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"e", "d", "c", "f", "g", akud.class, "h", "i", "j"});
            case 3:
                return new alhf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhf.class);
            default:
                return null;
        }
    }
}
