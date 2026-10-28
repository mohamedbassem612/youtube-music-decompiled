package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ambj extends aihn implements aiis {
    public static final ambj a;
    public Object c;
    public int b = 0;
    private byte e = 2;
    public aiie d = emptyProtobufList();

    static {
        ambj ambjVar = new ambj();
        a = ambjVar;
        aihn.registerDefaultInstance(ambj.class, ambjVar);
    }

    private ambj() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", apox.class, ambf.class, ambd.class});
            case 3:
                return new ambj();
            case 4:
                return new aihf((short[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ambj.class);
            default:
                return null;
        }
    }
}
