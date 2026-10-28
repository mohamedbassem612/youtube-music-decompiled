package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajrw extends aihn implements aiis {
    public static final ajrw a;
    private int b;
    private ajng c;
    private ajsa d;
    private ajru e;
    private ajrv f;
    private ajrx g;
    private ajng h;
    private byte i = 2;

    static {
        ajrw ajrwVar = new ajrw();
        a = ajrwVar;
        aihn.registerDefaultInstance(ajrw.class, ajrwVar);
    }

    private ajrw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0007\r\u0006\u0000\u0000\u0006\u0007ᐉ\u0000\bᐉ\u0001\tᐉ\u0002\nᐉ\u0003\u000bᐉ\u0004\rᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ajrw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrw.class);
            default:
                return null;
        }
    }
}
