package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class albo extends aihn implements aiis {
    public static final albo a;
    private int b;
    private akci c;
    private akfy d;
    private akbq e;
    private byte f = 2;

    static {
        albo alboVar = new albo();
        a = alboVar;
        aihn.registerDefaultInstance(albo.class, alboVar);
    }

    private albo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf143ᠤ\uf5b1⼞\u0003\u0000\u0000\u0003\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0002\uf5b1⼞ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new albo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albo.class);
            default:
                return null;
        }
    }
}
