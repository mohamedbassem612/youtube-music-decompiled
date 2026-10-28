package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apic extends aihn implements aiis {
    public static final apic a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apic apicVar = new apic();
        a = apicVar;
        aihn.registerDefaultInstance(apic.class, apicVar);
    }

    private apic() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0016\u0001\u0000\u0001\u0016\u0016\u0000\u0000\u0002\u0001<\u0000\u0002м\u0000\u0003м\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"c", "b", apik.class, apih.class, aphz.class, apiq.class, apib.class, apis.class, apir.class, apia.class, apii.class, apij.class, apif.class, apie.class, apid.class, apim.class, apip.class, apig.class, apin.class, apio.class, aphx.class, apit.class, aphy.class, apil.class});
            case 3:
                return new apic();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apic.class);
            default:
                return null;
        }
    }
}
