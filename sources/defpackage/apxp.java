package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxp extends aihn implements aiis {
    public static final apxp a;
    public static final aihl b;
    public int c;
    public asmv d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private byte i = 2;

    static {
        apxp apxpVar = new apxp();
        a = apxpVar;
        aihn.registerDefaultInstance(apxp.class, apxpVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), apxpVar, apxpVar, null, 234871417, aika.MESSAGE, apxp.class);
    }

    private apxp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new apxp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxp.class);
            default:
                return null;
        }
    }
}
