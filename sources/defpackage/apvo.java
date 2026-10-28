package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apvo extends aihn implements aiis {
    public static final apvo a;
    public int b;
    public aqhu c;
    public apji d;
    public apji e;
    public apji g;
    public apji h;
    public apji i;
    public apji j;
    public apji k;
    private apji l;
    private apji m;
    private ajwo n;
    private byte o = 2;
    public aiie f = emptyProtobufList();

    static {
        apvo apvoVar = new apvo();
        a = apvoVar;
        aihn.registerDefaultInstance(apvo.class, apvoVar);
    }

    private apvo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000e\f\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fᐉ\t\u000eᐉ\n", new Object[]{"b", "c", "d", "e", "f", apji.class, "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new apvo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvo.class);
            default:
                return null;
        }
    }
}
