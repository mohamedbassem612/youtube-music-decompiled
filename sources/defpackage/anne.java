package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anne extends aihn implements aiis {
    public static final anne a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public apji g;
    public apji h;
    public apji i;
    public apji j;
    public ajwo m;
    private alay n;
    private alay o;
    private apji p;
    private apji q;
    private byte r = 2;
    public aiie f = emptyProtobufList();
    public aigj k = aigj.d;
    public aiie l = emptyProtobufList();

    static {
        anne anneVar = new anne();
        a = anneVar;
        aihn.registerDefaultInstance(anne.class, anneVar);
    }

    private anne() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\u000e\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0006\u0004ᐉ\b\u0005ᐉ\t\u0006ᐉ\n\bည\f\tᐉ\u0004\nᐉ\u0005\u000bЛ\fЛ\rᐉ\u0001\u000eᐉ\r\u000fᐉ\u0003\u0010ᐉ\u0007", new Object[]{"b", "c", "e", "g", "i", "j", "q", "k", "o", "p", "f", apji.class, "l", apji.class, "d", "m", "n", "h"});
            case 3:
                return new anne();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anne.class);
            default:
                return null;
        }
    }
}
