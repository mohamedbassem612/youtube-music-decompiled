package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alim extends aihn implements aiis {
    public static final alim a;
    private int b;
    private apji c;
    private askp d;
    private askp e;
    private askp f;
    private askp g;
    private askp h;
    private apji i;
    private byte j = 2;

    static {
        alim alimVar = new alim();
        a = alimVar;
        aihn.registerDefaultInstance(alim.class, alimVar);
    }

    private alim() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\u001a\u0007\u0000\u0000\u0007\u0002ᐉ\u0003\u0006ᐉ\u0002\u000fᐉ\u0000\u0011ᐉ\u0004\u0016ᐉ\b\u0017ᐉ\t\u001aᐉ\f", new Object[]{"b", "e", "d", "c", "f", "g", "h", "i"});
            case 3:
                return new alim();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alim.class);
            default:
                return null;
        }
    }
}
