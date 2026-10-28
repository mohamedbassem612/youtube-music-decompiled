package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anjb extends aihn implements aiis {
    public static final anjb a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajap j;
    private angb k;
    private amkt l;
    private alay m;
    private byte n = 2;

    static {
        anjb anjbVar = new anjb();
        a = anjbVar;
        aihn.registerDefaultInstance(anjb.class, anjbVar);
    }

    private anjb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u0013\u000b\u0000\u0000\u000b\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\n\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "k"});
            case 3:
                return new anjb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anjb.class);
            default:
                return null;
        }
    }
}
