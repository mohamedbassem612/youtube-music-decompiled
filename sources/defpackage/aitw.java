package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aitw extends aihn implements aiis {
    public static final aitw a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aitw aitwVar = new aitw();
        a = aitwVar;
        aihn.registerDefaultInstance(aitw.class, aitwVar);
    }

    private aitw() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\t\u0002\u0000\u0000\u0000\u0001=\u0000\t;\u0000", new Object[]{"c", "b"});
            case 3:
                return new aitw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aitw.class);
            default:
                return null;
        }
    }
}
