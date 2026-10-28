package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfk {
    public static final abfk a;
    public static final abfk b;
    public static final abfk c;
    public static final abfk d;
    public static final abfk e;
    public static final abfk f;
    public static final abfk g;
    public static final abfk h;
    public static final abfk i;
    private static final /* synthetic */ abfk[] m;
    public final yxd j;
    public final float k;
    public final float l;

    static {
        yxc yxcVar = new yxc();
        yxcVar.e(abfj.a);
        yxcVar.c(abfj.b);
        yxcVar.f();
        yxcVar.d();
        yxcVar.b(5);
        yxcVar.a = yxf.PASSTHROUGH;
        abfk abfkVar = new abfk("PASSTHROUGH", 0, yxcVar.a(), 1.0f, 1.0f);
        a = abfkVar;
        yxc yxcVar2 = new yxc();
        yxcVar2.e(abfh.a);
        yxcVar2.c(abfh.b);
        yxcVar2.f();
        yxcVar2.d();
        yxcVar2.b(4);
        yxcVar2.a = yxf.RECOMPOSITION;
        abfk abfkVar2 = new abfk("LIFA", 1, yxcVar2.a(), 0.5f, 1.0f);
        b = abfkVar2;
        yxc yxcVar3 = new yxc();
        yxcVar3.e(abff.a);
        yxcVar3.c(abff.b);
        yxcVar3.f();
        yxcVar3.d();
        yxcVar3.b(4);
        yxcVar3.a = yxf.RECOMPOSITION;
        abfk abfkVar3 = new abfk("LIFA_480P", 2, yxcVar3.a(), 0.5f, 1.0f);
        c = abfkVar3;
        yxc yxcVar4 = new yxc();
        yxcVar4.e(abfi.a);
        yxcVar4.c(abfi.b);
        yxcVar4.f();
        yxcVar4.d();
        yxcVar4.b(5);
        yxcVar4.a = yxf.RECOMPOSITION;
        abfk abfkVar4 = new abfk("LIFA_PIP", 3, yxcVar4.a(), 0.5f, 0.5f);
        d = abfkVar4;
        yxc yxcVar5 = new yxc();
        yxcVar5.e(abfg.a);
        yxcVar5.c(abfg.b);
        yxcVar5.f();
        yxcVar5.d();
        yxcVar5.b(5);
        yxcVar5.a = yxf.PASSTHROUGH;
        abfk abfkVar5 = new abfk("LIFA_480P_PIP", 4, yxcVar5.a(), 0.5f, 0.5f);
        e = abfkVar5;
        yxc yxcVar6 = new yxc();
        yxcVar6.e(abfj.a);
        yxcVar6.c(abfj.b);
        yxcVar6.f();
        yxcVar6.d();
        yxcVar6.b(5);
        yxcVar6.a = yxf.BICUBIC_UPSCALING;
        abfk abfkVar6 = new abfk("BICUBIC_UPSCALE", 5, yxcVar6.a(), 1.0f, 1.0f);
        f = abfkVar6;
        yxc yxcVar7 = new yxc();
        yxcVar7.e(abfj.a);
        yxcVar7.c(abfj.b);
        yxcVar7.f();
        yxcVar7.d();
        yxcVar7.b(5);
        yxcVar7.a = yxf.CONVOLUTION;
        abfk abfkVar7 = new abfk("CONVOLUTION", 6, yxcVar7.a(), 1.0f, 1.0f);
        g = abfkVar7;
        yxc yxcVar8 = new yxc();
        yxcVar8.e(abfj.a);
        yxcVar8.c(abfj.b);
        yxcVar8.f();
        yxcVar8.d();
        yxcVar8.b(5);
        yxcVar8.a = yxf.FILM_GRAIN;
        abfk abfkVar8 = new abfk("FILM_GRAIN", 7, yxcVar8.a(), 1.0f, 1.0f);
        h = abfkVar8;
        yxc yxcVar9 = new yxc();
        yxcVar9.e(abfj.a);
        yxcVar9.c(abfj.b);
        yxcVar9.f();
        yxcVar9.d();
        yxcVar9.b(5);
        yxcVar9.a = yxf.INVERT_COLOR;
        abfk abfkVar9 = new abfk("INVERT_COLOR", 8, yxcVar9.a(), 1.0f, 1.0f);
        i = abfkVar9;
        m = new abfk[]{abfkVar, abfkVar2, abfkVar3, abfkVar4, abfkVar5, abfkVar6, abfkVar7, abfkVar8, abfkVar9};
    }

    private abfk(String str, int i2, yxd yxdVar, float f2, float f3) {
        super(str, i2);
        this.j = yxdVar;
        this.k = f2;
        this.l = f3;
    }

    public static abfk[] values() {
        return (abfk[]) m.clone();
    }
}
