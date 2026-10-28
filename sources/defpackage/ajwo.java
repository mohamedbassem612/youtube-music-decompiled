package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajwo extends aihi implements aihj {
    public static final ajwo a;
    public int b;
    public ajwp e;
    private byte f = 2;
    public aigj c = aigj.d;
    public aiie d = emptyProtobufList();

    static {
        ajwo ajwoVar = new ajwo();
        a = ajwoVar;
        aihn.registerDefaultInstance(ajwo.class, ajwoVar);
    }

    private ajwo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002ည\u0000\u0003\u001b\u0004ᐉ\u0001", new Object[]{"b", "c", "d", amuo.class, "e"});
            case 3:
                return new ajwo();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajwo.class);
            default:
                return null;
        }
    }
}
