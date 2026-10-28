package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpz extends aihn implements aiis {
    public static final anpz a;
    public int b;
    public anld c;
    public apji d;
    public int e;
    public int f;
    public anld g;
    public anld h;
    private byte i = 2;

    static {
        anpz anpzVar = new anpz();
        a = anpzVar;
        aihn.registerDefaultInstance(anpz.class, anpzVar);
    }

    private anpz() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", anms.k, "f", anms.l, "g", "h"});
            case 3:
                return new anpz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anpz.class);
            default:
                return null;
        }
    }
}
