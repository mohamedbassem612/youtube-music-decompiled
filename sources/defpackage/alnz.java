package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnz extends aihn implements aiis {
    public static final alnz a;
    public int b;
    public alop c;
    public aloa d;
    public alna f;
    public boolean g;
    private albe h;
    private byte i = 2;
    public aiie e = emptyProtobufList();

    static {
        alnz alnzVar = new alnz();
        a = alnzVar;
        aihn.registerDefaultInstance(alnz.class, alnzVar);
    }

    private alnz() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004Л\u0006ᐉ\u0003\tဇ\u0006̉ᐉ\u0007", new Object[]{"b", "c", "d", "e", ajwo.class, "f", "g", "h"});
            case 3:
                return new alnz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnz.class);
            default:
                return null;
        }
    }
}
