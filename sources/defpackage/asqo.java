package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asqo extends aihn implements aiis {
    public static final asqo a;
    public static final aihl b;

    static {
        asqo asqoVar = new asqo();
        a = asqoVar;
        aihn.registerDefaultInstance(asqo.class, asqoVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asqoVar, asqoVar, null, 336926123, aika.MESSAGE, asqo.class);
    }

    private asqo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new asqo();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(asqo.class);
        }
        return null;
    }
}
