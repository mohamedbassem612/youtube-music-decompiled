package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asny extends aihn implements aiis {
    public static final asny a;
    public static final aihl b;
    public int c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$Command g;
    private byte h = 2;

    static {
        asny asnyVar = new asny();
        a = asnyVar;
        aihn.registerDefaultInstance(asny.class, asnyVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asnyVar, asnyVar, null, 170382629, aika.MESSAGE, asny.class);
    }

    private asny() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new asny();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asny.class);
            default:
                return null;
        }
    }
}
