package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apfu extends aihn implements aiis {
    public static final apfu a;
    public int b;
    public int c;
    public apel d;
    public apek e;
    public apgf f;
    public ajwo g;
    public apfi h;
    public apdp i;
    public apfd j;
    public ajuk k;
    private byte m = 2;
    public aiie l = emptyProtobufList();

    static {
        apfu apfuVar = new apfu();
        a = apfuVar;
        aihn.registerDefaultInstance(apfu.class, apfuVar);
    }

    private apfu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u0010\n\u0000\u0001\u0002\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\rဉ\f\u0010Л", new Object[]{"b", "c", apdr.i, "d", "e", "f", "g", "h", "i", "j", "k", "l", alqj.class});
            case 3:
                return new apfu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apfu.class);
            default:
                return null;
        }
    }
}
