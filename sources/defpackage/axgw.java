package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgw extends aihn implements aiis {
    public static final axgw a;
    public int b;
    public long c;
    public int d;
    public axgz f;
    private byte g = 2;
    public aiie e = emptyProtobufList();

    static {
        axgw axgwVar = new axgw();
        a = axgwVar;
        aihn.registerDefaultInstance(axgw.class, axgwVar);
    }

    private axgw() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", axgx.class, "d", audg.u, "f"});
            case 3:
                return new axgw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axgw.class);
            default:
                return null;
        }
    }
}
