package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anti extends aihn implements aiis {
    public static final anti a;
    public int b;
    public anth c;
    public aqmh d;
    public alay e;
    public alay f;
    public alay g;
    private byte k = 2;
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public aigj j = aigj.d;

    static {
        anti antiVar = new anti();
        a = antiVar;
        aihn.registerDefaultInstance(anti.class, antiVar);
    }

    private anti() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0002\u0006\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0007\u0006ည\t\u0007Л\bЛ\u000bဉ\u0001", new Object[]{"b", "d", "e", "f", "g", "j", "h", alay.class, "i", alay.class, "c"});
            case 3:
                return new anti();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anti.class);
            default:
                return null;
        }
    }
}
