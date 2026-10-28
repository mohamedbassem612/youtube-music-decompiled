package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyf extends aihn implements aiis {
    public static final ajyf a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ajyf ajyfVar = new ajyf();
        a = ajyfVar;
        aihn.registerDefaultInstance(ajyf.class, ajyfVar);
    }

    private ajyf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue87bᶳ陼퇆\u0003\u0000\u0000\u0003\ue87bᶳм\u0000\uf72c䰍м\u0000陼퇆м\u0000", new Object[]{"c", "b", ajye.class, akei.class, ajzj.class});
            case 3:
                return new ajyf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyf.class);
            default:
                return null;
        }
    }
}
