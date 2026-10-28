package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajqb extends aihn implements aiis {
    public static final ajqb a;
    public int b;
    public akrn c;
    private ajqa d;
    private akdd e;
    private byte f = 2;

    static {
        ajqb ajqbVar = new ajqb();
        a = ajqbVar;
        aihn.registerDefaultInstance(ajqb.class, ajqbVar);
    }

    private ajqb() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\uf321Ẑ\uf492䤳\u0003\u0000\u0000\u0003\uf321Ẑᐉ\u0001\ueb42☡ᐉ\u0000\uf492䤳ᐉ\u0003", new Object[]{"b", "e", "d", "c"});
            case 3:
                return new ajqb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqb.class);
            default:
                return null;
        }
    }
}
