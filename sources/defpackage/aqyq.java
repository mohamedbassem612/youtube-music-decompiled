package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqyq extends aihn implements aiis {
    public static final aqyq a;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private angb k;
    private ajwo l;
    private ajwo m;
    private ajkc n;
    private ajkc o;
    private ajkc p;
    private apji q;
    private apji r;
    private ajkc s;
    private alay t;
    private alay u;
    private alay v;
    private alay w;
    private ajwo x;
    private ajwo y;
    private byte z = 2;

    static {
        aqyq aqyqVar = new aqyq();
        a = aqyqVar;
        aihn.registerDefaultInstance(aqyq.class, aqyqVar);
    }

    private aqyq() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0016\u0000\u0002\u0003<\u0016\u0000\u0000\u0016\u0003ᐉ\u0019\u000bᐉ\u000e\u001dᐉ\u001a\u001eᐉ\u001b\u001fᐉ\u001c\"ᐉ\n&ᐉ\u0011'ᐉ\u0001(ᐉ\u0002)ᐉ\u0003*ᐉ\u0004,ᐉ\u0005-ᐉ\u0006.ᐉ\u000f1ᐉ\r2ᐉ\u00145ᐉ\u00136ᐉ\u00128ᐉ\u00159ᐉ\u0016;ᐉ\u001f<ᐉ ", new Object[]{"b", "c", "t", "l", "u", "v", "w", "j", "n", "d", "e", "f", "g", "h", "i", "m", "k", "q", "p", "o", "r", "s", "x", "y"});
            case 3:
                return new aqyq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyq.class);
            default:
                return null;
        }
    }
}
