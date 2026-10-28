package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aknp extends aihn implements aiis {
    public static final aknp a;
    public static final aihl b;
    public int c;
    public CommandOuterClass$Command e;
    public asmv g;
    private byte h = 2;
    public String d = "";
    public aigj f = aigj.d;

    static {
        aknp aknpVar = new aknp();
        a = aknpVar;
        aihn.registerDefaultInstance(aknp.class, aknpVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aknpVar, aknpVar, null, 410903799, aika.MESSAGE, aknp.class);
    }

    private aknp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aknp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aknp.class);
            default:
                return null;
        }
    }
}
