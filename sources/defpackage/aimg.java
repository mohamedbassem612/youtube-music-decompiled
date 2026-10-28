package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aimg extends aihn implements aiis {
    public static final aimg a;
    public int b;
    public int d;
    public aiip c = aiip.a;
    private byte e = 2;

    static {
        aimg aimgVar = new aimg();
        a = aimgVar;
        aihn.registerDefaultInstance(aimg.class, aimgVar);
    }

    private aimg() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001в\u0002င\u0000", new Object[]{"b", "c", new ahud(aika.STRING, "", aika.MESSAGE, aily.a), "d"});
            case 3:
                return new aimg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aimg.class);
            default:
                return null;
        }
    }
}
