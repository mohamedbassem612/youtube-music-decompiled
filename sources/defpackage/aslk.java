package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aslk extends aihn implements aiis {
    public static final aslk a;
    public static final aihl b;
    public int c;
    public asob d;
    public asob e;
    public int f;
    public int g;
    public ason h;
    public float i;

    static {
        aslk aslkVar = new aslk();
        a = aslkVar;
        aihn.registerDefaultInstance(aslk.class, aslkVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), aslkVar, aslkVar, null, 198239242, aika.MESSAGE, aslk.class);
    }

    private aslk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0002\u0003င\u0003\u0004ဉ\u0004\u0005ခ\u0005\u0006ဉ\u0001", new Object[]{"c", "d", "f", "g", "h", "i", "e"});
        }
        if (iOrdinal == 3) {
            return new aslk();
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
        return aihn.getParserForClass(aslk.class);
    }
}
