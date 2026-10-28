package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqfv extends aihn implements aiis {
    public static final aqfv a;
    public int b;
    public apji d;
    public aivo e;
    public aiua f;
    public String h;
    private ajwo i;
    private ajwo j;
    private byte k = 2;
    public aiie c = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        aqfv aqfvVar = new aqfv();
        a = aqfvVar;
        aihn.registerDefaultInstance(aqfv.class, aqfvVar);
    }

    private aqfv() {
        emptyProtobufList();
        emptyProtobufList();
        this.h = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0001\u0005\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0004\u0007ဉ\u0005\tည\u0007\u000eဈ\u000b", new Object[]{"b", "c", aqfx.class, "i", "d", "j", "e", "f", "g", "h"});
            case 3:
                return new aqfv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqfv.class);
            default:
                return null;
        }
    }
}
