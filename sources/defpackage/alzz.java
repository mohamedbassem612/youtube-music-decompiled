package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alzz extends aihn implements aiis {
    public static final alzz a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alzz alzzVar = new alzz();
        a = alzzVar;
        aihn.registerDefaultInstance(alzz.class, alzzVar);
    }

    private alzz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue315ᮯ\uf286㾂\u0003\u0000\u0000\u0002\ue315ᮯм\u0000ﬧ㠑м\u0000\uf286㾂<\u0000", new Object[]{"c", "b", ajam.class, ajan.class, apdi.class});
            case 3:
                return new alzz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzz.class);
            default:
                return null;
        }
    }
}
