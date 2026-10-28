package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aslr extends aihn implements aiis {
    public static final aslr a;
    public static final aihl b;
    public int c;
    public float d;

    static {
        aslr aslrVar = new aslr();
        a = aslrVar;
        aihn.registerDefaultInstance(aslr.class, aslrVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), aslrVar, aslrVar, null, 472454038, aika.MESSAGE, aslr.class);
    }

    private aslr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aslr();
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
        return aihn.getParserForClass(aslr.class);
    }
}
