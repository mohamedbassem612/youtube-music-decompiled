package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apgz extends aihn implements aiis {
    public static final apgz a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        apgz apgzVar = new apgz();
        a = apgzVar;
        aihn.registerDefaultInstance(apgz.class, apgzVar);
    }

    private apgz() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", apgy.class});
            case 3:
                return new apgz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apgz.class);
            default:
                return null;
        }
    }
}
