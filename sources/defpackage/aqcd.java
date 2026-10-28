package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqcd extends aihn implements aiis {
    public static final aqcd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private apji h;
    private alay i;
    private alay j;
    private apji k;
    private alay l;
    private alay m;
    private alay n;
    private apji o;
    private apji p;
    private apji q;
    private apji r;
    private ajwo s;
    private byte t = 2;

    static {
        aqcd aqcdVar = new aqcd();
        a = aqcdVar;
        aihn.registerDefaultInstance(aqcd.class, aqcdVar);
    }

    private aqcd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\u0007\bᐉ\u0004\tᐉ\n\u000bᐉ\u0003\fᐉ\r\rᐉ\t\u000fᐉ\u0010\u0010ᐉ\u0011\u0013ᐉ\u000e\u0014ᐉ\u000b\u0015ᐉ\u0013", new Object[]{"b", "c", "d", "e", "h", "i", "k", "j", "g", "m", "f", "o", "l", "q", "r", "p", "n", "s"});
            case 3:
                return new aqcd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqcd.class);
            default:
                return null;
        }
    }
}
