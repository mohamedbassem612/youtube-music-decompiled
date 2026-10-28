package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alpw extends aihn implements aiis {
    public static final alpw a;
    public int b;
    public alop c;
    public apji d;
    public apji e;
    public apji f;
    public int g;
    public int h;
    private apjh i;
    private byte j = 2;

    static {
        alpw alpwVar = new alpw();
        a = alpwVar;
        aihn.registerDefaultInstance(alpw.class, alpwVar);
    }

    private alpw() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\bᐉ\u0004\tဋ\u0005\nဋ\u0006", new Object[]{"b", "c", "d", "e", "f", "i", "g", "h"});
            case 3:
                return new alpw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpw.class);
            default:
                return null;
        }
    }
}
