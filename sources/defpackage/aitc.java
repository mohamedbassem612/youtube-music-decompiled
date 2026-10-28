package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class aitc extends aihn implements aiis {
    public static final aitc a;
    public static final aihl b;
    public aitd c;
    private int d;
    private byte e = 2;

    static {
        aitc aitcVar = new aitc();
        a = aitcVar;
        aihn.registerDefaultInstance(aitc.class, aitcVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aitcVar, aitcVar, null, 83457823, aika.MESSAGE, aitc.class);
    }

    private aitc() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "c"});
            case 3:
                return new aitc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aitc.class);
            default:
                return null;
        }
    }
}
