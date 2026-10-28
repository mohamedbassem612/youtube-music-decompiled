package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqvx extends aihn implements aiis {
    public static final aqvx a;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private angb h;
    private ajwo i;
    private aqvw j;
    private ajkc k;
    private ajkc l;
    private aqyc m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private alay r;
    private alay s;
    private alay t;
    private alay u;
    private alay v;
    private alay w;
    private alay x;
    private ajwo y;
    private byte z = 2;

    static {
        aqvx aqvxVar = new aqvx();
        a = aqvxVar;
        aihn.registerDefaultInstance(aqvx.class, aqvxVar);
    }

    private aqvx() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0002\u0003(\u0016\u0000\u0000\u0016\u0003ᐉ\u0013\u0004ᐉ\u0005\u0007ᐉ\u0017\bᐉ\u0018\tᐉ\u0019\nᐉ\u001a\u000bᐉ\u001b\fᐉ\u001e\rᐉ\u001f\u000eᐉ \u000fᐉ!\u0010ᐉ\u0012\u0013ᐉ\u001c\u0014ᐉ\u001d\u001bᐉ\b\u001dᐉ\u0016\u001fᐉ\u0001 ᐉ\u0003!ᐉ\u0004\"ᐉ\f'ᐉ\r(ᐉ\u0002", new Object[]{"b", "c", "m", "h", "o", "p", "q", "r", "s", "v", "w", "x", "y", "l", "t", "u", "i", "n", "d", "f", "g", "j", "k", "e"});
            case 3:
                return new aqvx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvx.class);
            default:
                return null;
        }
    }
}
