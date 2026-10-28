package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class asss extends aihi implements aihj {
    public static final asss a;
    public static final aihl b;
    public int c;
    public asmv d;
    public asmv e;
    public asmv g;
    public CommandOuterClass$Command i;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    private byte o = 2;
    public aiie f = emptyProtobufList();
    public String h = "";

    static {
        asss asssVar = new asss();
        a = asssVar;
        aihn.registerDefaultInstance(asss.class, asssVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asssVar, asssVar, null, 278463287, aika.MESSAGE, asss.class);
    }

    private asss() {
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
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0003\u0005ᐉ\u0004\nင\u0005\u000bᐉ\u0002\fဇ\t\u000eဇ\u000b\u000f᠌\f", new Object[]{"c", "d", "e", "f", asmv.class, "h", "i", "k", "g", "l", "m", "n", apsb.o});
            case 3:
                return new asss();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asss.class);
            default:
                return null;
        }
    }
}
