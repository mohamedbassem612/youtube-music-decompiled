package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apkl extends aihn implements aiis {
    public static final apkl a;
    public static final aihl b;
    public int c = 0;
    public Object d;

    static {
        apkl apklVar = new apkl();
        a = apklVar;
        aihn.registerDefaultInstance(apkl.class, apklVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apklVar, apklVar, null, 300413109, aika.MESSAGE, apkl.class);
    }

    private apkl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"d", "c", akud.class});
        }
        if (iOrdinal == 3) {
            return new apkl();
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
        return aihn.getParserForClass(apkl.class);
    }
}
