package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqfb extends aihn implements aiis {
    public static final aqfb a;
    public int b;
    public Object d;
    public aqmh e;
    public alay g;
    public alay h;
    public apji j;
    public apji k;
    public int c = 0;
    private byte m = 2;
    public aihv f = emptyIntList();
    public aiie i = emptyProtobufList();
    public aigj l = aigj.d;

    static {
        aqfb aqfbVar = new aqfb();
        a = aqfbVar;
        aihn.registerDefaultInstance(aqfb.class, aqfbVar);
    }

    private aqfb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0002\b\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004Л\u0005ᐉ\u0004\u0006ᐉ\u0005\bည\u0007\tм\u0000\nм\u0000\u000b\u001d", new Object[]{"d", "c", "b", "e", "g", "h", "i", alay.class, "j", "k", "l", aqmh.class, alja.class, "f"});
            case 3:
                return new aqfb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqfb.class);
            default:
                return null;
        }
    }
}
