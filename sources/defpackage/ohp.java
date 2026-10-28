package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohp extends aihn implements aiis {
    public static final ohp a;
    public int b;
    public int f;
    public int g;
    public long i;
    public aifv l;
    public aifv m;
    private byte o = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie h = emptyProtobufList();
    public String j = "";
    public aiie k = emptyProtobufList();
    public String n = "";

    static {
        ohp ohpVar = new ohp();
        a = ohpVar;
        aihn.registerDefaultInstance(ohp.class, ohpVar);
    }

    private ohp() {
    }

    public final void a() {
        aiie aiieVar = this.h;
        if (aiieVar.c()) {
            return;
        }
        this.h = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0003\u0005᠌\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b\u000fဈ\n", new Object[]{"b", "c", "h", oho.class, "d", "f", "g", fxi.j, "e", "i", "k", "l", "j", "m", "n"});
            case 3:
                return new ohp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ohp.class);
            default:
                return null;
        }
    }
}
