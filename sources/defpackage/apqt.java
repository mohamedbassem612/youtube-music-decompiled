package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apqt extends aihn implements aiis {
    public static final apqt a;
    public int b;
    public alay c;
    public int e;
    private alay g;
    private ajwo h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        apqt apqtVar = new apqt();
        a = apqtVar;
        aihn.registerDefaultInstance(apqt.class, apqtVar);
    }

    private apqt() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0001\u0004\u0002ᐉ\u0000\u0003Л\u0004᠌\u0003\u0006ᐉ\u0001\tည\b\nᐉ\u0005", new Object[]{"b", "c", "d", apqu.class, "e", apdr.o, "g", "f", "h"});
            case 3:
                return new apqt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqt.class);
            default:
                return null;
        }
    }
}
