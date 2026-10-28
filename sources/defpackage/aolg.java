package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aolg extends aihn implements aiis {
    public static final aolg a;
    public int b;
    public apji c;
    public apji d;
    public apji e;
    public apji f;
    public boolean h;
    private byte i = 2;
    public aiie g = emptyProtobufList();

    static {
        aolg aolgVar = new aolg();
        a = aolgVar;
        aihn.registerDefaultInstance(aolg.class, aolgVar);
    }

    private aolg() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "g", apji.class, "f", "h"});
            case 3:
                return new aolg();
            case 4:
                return new aihf((char[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aolg.class);
            default:
                return null;
        }
    }
}
