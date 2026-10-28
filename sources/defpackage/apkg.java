package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apkg extends aihn implements aiis {
    public static final apkg a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        apkg apkgVar = new apkg();
        a = apkgVar;
        aihn.registerDefaultInstance(apkg.class, apkgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apkgVar, apkgVar, null, 1610, aika.MESSAGE, apkg.class);
    }

    private apkg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", amyi.class});
        }
        if (iOrdinal == 3) {
            return new apkg();
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
        return aihn.getParserForClass(apkg.class);
    }
}
