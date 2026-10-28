package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akpi extends aihn implements aiis {
    public static final akpi a;
    public static final aihl b;
    private byte c = 2;

    static {
        akpi akpiVar = new akpi();
        a = akpiVar;
        aihn.registerDefaultInstance(akpi.class, akpiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akpiVar, akpiVar, null, 90427601, aika.MESSAGE, akpi.class);
    }

    private akpi() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new akpi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akpi.class);
            default:
                return null;
        }
    }
}
