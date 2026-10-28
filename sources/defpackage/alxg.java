package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alxg extends aihn implements aiis {
    public static final alxg a;
    public int b;
    public alop c;
    public alxk f;
    private apji g;
    private albe h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public aigj e = aigj.d;

    static {
        alxg alxgVar = new alxg();
        a = alxgVar;
        aihn.registerDefaultInstance(alxg.class, alxgVar);
    }

    private alxg() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0004ည\u0004\u0005ᐉ\u0001\bᐉ\u0006̉ᐉ\u0005", new Object[]{"b", "c", "d", alxl.class, "e", "g", "f", "h"});
            case 3:
                return new alxg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxg.class);
            default:
                return null;
        }
    }
}
