package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajnq extends aihi implements aihj {
    public static final ajnq a;
    public static final aihl b;
    public int c;
    public int d;
    public Object f;
    public CommandOuterClass$Command g;
    public int i;
    public int k;
    public int l;
    public int m;
    public amud n;
    public boolean o;
    public boolean p;
    private CommandOuterClass$Command q;
    private CommandOuterClass$Command r;
    private CommandOuterClass$Command s;
    private CommandOuterClass$Command t;
    private apji u;
    private apji v;
    private apji w;
    public int e = 0;
    private byte x = 2;
    public String h = "";

    static {
        ajnq ajnqVar = new ajnq();
        a = ajnqVar;
        aihn.registerDefaultInstance(ajnq.class, ajnqVar);
        b = aihn.newSingularGeneratedExtension(apji.a, ajnqVar, ajnqVar, null, 461054335, aika.MESSAGE, ajnq.class);
    }

    private ajnq() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0001\u0002\u0003ϧ\u0012\u0000\u0000\n\u0003;\u0000\u0004ᐉ\u0000\u0005ဈ\u0005\u0007᠌\u000b\u000b᠌\f\fᐉ\u0002\r᠌\u000e\u000e᠌\r\u0013м\u0000\u001aᐉ\u0003\u001cဇ#\u001dဇ$&ᐉ\u0001-ᐉ(1ᐉ\u00042ᐉ.4ᐉ)ϧᐉ\u001f", new Object[]{"f", "e", "c", "d", "g", "h", "i", ajhd.o, "k", ajhd.p, "r", "m", ajhd.m, "l", ajhd.n, askp.class, "s", "o", "p", "q", "u", "t", "w", "v", "n"});
            case 3:
                return new ajnq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnq.class);
            default:
                return null;
        }
    }
}
