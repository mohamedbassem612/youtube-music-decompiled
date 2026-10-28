package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amfb extends aihn implements aiis {
    public static final amfb a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        amfb amfbVar = new amfb();
        a = amfbVar;
        aihn.registerDefaultInstance(amfb.class, amfbVar);
    }

    private amfb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"b", amfa.class});
            case 3:
                return new amfb();
            case 4:
                return new aihf((boolean[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amfb.class);
            default:
                return null;
        }
    }
}
