package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apts extends aihn implements aiis {
    public static final apts a;
    public int b;
    public aptq c;
    private byte d = 2;

    static {
        apts aptsVar = new apts();
        a = aptsVar;
        aihn.registerDefaultInstance(apts.class, aptsVar);
    }

    private apts() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf629⧧\uf629⧧\u0001\u0000\u0000\u0001\uf629⧧ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apts();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apts.class);
            default:
                return null;
        }
    }
}
