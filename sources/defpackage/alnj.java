package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnj extends aihn implements aiis {
    public static final alnj a;
    public int b;
    public alop c;
    public apok f;
    private albe g;
    private byte h = 2;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        alnj alnjVar = new alnj();
        a = alnjVar;
        aihn.registerDefaultInstance(alnj.class, alnjVar);
    }

    private alnj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0002\u0005\u0001ᐉ\u0000\u0002Л\u0005Л\u0007ᐉ\u0001̉ᐉ\u0002", new Object[]{"b", "c", "d", alna.class, "e", ajwo.class, "f", "g"});
            case 3:
                return new alnj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnj.class);
            default:
                return null;
        }
    }
}
