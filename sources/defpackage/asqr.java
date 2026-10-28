package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asqr extends aihn implements aiis {
    public static final asqr a;
    public static final aihl b;
    public int c;
    public Object e;
    public float g;
    public CommandOuterClass$Command h;
    public int d = 0;
    private byte i = 2;
    public String f = "";

    static {
        asqr asqrVar = new asqr();
        a = asqrVar;
        aihn.registerDefaultInstance(asqr.class, asqrVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asqrVar, asqrVar, null, 455760581, aika.MESSAGE, asqr.class);
    }

    private asqr() {
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
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0003ခ\u0002\u0004м\u0000\u0005;\u0000\u0006ᐉ\u0003", new Object[]{"e", "d", "c", "f", "g", CommandOuterClass$Command.class, "h"});
            case 3:
                return new asqr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqr.class);
            default:
                return null;
        }
    }
}
