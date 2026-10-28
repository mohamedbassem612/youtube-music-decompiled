package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ally extends aihn implements aiis {
    public static final ally a;
    private int b;
    private amwj c;
    private ared d;
    private aree e;
    private ajkw f;
    private byte g = 2;

    static {
        ally allyVar = new ally();
        a = allyVar;
        aihn.registerDefaultInstance(ally.class, allyVar);
    }

    private ally() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf38eឮ\ue35b僂\u0004\u0000\u0000\u0004\uf38eឮᐉ\u0000\uf66aឮᐉ\u0001\ue887㩾ᐉ\u0003\ue35b僂ᐉ\u0002", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new ally();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ally.class);
            default:
                return null;
        }
    }
}
