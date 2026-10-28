package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akws extends aihn implements aiis {
    public static final akws a;
    private int b;
    private akwr c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        akws akwsVar = new akws();
        a = akwsVar;
        aihn.registerDefaultInstance(akws.class, akwsVar);
    }

    private akws() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\nᐉ\u000b\fᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new akws();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akws.class);
            default:
                return null;
        }
    }
}
