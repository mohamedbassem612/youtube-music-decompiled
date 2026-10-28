package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amar extends aihn implements aiis {
    public static final amar a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amar amarVar = new amar();
        a = amarVar;
        aihn.registerDefaultInstance(amar.class, amarVar);
    }

    private amar() {
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
                return newMessageInfo(a, "\u0004\u000f\u0001\u0000\ue32bᯋﻗ恡\u000f\u0000\u0000\u000f\ue32bᯋм\u0000\ue9fd᷆м\u0000\uf321Ẑм\u0000\uf092Ἂм\u0000\uf437Ἳм\u0000\uf26a⤒м\u0000\uf88a\u2cf8м\u0000\uec26ⷙм\u0000\uefcf⸵м\u0000\uf28f㲟м\u0000\ue91b㲾м\u0000\ue923䶡м\u0000\ue611媯м\u0000\ueb32彣м\u0000ﻗ恡м\u0000", new Object[]{"c", "b", arpw.class, arpx.class, akdd.class, arpy.class, arqe.class, amfe.class, anpb.class, anfl.class, amzh.class, arqg.class, aqtb.class, albf.class, amsu.class, akmp.class, aqbr.class});
            case 3:
                return new amar();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amar.class);
            default:
                return null;
        }
    }
}
