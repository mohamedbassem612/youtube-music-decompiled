package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class assv extends aihn implements aiis {
    public static final assv a;
    public static final aihl b;
    public int c;
    public Object e;
    public int f;
    public int g;
    public CommandOuterClass$Command i;
    public int k;
    public CommandOuterClass$Command l;
    public CommandOuterClass$Command m;
    public boolean n;
    public int d = 0;
    private byte o = 2;
    public boolean h = true;
    public String j = "";

    static {
        assv assvVar = new assv();
        a = assvVar;
        aihn.registerDefaultInstance(assv.class, assvVar);
        b = aihn.newSingularGeneratedExtension(asow.a, assvVar, assvVar, null, 272494533, aika.MESSAGE, assv.class);
    }

    private assv() {
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
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0003\u0001ဋ\u0000\u00027\u0000\u00034\u0000\u0004င\u0001\u0007ဇ\u0004\bᐉ\u0005\tဈ\u0006\n᠌\u0007\u000bᐉ\b\fᐉ\t\rဇ\n", new Object[]{"e", "d", "c", "f", "g", "h", "i", "j", "k", assp.c, "l", "m", "n"});
            case 3:
                return new assv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assv.class);
            default:
                return null;
        }
    }
}
