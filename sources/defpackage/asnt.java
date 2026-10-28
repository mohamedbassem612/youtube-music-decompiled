package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asnt extends aihn implements aiis {
    public static final asnt a;
    public static final aihl b;
    public int c;
    public asnm d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public asnm g;
    public boolean h;
    public int i;
    public int j;
    public asns k;
    public asnq l;
    public CommandOuterClass$Command m;
    public CommandOuterClass$Command n;
    public boolean o;
    public boolean p;
    public boolean q;
    private byte r = 2;

    static {
        asnt asntVar = new asnt();
        a = asntVar;
        aihn.registerDefaultInstance(asnt.class, asntVar);
        b = aihn.newSingularGeneratedExtension(asow.a, asntVar, asntVar, null, 277808098, aika.MESSAGE, asnt.class);
    }

    private asnt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007᠌\u0006\tဉ\b\u000bဉ\n\fᐉ\u000b\rᐉ\f\u000eဇ\r\u000fဇ\u000e\u0011ဇ\u0010", new Object[]{"c", "d", "e", "f", "g", "h", "i", asmm.j, "j", asmm.i, "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new asnt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnt.class);
            default:
                return null;
        }
    }
}
