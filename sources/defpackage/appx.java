package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appx extends aihn implements aiis {
    public static final appx a;
    public static final aihl b;

    static {
        appx appxVar = new appx();
        a = appxVar;
        aihn.registerDefaultInstance(appx.class, appxVar);
        ajwo ajwoVar = ajwo.a;
        appw appwVar = appw.a;
        b = aihn.newSingularGeneratedExtension(ajwoVar, appwVar, appwVar, null, 144224893, aika.MESSAGE, appw.class);
    }

    private appx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new appx();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(appx.class);
        }
        return null;
    }
}
