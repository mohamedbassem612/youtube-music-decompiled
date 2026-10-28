package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class altm extends aihn implements aiis {
    public static final altm a;
    public alop b;
    public boolean c;
    private int e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        altm altmVar = new altm();
        a = altmVar;
        aihn.registerDefaultInstance(altm.class, altmVar);
    }

    private altm() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0004Л", new Object[]{"e", "b", "c", "d", ajwo.class});
            case 3:
                return new altm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altm.class);
            default:
                return null;
        }
    }
}
