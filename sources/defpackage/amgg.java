package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amgg extends aihi implements aihj {
    public static final amgg a;
    public static final aihl b;
    public int c;
    public amge d;
    public aqjn h;
    public akkc k;
    private byte l = 2;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public String g = "";
    public String i = "";

    static {
        amgg amggVar = new amgg();
        a = amggVar;
        aihn.registerDefaultInstance(amgg.class, amggVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, amggVar, amggVar, null, 50195462, aika.MESSAGE, amgg.class);
    }

    private amgg() {
        aigj aigjVar = aigj.d;
    }

    public final void d() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0015\u0007\u0000\u0002\u0004\u0001Л\u0002Л\u0005ᐉ\u0000\u0007ဈ\u0005\rဈ\u0002\u0013ဉ\u0003\u0015ᐉ\u0013", new Object[]{"c", "e", amgj.class, "f", amgi.class, "d", "i", "g", "h", "k"});
            case 3:
                return new amgg();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amgg.class);
            default:
                return null;
        }
    }
}
