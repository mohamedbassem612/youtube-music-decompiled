package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anib extends aihn implements aiis {
    public static final anib a;
    public int b;
    public anhh c;
    public ajwo e;
    public ajwo f;
    public ajwo g;
    public boolean h;
    public ania i;
    private ajwo j;
    private ajwo k;
    public aiip d = aiip.a;
    private byte l = 2;

    static {
        anib anibVar = new anib();
        a = anibVar;
        aihn.registerDefaultInstance(anib.class, anibVar);
    }

    private anib() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0007\u0001ဉ\u0000\u0002в\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bဇ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", new ahud(aika.STRING, "", aika.MESSAGE, ajwo.a), "e", "f", "j", "k", "g", "h", "i"});
            case 3:
                return new anib();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anib.class);
            default:
                return null;
        }
    }
}
