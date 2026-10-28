package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqco extends aihn implements aiis {
    public static final aqco a;
    private int b;
    private int c;
    private apji d;
    private apji e;
    private alay f;
    private alay g;
    private ajng h;
    private ajng i;
    private ajng j;
    private apji k;
    private alay l;
    private ajwo m;
    private apji n;
    private apji o;
    private apji p;
    private ajwo q;
    private byte r = 2;

    static {
        aqco aqcoVar = new aqco();
        a = aqcoVar;
        aihn.registerDefaultInstance(aqco.class, aqcoVar);
    }

    private aqco() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0002\b*\u000e\u0000\u0000\u000e\bᐉ\u000e\tᐉ\u0012\nᐉ\u0013\u000bᐉ\u0014\fᐉ\u0015\rᐉ\u0018\u001aᐉ\u0017\u001eᐉ \u001fᐉ!!ᐉ##ᐉ\u0016%ᐉ\u0004&ᐉ\u0005*ᐉ%", new Object[]{"b", "c", "f", "g", "h", "i", "j", "m", "l", "n", "o", "p", "k", "d", "e", "q"});
            case 3:
                return new aqco();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqco.class);
            default:
                return null;
        }
    }
}
