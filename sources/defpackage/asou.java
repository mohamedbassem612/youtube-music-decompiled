package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asou extends aihn implements aiis {
    public static final asou a;
    public static final aihl b;
    private int c;
    private CommandOuterClass$Command d;
    private byte e = 2;

    static {
        asou asouVar = new asou();
        a = asouVar;
        aihn.registerDefaultInstance(asou.class, asouVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asouVar, asouVar, null, 501637953, aika.MESSAGE, asou.class);
    }

    private asou() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new asou();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asou.class);
            default:
                return null;
        }
    }
}
