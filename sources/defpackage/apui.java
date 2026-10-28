package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apui extends aihn implements aiis {
    public static final apui a;
    private int b;
    private apuq c;
    private apuh d;
    private apuh e;
    private ajwo f;
    private ajwo g;
    private byte h = 2;

    static {
        apui apuiVar = new apui();
        a = apuiVar;
        aihn.registerDefaultInstance(apui.class, apuiVar);
    }

    private apui() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new apui();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apui.class);
            default:
                return null;
        }
    }
}
