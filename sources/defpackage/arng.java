package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arng extends aihn implements aiis {
    public static final arng a;
    private int b;
    private askp c;
    private arni d;
    private arnh e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private apji l;
    private apji m;
    private apji n;
    private apji o;
    private byte p = 2;

    static {
        arng arngVar = new arng();
        a = arngVar;
        aihn.registerDefaultInstance(arng.class, arngVar);
    }

    private arng() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001d\r\u0000\u0000\r\u0001ᐉ\u0006\u0002ᐉ\u0007\u0004ᐉ\u000f\u0005ᐉ\u0010\u0006ᐉ\b\nᐉ\u000b\u0010ᐉ\f\u0011ᐉ\u0016\u0012ᐉ\u0015\u0013ᐉ\u000e\u0014ᐉ\r\u001aᐉ\u0017\u001dᐉ\u0011", new Object[]{"b", "c", "d", "j", "k", "e", "f", "g", "n", "m", "i", "h", "o", "l"});
            case 3:
                return new arng();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arng.class);
            default:
                return null;
        }
    }
}
