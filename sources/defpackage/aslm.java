package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aslm extends aihn implements aiis {
    public static final aslm a;
    public static final aihl b;
    public int c;
    public int d;
    public float e;
    public int g;
    public aslj i;
    public boolean f = true;
    public String h = "";

    static {
        aslm aslmVar = new aslm();
        a = aslmVar;
        aihn.registerDefaultInstance(aslm.class, aslmVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aslmVar, aslmVar, null, 281539545, aika.MESSAGE, aslm.class);
    }

    private aslm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f", "g", asel.u, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aslm();
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
        return aihn.getParserForClass(aslm.class);
    }
}
