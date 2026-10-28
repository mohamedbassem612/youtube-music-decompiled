package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbt extends aihn implements aiis {
    public static final apbt a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private angb h;
    private byte i = 2;

    static {
        apbt apbtVar = new apbt();
        a = apbtVar;
        aihn.registerDefaultInstance(apbt.class, apbtVar);
    }

    private apbt() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0000\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new apbt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbt.class);
            default:
                return null;
        }
    }
}
