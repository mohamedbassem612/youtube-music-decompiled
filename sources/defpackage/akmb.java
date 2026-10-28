package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akmb extends aihn implements aiis {
    public static final akmb a;
    public static final aihl b;

    static {
        akmb akmbVar = new akmb();
        a = akmbVar;
        aihn.registerDefaultInstance(akmb.class, akmbVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), akmbVar, akmbVar, null, 221166232, aika.MESSAGE, akmb.class);
    }

    private akmb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new akmb();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(akmb.class);
        }
        return null;
    }
}
