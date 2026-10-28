package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajvf extends aihn implements aiis {
    public static final ajvf a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        ajvf ajvfVar = new ajvf();
        a = ajvfVar;
        aihn.registerDefaultInstance(ajvf.class, ajvfVar);
    }

    private ajvf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0004\n\u0006\u0000\u0000\u0006\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\u0001\tᐉ\b\nᐉ\t", new Object[]{"b", "d", "e", "f", "c", "g", "h"});
            case 3:
                return new ajvf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajvf.class);
            default:
                return null;
        }
    }
}
