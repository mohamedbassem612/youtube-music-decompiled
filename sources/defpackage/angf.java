package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class angf extends aihn implements aiis {
    public static final angf a;
    public int b;
    public ajnf c;
    public ajnh d;
    public ajno e;
    public anyl f;
    public amks g;
    public aqen h;
    public aiql i;
    public aoua j;
    public appc k;
    public ajnq l;
    public appd m;
    public akze n;
    public aiqm o;
    public amkv p;
    private byte q = 2;

    static {
        angf angfVar = new angf();
        a = angfVar;
        aihn.registerDefaultInstance(angf.class, angfVar);
    }

    private angf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\ue2d9ᩭ\uf0d6\uf86d\u0007\u000e\u0000\u0000\u000e\ue2d9ᩭᐉ\u0005\uea9eᲧᐉ\u0004\ueb11ἑᐉ\u0000\ue5d8☢ᐉ\u0002\uf605勰ᐉ\u0003ﾟ繰ᐉ\u0006\ue110ꈕᐉ\u0001\ueb7c섋ᐉ\u0007\ue3e9힘ᐉ\b\ue17fﯙ\u0006ᐉ\t\uf15a\ue711\u0007ᐉ\r\uf4d5\ue711\u0007ᐉ\n\uef0c\uea9e\u0007ᐉ\f\uf0d6\uf86d\u0007ᐉ\u000b", new Object[]{"b", "h", "g", "c", "e", "f", "i", "d", "j", "k", "l", "p", "m", "o", "n"});
            case 3:
                return new angf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angf.class);
            default:
                return null;
        }
    }
}
