package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqpi extends aihi implements aihj {
    public static final aihw a = new apej(5);
    public static final aqpi b;
    public int c;
    public int e;
    public int h;
    public long l;
    public int m;
    public int p;
    public boolean q;
    public boolean r;
    public long s;
    public boolean t;
    private byte u = 2;
    public String d = "";
    public aihv f = emptyIntList();
    public aiie g = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public String k = "";
    public String n = "";
    public aiie o = emptyProtobufList();

    static {
        aqpi aqpiVar = new aqpi();
        b = aqpiVar;
        aihn.registerDefaultInstance(aqpi.class, aqpiVar);
    }

    private aqpi() {
    }

    public final void d() {
        aiie aiieVar = this.i;
        if (aiieVar.c()) {
            return;
        }
        this.i = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0004\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u001b\u0004᠌\u0002\u0005\u001a\u0006ဈ\u0003\u0007ဂ\u0004\b᠌\u0005\tဈ\u0006\n\u001a\u000bင\u0007\fဇ\b\rဇ\t\u000eࠬ\u000fဂ\n\u0010ဇ\u000b", new Object[]{"c", "d", "e", aqkp.q, "g", aqdp.class, "h", aqkp.t, "i", "k", "l", "m", aofw.n, "n", "o", "p", "q", "r", "f", aqkp.s, "s", "t"});
            case 3:
                return new aqpi();
            case 4:
                return new aihh(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(aqpi.class);
            default:
                return null;
        }
    }
}
