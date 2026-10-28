package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajkc extends aihn implements aiis {
    public static final ajkc a;
    public int b;
    public ajkf c;
    public anpv d;
    private ajkp e;
    private ajks f;
    private ajkt g;
    private ajku h;
    private ajki i;
    private ajkr j;
    private ajke k;
    private ajkb l;
    private aqua m;
    private aqyh n;
    private ajkj o;
    private angv p;
    private aoan q;
    private ajkd r;
    private amib s;
    private ajkg t;
    private byte u = 2;

    static {
        ajkc ajkcVar = new ajkc();
        a = ajkcVar;
        aihn.registerDefaultInstance(ajkc.class, ajkcVar);
    }

    private ajkc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\uedbbᡂﴞ\ueb40\u0007\u0012\u0000\u0000\u0012\uedbbᡂᐉ\u0004\ue7d2ᡆᐉ\u0003ￆᡇᐉ\u0001\ue5d8ᡈᐉ\u0000\ue5f3ᡉᐉ\u0002\ue14aᲱᐉ\u0007\ue859ἀᐉ\u000fￜ⚌ᐉ\t\ue425⩷ᐉ\n\uf6ea⪗ᐉ\u000bﻠⷡᐉ\r\ue496㴵ᐉ\u0010\uef0d䄖ᐉ\u000eￊ䈕ᐉ\u0011\uead0䫓ᐉ\u0012\uf682嗮ᐉ\u0018\ue16c蓉ᐉ\u001aﴞ\ueb40\u0007ᐉ\u0014", new Object[]{"b", "h", "g", "c", "e", "f", "i", "o", "j", "k", "l", "m", "p", "n", "q", "r", "d", "t", "s"});
            case 3:
                return new ajkc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkc.class);
            default:
                return null;
        }
    }
}
