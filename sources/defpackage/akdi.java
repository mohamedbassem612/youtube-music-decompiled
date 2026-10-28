package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akdi extends aihn implements aiis {
    public static final akdi a;
    private int b;
    private alay c;
    private angb d;
    private ajng e;
    private ajng f;
    private ajwo g;
    private ajwo h;
    private byte i = 2;

    static {
        akdi akdiVar = new akdi();
        a = akdiVar;
        aihn.registerDefaultInstance(akdi.class, akdiVar);
    }

    private akdi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0007ᐉ\u0002\bᐉ\b\u000bᐉ\n", new Object[]{"b", "c", "e", "f", "d", "g", "h"});
            case 3:
                return new akdi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdi.class);
            default:
                return null;
        }
    }
}
