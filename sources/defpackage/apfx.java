package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apfx extends aihn implements aiis {
    public static final apfx a;
    public int b;
    public alay c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    private byte i = 2;

    static {
        apfx apfxVar = new apfx();
        a = apfxVar;
        aihn.registerDefaultInstance(apfx.class, apfxVar);
    }

    private apfx() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", akjs.o, "e", "f", apep.g, "g", "h"});
            case 3:
                return new apfx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apfx.class);
            default:
                return null;
        }
    }
}
