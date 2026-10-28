package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akgn extends aihn implements aiis {
    public static final akgn a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akgn akgnVar = new akgn();
        a = akgnVar;
        aihn.registerDefaultInstance(akgn.class, akgnVar);
    }

    private akgn() {
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
                return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001;\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005м\u0000\u0006<\u0000", new Object[]{"c", "b", akhb.class, akgo.class, akho.class, akhd.class, akhn.class});
            case 3:
                return new akgn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgn.class);
            default:
                return null;
        }
    }
}
