package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akui extends aihn implements aiis {
    public static final akui a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akui akuiVar = new akui();
        a = akuiVar;
        aihn.registerDefaultInstance(akui.class, akuiVar);
    }

    private akui() {
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
                return newMessageInfo(a, "\u0001\u000e\u0001\u0000Ծ\uf04f\uf28f\u0007\u000e\u0000\u0000\u000eԾм\u0000\u05ecм\u0000غм\u0000٣м\u0000\uf158ᠤм\u0000ﳌ䈠м\u0000\uf492䤳м\u0000\ueb1b堗м\u0000\uf346峋м\u0000\uf3c0窌м\u0000\ue99c籗м\u0000\uf0a1遆м\u0000פּ鼮м\u0000\uf04f\uf28f\u0007м\u0000", new Object[]{"c", "b", akun.class, aolf.class, alar.class, aolm.class, aouj.class, akuo.class, akrn.class, aizv.class, aizu.class, aqxs.class, aokp.class, aqnv.class, aokq.class, aokv.class});
            case 3:
                return new akui();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akui.class);
            default:
                return null;
        }
    }
}
