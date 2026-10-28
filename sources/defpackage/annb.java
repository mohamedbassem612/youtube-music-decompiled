package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annb extends aihn implements aiis {
    public static final annb a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public alay f;
    public apji g;
    public int h;
    public int i;
    public int j;
    private apji m;
    private alay n;
    private byte o = 2;
    public aigj k = aigj.d;
    public aiie l = emptyProtobufList();

    static {
        annb annbVar = new annb();
        a = annbVar;
        aihn.registerDefaultInstance(annb.class, annbVar);
    }

    private annb() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0005\u0006ည\n\u0007ဋ\u0006\bဋ\u0007\tЛ\nᐉ\u0004\u000b᠌\b\fᐉ\u0002\rᐉ\u000b", new Object[]{"b", "c", "d", "e", "g", "k", "h", "i", "l", ajwo.class, "f", "j", anvw.d, "m", "n"});
            case 3:
                return new annb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(annb.class);
            default:
                return null;
        }
    }
}
