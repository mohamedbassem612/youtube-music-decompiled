package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amge extends aihn implements aiis {
    public static final amge a;
    public int b;
    public amgd c;
    public amgf d;
    public ajzb e;
    public amgl f;
    public amgk g;
    public aqau h;
    public akrn i;
    public aphm j;
    public ajta k;
    public akyi l;
    public akws m;
    public aqnd n;
    public amuz o;
    public aqyy p;
    public amtp q;
    public ajsw r;
    public aoku s;
    public apoc t;
    public amlk u;
    public aked v;
    public aoxw w;
    private byte x = 2;

    static {
        amge amgeVar = new amge();
        a = amgeVar;
        aihn.registerDefaultInstance(amge.class, amgeVar);
    }

    private amge() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001п\uf114\uf326\u0007\u0015\u0000\u0000\u0014пᐉ\fӌᐉ\u0011Ӱᐉ\u000fլᐉ\u000b\u05fcᐉ\rࡐᐉ\u0012\u09deဉ\u0014ῳᐉ\u000e酌ᐉ\u0013\ueb5dᵆᐉ\u0000\ue1e1⩩ᐉ\u0001履⭎ᐉ\b\uf649㊈ᐉ\u0002\uf492䤳ᐉ\u0006\ue29d去ᐉ\u0003\ue61d姑ᐉ\u0007\ue2f4廾ᐉ\u0004\uf152拄ᐉ\u0005\uecd7斿ᐉ\t\uf731샘ᐉ\n\uf114\uf326\u0007ᐉ\u0010", new Object[]{"b", "o", "t", "r", "n", "p", "u", "w", "q", "v", "c", "d", "k", "e", "i", "f", "j", "g", "h", "l", "m", "s"});
            case 3:
                return new amge();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amge.class);
            default:
                return null;
        }
    }
}
