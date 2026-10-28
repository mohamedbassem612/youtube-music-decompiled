package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apxm extends aihn implements aiis {
    public static final apxm a;
    private int b;
    private ajwo d;
    private aiip c = aiip.a;
    private byte e = 2;

    static {
        apxm apxmVar = new apxm();
        a = apxmVar;
        aihn.registerDefaultInstance(apxm.class, apxmVar);
    }

    private apxm() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0001\u0000\u0001\u00012\u0003ᐉ\u0001", new Object[]{"b", "c", new ahud(aika.UINT32, (Object) 0, aika.STRING, (Object) ""), "d"});
            case 3:
                return new apxm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxm.class);
            default:
                return null;
        }
    }
}
