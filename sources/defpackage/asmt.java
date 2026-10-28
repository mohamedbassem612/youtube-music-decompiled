package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asmt extends aihn implements aiis {
    public static final asmt a;
    public static final aihl b;
    public int c;
    public askp d;
    public int e;
    public boolean f;
    public int g;
    public asms h;
    public int i;
    private byte j = 2;

    static {
        asmt asmtVar = new asmt();
        a = asmtVar;
        aihn.registerDefaultInstance(asmt.class, asmtVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), asmtVar, asmtVar, null, 194116769, aika.MESSAGE, asmt.class);
    }

    private asmt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004\u0006ဉ\u0005\u0007င\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new asmt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asmt.class);
            default:
                return null;
        }
    }
}
