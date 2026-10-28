package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxv extends aihn implements aiis {
    public static final apxv a;
    public static final aihl b;
    public int c;
    public asmv d;
    public akrl e;
    public aoli f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public CommandOuterClass$Command l;
    public boolean m;
    public int n;
    private aiip p = aiip.a;
    private byte q = 2;
    public aigj g = aigj.d;
    public aiie o = emptyProtobufList();

    static {
        apxv apxvVar = new apxv();
        a = apxvVar;
        aihn.registerDefaultInstance(apxv.class, apxvVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), apxvVar, apxvVar, null, 221293762, aika.MESSAGE, apxv.class);
    }

    private apxv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0001\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0005\u0005ဇ\b\u0007ᐉ\n\b2\nည\u0003\u000b᠌\r\fᐉ\u0002\rဇ\u000b\u000e\u001b\u000fဇ\u0004\u0010ဇ\u0006", new Object[]{"c", "d", "e", "i", "k", "l", "p", new ahud(aika.STRING, (Object) "", aika.UINT32, (Object) 0), "g", "n", albk.a, "f", "m", "o", ajub.class, "h", "j"});
            case 3:
                return new apxv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxv.class);
            default:
                return null;
        }
    }
}
