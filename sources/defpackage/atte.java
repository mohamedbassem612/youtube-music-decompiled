package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atte extends aihi implements aihj {
    public static final atte a;
    public int b;
    public ahnl c;
    public atsh k;
    public int m;
    public atsf n;
    public atup o;
    private byte p = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public aiie l = emptyProtobufList();

    static {
        atte atteVar = new atte();
        a = atteVar;
        aihn.registerDefaultInstance(atte.class, atteVar);
    }

    private atte() {
    }

    public final void d() {
        aiie aiieVar = this.l;
        if (aiieVar.c()) {
            return;
        }
        this.l = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004င\b\u0005ဉ\t\u0006ᐉ\n\u0007ဈ\u0004\bဈ\u0006\t\u001a\nဈ\u0002\u000bဈ\u0005\fဉ\u0007", new Object[]{"b", "c", "d", "f", "m", "n", "o", "g", "i", "l", "e", "h", "k"});
            case 3:
                return new atte();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atte.class);
            default:
                return null;
        }
    }
}
