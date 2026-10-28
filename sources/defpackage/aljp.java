package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aljp extends aihn implements aiis {
    public static final aljp a;
    public int b;
    public apji c;
    private apji d;
    private apji e;
    private ajwo f;
    private amkt g;
    private apji h;
    private alay i;
    private apji j;
    private apji k;
    private alzx l;
    private ajwo m;
    private apji n;
    private apji o;
    private byte p = 2;

    static {
        aljp aljpVar = new aljp();
        a = aljpVar;
        aihn.registerDefaultInstance(aljp.class, aljpVar);
    }

    private aljp() {
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
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\r\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0000\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u0003\fᐉ\u000b\rᐉ\f", new Object[]{"b", "e", "f", "d", "h", "i", "c", "j", "k", "l", "m", "g", "n", "o"});
            case 3:
                return new aljp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljp.class);
            default:
                return null;
        }
    }
}
