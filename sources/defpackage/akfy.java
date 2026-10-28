package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akfy extends aihi implements aihj {
    public static final akfy a;
    private int d;
    private byte e = 2;
    public aigj b = aigj.d;
    public aiie c = emptyProtobufList();

    static {
        akfy akfyVar = new akfy();
        a = akfyVar;
        aihn.registerDefaultInstance(akfy.class, akfyVar);
    }

    private akfy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002ည\u0001\u0003Л", new Object[]{"d", "b", "c", ajwo.class});
            case 3:
                return new akfy();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfy.class);
            default:
                return null;
        }
    }
}
