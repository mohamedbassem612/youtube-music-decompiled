package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqma extends aihn implements aiis {
    public static final aqma a;
    private byte A = 2;
    private int b;
    private int c;
    private aqln d;
    private aqlq e;
    private aqlt f;
    private aqlu g;
    private aqmc h;
    private aqlr i;
    private aqlz j;
    private aovt k;
    private aqlv l;
    private ajkf m;
    private aqlp n;
    private ajkk o;
    private aqmb p;
    private aqmd q;
    private aqly r;
    private aqlw s;
    private aqqo t;
    private aqme u;
    private aqlx v;
    private aqlj w;
    private aqlo x;
    private aqls y;
    private ajqo z;

    static {
        aqma aqmaVar = new aqma();
        a = aqmaVar;
        aihn.registerDefaultInstance(aqma.class, aqmaVar);
    }

    private aqma() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002Ѝ\ue5b1\ue459\u0007\u0017\u0000\u0000\u0017Ѝᐉ\u001aҧᐉ\u001cҾᐉ\u001dԏᐉ\u001e֠ᐉ\u0000ीᐉ\"Ῡᐉ\u000eￆᡇᐉ\r\uf2ff㌙ᐉ\t\ue25a㌤ᐉ\u0005\ue7fe㑇ᐉ\u0002ﷁ㔾ᐉ\n\uefc0㨊ᐉ\u0011\ue95e㴥ᐉ\u0006\ue4f3乴ᐉ\u000b\ueb7a僅ᐉ\u0013\ue923幥ᐉ\u0007\ue0bf波ᐉ\u0014\ue8eb鑡ᐉ\u0003\uf23c飏ᐉ\u000f\uf497꽐ᐉ\u0017\ue299뤞ᐉ\u0019\ue5b1\ue459\u0007ᐉ ", new Object[]{"b", "c", "u", "v", "w", "x", "d", "z", "n", "m", "j", "g", "e", "k", "p", "h", "l", "q", "i", "r", "f", "o", "s", "t", "y"});
            case 3:
                return new aqma();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqma.class);
            default:
                return null;
        }
    }
}
