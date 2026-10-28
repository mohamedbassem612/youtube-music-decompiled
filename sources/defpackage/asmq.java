package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asmq extends aihi implements aihj {
    public static final asmq a;
    public static final aihl b;
    public int c;
    public int e;
    public int f;
    private byte g = 2;
    public String d = "";

    static {
        asmq asmqVar = new asmq();
        a = asmqVar;
        aihn.registerDefaultInstance(asmq.class, asmqVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), asmqVar, asmqVar, null, 449848976, aika.MESSAGE, asmq.class);
    }

    private asmq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new asmq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asmq.class);
            default:
                return null;
        }
    }
}
