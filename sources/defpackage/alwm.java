package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwm extends aihn implements aiis {
    public static final alwm a;
    public int b;
    public alop c;
    public ajwo e;
    private apji g;
    private albe h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        alwm alwmVar = new alwm();
        a = alwmVar;
        aihn.registerDefaultInstance(alwm.class, alwmVar);
    }

    private alwm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0005ည\u0004\u0006ᐉ\u0001\u0007ᐉ\u0002̉ᐉ\u0005", new Object[]{"b", "c", "d", alwn.class, "f", "e", "g", "h"});
            case 3:
                return new alwm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwm.class);
            default:
                return null;
        }
    }
}
