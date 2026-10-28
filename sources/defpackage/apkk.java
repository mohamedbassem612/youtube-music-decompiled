package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apkk extends aihn implements aiis {
    public static final apkk a;
    public static final aihl b;
    public int c = 0;
    public Object d;

    static {
        apkk apkkVar = new apkk();
        a = apkkVar;
        aihn.registerDefaultInstance(apkk.class, apkkVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apkkVar, apkkVar, null, 300135747, aika.MESSAGE, apkk.class);
    }

    private apkk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"d", "c", akud.class});
        }
        if (iOrdinal == 3) {
            return new apkk();
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
        return aihn.getParserForClass(apkk.class);
    }
}
