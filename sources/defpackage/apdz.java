package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apdz extends aihn implements aiis {
    public static final apdz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private ajwo k;
    private ajwo l;
    private angb m;
    private ajwo n;
    private apji o;
    private byte p = 2;

    static {
        apdz apdzVar = new apdz();
        a = apdzVar;
        aihn.registerDefaultInstance(apdz.class, apdzVar);
    }

    private apdz() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u001a\r\u0000\u0000\r\u0002ᐉ\u0002\u0003ᐉ\u0003\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\r\tᐉ\u000f\u000fᐉ\u0007\u0012ᐉ\u0001\u0014ᐉ\t\u0015ᐉ\n\u0017ᐉ\u000e\u0018ᐉ\u0011\u001aᐉ\u0012", new Object[]{"b", "d", "e", "f", "h", "k", "m", "g", "c", "i", "j", "l", "n", "o"});
            case 3:
                return new apdz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apdz.class);
            default:
                return null;
        }
    }
}
