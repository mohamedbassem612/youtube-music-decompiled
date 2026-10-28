package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoux extends aihn implements aiis {
    public static final aoux a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        aoux aouxVar = new aoux();
        a = aouxVar;
        aihn.registerDefaultInstance(aoux.class, aouxVar);
    }

    private aoux() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003\bᐉ\u0002\u000bᐉ\u0006\fᐉ\u0007", new Object[]{"b", "c", "d", "f", "e", "g", "h"});
            case 3:
                return new aoux();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoux.class);
            default:
                return null;
        }
    }
}
