package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoqc extends aihn implements aiis {
    public static final aoqc a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aoqc aoqcVar = new aoqc();
        a = aoqcVar;
        aihn.registerDefaultInstance(aoqc.class, aoqcVar);
    }

    private aoqc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf549᩸\ue79e걫\u0006\u0000\u0000\u0006\uf549᩸м\u0000ﰛỾм\u0000ﲁ㚒м\u0000\uf492䤳м\u0000\uf7ce䩰м\u0000\ue79e걫м\u0000", new Object[]{"c", "b", akcj.class, ajes.class, apuu.class, akrn.class, anjf.class, ajlh.class});
            case 3:
                return new aoqc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqc.class);
            default:
                return null;
        }
    }
}
