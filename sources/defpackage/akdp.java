package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akdp extends aihn implements aiis {
    public static final akdp a;
    private int b;
    private alay c;
    private ajng d;
    private ajwo e;
    private ajng f;
    private alay g;
    private alay h;
    private ajng i;
    private ajng j;
    private alay k;
    private alay l;
    private alay m;
    private akdu n;
    private akdq o;
    private akdr p;
    private akds q;
    private ajng r;
    private ajng s;
    private alay t;
    private alay u;
    private alay v;
    private byte w = 2;

    static {
        akdp akdpVar = new akdp();
        a = akdpVar;
        aihn.registerDefaultInstance(akdp.class, akdpVar);
    }

    private akdp() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0016\u0014\u0000\u0000\u0014\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\rᐉ\u0003\u000eᐉ\u000b\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ᐉ\f\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ᐉ\r\u0016ᐉ\u0015", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "f", "n", "q", "r", "s", "o", "t", "u", "p", "v"});
            case 3:
                return new akdp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdp.class);
            default:
                return null;
        }
    }
}
