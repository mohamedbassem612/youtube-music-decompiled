package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajda extends aihn implements aiis {
    public static final ajda a;
    public int b;
    public Object d;
    public ajcu e;
    public ajwo f;
    public ajwo g;
    public ajwo h;
    public ajwo i;
    public ajwo j;
    public aisd o;
    public int p;
    public aqwr q;
    public int r;
    public apji s;
    public aocc t;
    public amud u;
    public int c = 0;
    private byte v = 2;
    public aiie k = emptyProtobufList();
    public aiie l = emptyProtobufList();
    public aiie m = emptyProtobufList();
    public aihy n = emptyLongList();

    static {
        ajda ajdaVar = new ajda();
        a = ajdaVar;
        aihn.registerDefaultInstance(ajda.class, ajdaVar);
    }

    private ajda() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0001\u0001\u0001ϧ\u0014\u0000\u0004\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005Л\u0006Л\b\u0014\nᐉ\u0006\u0011м\u0000\u0012᠌\b\u0016ᐉ\u0005\u0018ဉ\t\u001aင\n\u001bᐉ\u0002\u001cЛ\u001dᐉ\u000b!ဉ\r\"м\u0000#м\u0000ϧᐉ\u000e", new Object[]{"d", "c", "b", "e", "f", "h", "i", "k", ajcy.class, "l", ajwo.class, "n", "o", ajcv.class, "p", aixp.l, "j", "q", "r", "g", "m", ajwo.class, "s", "t", ajcz.class, ajcw.class, "u"});
            case 3:
                return new ajda();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajda.class);
            default:
                return null;
        }
    }
}
