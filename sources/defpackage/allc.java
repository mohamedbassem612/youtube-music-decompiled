package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class allc extends aihn implements aiis {
    public static final allc a;
    public int b;
    public alop c;
    public boolean g;
    public aigj h;
    public ajwo i;
    private apfp j;
    private albe k;
    private byte l = 2;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        allc allcVar = new allc();
        a = allcVar;
        aihn.registerDefaultInstance(allc.class, allcVar);
    }

    private allc() {
        aigj aigjVar = aigj.d;
        this.h = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001̉\t\u0000\u0003\u0007\u0001ᐉ\u0000\u0002Л\u0005ဇ\u0003\tည\u0007\nЛ\u000bᐉ\u0001\fᐉ\b\rЛ̉ᐉ\t", new Object[]{"b", "c", "d", alld.class, "g", "h", "e", apji.class, "j", "i", "f", ajnu.class, "k"});
            case 3:
                return new allc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allc.class);
            default:
                return null;
        }
    }
}
