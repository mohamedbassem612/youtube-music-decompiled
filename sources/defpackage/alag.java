package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alag extends aihn implements aiis {
    public static final alag a;
    public int b;
    public alay c;
    public alay d;
    public apji e;
    public apji g;
    private apji h;
    private byte i = 2;
    public aiie f = emptyProtobufList();

    static {
        alag alagVar = new alag();
        a = alagVar;
        aihn.registerDefaultInstance(alag.class, alagVar);
    }

    private alag() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", apji.class, "g", "h"});
            case 3:
                return new alag();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alag.class);
            default:
                return null;
        }
    }
}
