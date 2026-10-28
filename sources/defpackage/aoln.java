package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoln extends aihn implements aiis {
    public static final aoln a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aoln aolnVar = new aoln();
        a = aolnVar;
        aihn.registerDefaultInstance(aoln.class, aolnVar);
    }

    private aoln() {
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
                return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u09baﺊ튎\u0007\u0000\u0000\u0007\u09baм\u0000῭м\u0000迴м\u0000\ufaea䈠м\u0000\uf492䤳м\u0000\uf011콗м\u0000ﺊ튎м\u0000", new Object[]{"c", "b", anhu.class, aptz.class, aklt.class, akuj.class, akrn.class, aniy.class, aolg.class});
            case 3:
                return new aoln();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoln.class);
            default:
                return null;
        }
    }
}
