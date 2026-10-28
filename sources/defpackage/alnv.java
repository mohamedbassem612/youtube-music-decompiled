package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnv extends aihn implements aiis {
    public static final alnv a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alnv alnvVar = new alnv();
        a = alnvVar;
        aihn.registerDefaultInstance(alnv.class, alnvVar);
    }

    private alnv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue809ᶳ\uf492䤳\u0002\u0000\u0000\u0002\ue809ᶳм\u0000\uf492䤳м\u0000", new Object[]{"c", "b", ajza.class, akrn.class});
            case 3:
                return new alnv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnv.class);
            default:
                return null;
        }
    }
}
