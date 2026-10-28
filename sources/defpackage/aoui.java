package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoui extends aihn implements aiis {
    public static final aoui a;
    public int b;
    public aoun c;
    public ajin d;
    public aouu e;
    private aqus f;
    private aqvv g;
    private aotm h;
    private aoug i;
    private aouk j;
    private akrn k;
    private angn l;
    private aqmq m;
    private byte n = 2;

    static {
        aoui aouiVar = new aoui();
        a = aouiVar;
        aihn.registerDefaultInstance(aoui.class, aouiVar);
    }

    private aoui() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\uf875ᢰ\uf6ce淸\u000b\u0000\u0000\u000b\uf875ᢰᐉ\u0000\ue592᯦ᐉ\t\ue0b9⸫ᐉ\u0003\ue377⹒ᐉ\u0001\ue3c8⹒ᐉ\u0002ﱉ㚈ᐉ\u0004\uecd5䉹ᐉ\u0005\uf492䤳ᐉ\b\ue091抢ᐉ\u0006ﾭ朰ᐉ\u0007\uf6ce淸ᐉ\n", new Object[]{"b", "c", "l", "d", "f", "g", "h", "i", "k", "e", "j", "m"});
            case 3:
                return new aoui();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoui.class);
            default:
                return null;
        }
    }
}
