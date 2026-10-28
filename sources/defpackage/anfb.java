package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anfb extends aihn implements aiis {
    public static final anfb a;
    public int b;
    public Object d;
    public ajwo e;
    public int f;
    public int g;
    public long h;
    public int c = 0;
    private byte i = 2;

    static {
        anfb anfbVar = new anfb();
        a = anfbVar;
        aihn.registerDefaultInstance(anfb.class, anfbVar);
    }

    private anfb() {
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
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001;\u0000\u0002\u083f\u0000\u0003ᐉ\u0000\u0004᠌\u0001\u0005င\u0002\u0006ဂ\u0003", new Object[]{"d", "c", "b", amys.t, "e", "f", amys.o, "g", "h"});
            case 3:
                return new anfb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfb.class);
            default:
                return null;
        }
    }
}
