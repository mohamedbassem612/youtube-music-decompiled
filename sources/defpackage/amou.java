package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amou extends aihn implements aiis {
    public static final amou a;
    public int b;
    public apji d;
    public alay e;
    public apji f;
    private alay h;
    private apji i;
    private apji j;
    private byte k = 2;
    public String c = "";
    public aiie g = emptyProtobufList();

    static {
        amou amouVar = new amou();
        a = amouVar;
        aihn.registerDefaultInstance(amou.class, amouVar);
    }

    private amou() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0007\u0001ဈ\u0000\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bЛ\rᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "i", "j", "g", apji.class, "h"});
            case 3:
                return new amou();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amou.class);
            default:
                return null;
        }
    }
}
