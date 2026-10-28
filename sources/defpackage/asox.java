package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class asox extends aihn implements aiis {
    public static final asox a;
    public static final aihl b;
    public String c = "";
    public aigj d = aigj.d;
    private int e;

    static {
        asox asoxVar = new asox();
        a = asoxVar;
        aihn.registerDefaultInstance(asox.class, asoxVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asoxVar, asoxVar, null, 170382760, aika.MESSAGE, asox.class);
    }

    private asox() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asox();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(asox.class);
    }
}
