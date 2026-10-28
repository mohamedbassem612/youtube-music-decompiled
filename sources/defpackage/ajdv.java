package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajdv extends aihn implements aiis {
    public static final ajdv a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ajdv ajdvVar = new ajdv();
        a = ajdvVar;
        aihn.registerDefaultInstance(ajdv.class, ajdvVar);
    }

    private ajdv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf076មﶫ\u17fa\u0002\u0000\u0000\u0001\uf076មм\u0000ﶫ\u17fa<\u0000", new Object[]{"c", "b", ajdz.class, ajea.class});
            case 3:
                return new ajdv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdv.class);
            default:
                return null;
        }
    }
}
