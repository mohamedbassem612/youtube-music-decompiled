package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alfr extends aihn implements aiis {
    public static final alfr a;
    public int b;
    public apji c;
    public alfp f;
    public alfs g;
    public int h;
    private alay i;
    private ajwo j;
    private alay k;
    private alay l;
    private byte m = 2;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        alfr alfrVar = new alfr();
        a = alfrVar;
        aihn.registerDefaultInstance(alfr.class, alfrVar);
    }

    private alfr() {
        aigj aigjVar = aigj.d;
    }

    public final void a() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0002\u0007\u0001Л\u0002Л\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\fဉ\n\r᠌\f\u0010ဉ\u000b\u0011ᐉ\u0000", new Object[]{"b", "d", alfu.class, "e", alft.class, "i", "j", "k", "l", "f", "h", ajpr.s, "g", "c"});
            case 3:
                return new alfr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfr.class);
            default:
                return null;
        }
    }
}
