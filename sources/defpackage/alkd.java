package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alkd extends aihn implements aiis {
    public static final alkd a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alkd alkdVar = new alkd();
        a = alkdVar;
        aihn.registerDefaultInstance(alkd.class, alkdVar);
    }

    private alkd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000頻㿈\uf0da擶\u0003\u0000\u0000\u0003頻㿈м\u0000\ueb76䪮м\u0000\uf0da擶м\u0000", new Object[]{"c", "b", ajeq.class, ajvx.class, akrv.class});
            case 3:
                return new alkd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkd.class);
            default:
                return null;
        }
    }
}
