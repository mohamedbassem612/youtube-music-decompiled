package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akny extends aihn implements aiis {
    public static final akny a;
    public int b;
    public akoa c;
    private apuc d;
    private apub e;
    private aknz f;
    private akoe g;
    private akod h;
    private akof i;
    private byte j = 2;

    static {
        akny aknyVar = new akny();
        a = aknyVar;
        aihn.registerDefaultInstance(akny.class, aknyVar);
    }

    private akny() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\uf85c⇧\uf22c鼠\u0007\u0000\u0000\u0007\uf85c⇧ᐉ\u0000\ue9c1⇨ᐉ\u0002\ueb8b≢ᐉ\u0001窱┕ᐉ\u0003\uf79d⼚ᐉ\u0004\uecb5㨞ᐉ\u0005\uf22c鼠ᐉ\u0006", new Object[]{"b", "d", "f", "e", "c", "g", "h", "i"});
            case 3:
                return new akny();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akny.class);
            default:
                return null;
        }
    }
}
