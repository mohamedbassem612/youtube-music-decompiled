package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqty extends aihn implements aiis {
    public static final aqty a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private aqyc f;
    private ajwo g;
    private angb h;
    private alay i;
    private alay j;
    private byte k = 2;

    static {
        aqty aqtyVar = new aqty();
        a = aqtyVar;
        aihn.registerDefaultInstance(aqty.class, aqtyVar);
    }

    private aqty() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002ᐉ\r\u0003ᐉ\u000e\u0007ᐉ\u0001\bᐉ\u0002\tᐉ\u0003\fᐉ\t\rᐉ\u0006\u000fᐉ\n", new Object[]{"b", "i", "j", "c", "d", "e", "g", "f", "h"});
            case 3:
                return new aqty();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqty.class);
            default:
                return null;
        }
    }
}
