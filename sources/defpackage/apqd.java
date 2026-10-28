package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apqd extends aihn implements aiis {
    public static final apqd a;
    public static final aihl b;
    private byte e = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        apqd apqdVar = new apqd();
        a = apqdVar;
        aihn.registerDefaultInstance(apqd.class, apqdVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apqdVar, apqdVar, null, 81212182, aika.MESSAGE, apqd.class);
    }

    private apqd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"c", apqc.class, "d", ajwo.class});
            case 3:
                return new apqd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqd.class);
            default:
                return null;
        }
    }
}
