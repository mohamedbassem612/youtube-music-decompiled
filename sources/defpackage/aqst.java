package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqst extends aihn implements aiis {
    public static final aqst a;
    public int b;
    public apts d;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;
    public aiie c = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        aqst aqstVar = new aqst();
        a = aqstVar;
        aihn.registerDefaultInstance(aqst.class, aqstVar);
    }

    private aqst() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\r\u0006\u0000\u0002\u0005\u0001Л\u0004ᐉ\u0001\u0007\u001b\u000bᐉ\u0002\fᐉ\u0003\rᐉ\u0004", new Object[]{"b", "c", aptr.class, "d", "e", aptj.class, "f", "g", "h"});
            case 3:
                return new aqst();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqst.class);
            default:
                return null;
        }
    }
}
