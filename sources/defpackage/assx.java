package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class assx extends aihn implements aiis {
    public static final assx a;
    public static final aihl b;
    public int c;
    public askp d;
    public askp e;
    public boolean h;
    public float i;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public float r;
    private byte t = 2;
    public String f = "";
    public String g = "";
    public aiie j = emptyProtobufList();
    public aiie k = emptyProtobufList();
    public String s = "";

    static {
        assx assxVar = new assx();
        a = assxVar;
        aihn.registerDefaultInstance(assx.class, assxVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), assxVar, assxVar, null, 220721894, aika.MESSAGE, assx.class);
    }

    private assx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0002\u0003\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ဇ\u0004\u0004ခ\u0005\u0007\u001b\bဈ\u0003\tဇ\b\nင\t\u000bင\n\fင\u000b\rЛ\u000eခ\f\u000fခ\r\u0010ခ\u000e\u0011ဈ\u000f\u0012ᐉ\u0001", new Object[]{"c", "d", "f", "h", "i", "j", asso.class, "g", "l", "m", "n", "o", "k", aktq.class, "p", "q", "r", "s", "e"});
            case 3:
                return new assx();
            case 4:
                return new aihf((short[][][]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assx.class);
            default:
                return null;
        }
    }
}
