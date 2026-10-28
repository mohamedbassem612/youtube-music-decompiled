package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aklb extends aihn implements aiis {
    public static final aklb a;
    private int b;
    private alay c;
    private ajwo d;
    private apji e;
    private ajwo f;
    private apji g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        aklb aklbVar = new aklb();
        a = aklbVar;
        aihn.registerDefaultInstance(aklb.class, aklbVar);
    }

    private aklb() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\r\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\fᐉ\u000b\rᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aklb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aklb.class);
            default:
                return null;
        }
    }
}
