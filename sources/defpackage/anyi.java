package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anyi extends aihn implements aiis {
    public static final anyi a;
    public int b;
    public aqmh c;
    public int d;
    public int e;
    public aiqe f;
    public ajwo g;
    public String h;
    private byte i = 2;

    static {
        anyi anyiVar = new anyi();
        a = anyiVar;
        aihn.registerDefaultInstance(anyi.class, anyiVar);
    }

    private anyi() {
        aigj aigjVar = aigj.d;
        this.h = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0006ဉ\u0005\u0007ᐉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", amyr.r, "e", amyr.s, "f", "g", "h"});
            case 3:
                return new anyi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anyi.class);
            default:
                return null;
        }
    }
}
