package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axhz extends aihn implements aiis {
    public static final axhz a;
    public int b;
    public long c;
    public axgp f;
    public axgt g;
    public axhq h;
    public axhv i;
    public axfw j;
    public axht k;
    public axgw l;
    public axha m;
    public axft n;
    public axgg o;
    public axhi p;
    public axhl q;
    public axhy r;
    public axhr s;
    public axgh t;
    public axhj u;
    private axhm v;
    private byte w = 2;
    public String d = "";
    public String e = "";

    static {
        axhz axhzVar = new axhz();
        a = axhzVar;
        aihn.registerDefaultInstance(axhz.class, axhzVar);
    }

    private axhz() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001'\u0014\u0000\u0000\t\u0001ဉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fᐉ\t\u000eᐉ\u001a\u0010ᐉ\n\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0012\u001eဉ\u0015 ᐉ\u0010#ဉ\f'ဉ\u0013", new Object[]{"b", "f", "c", "d", "q", "g", "h", "r", "i", "j", "k", "t", "l", "e", "u", "s", "v", "p", "n", "m", "o"});
            case 3:
                return new axhz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axhz.class);
            default:
                return null;
        }
    }
}
