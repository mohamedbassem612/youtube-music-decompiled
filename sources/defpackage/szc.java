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
/* JADX INFO: loaded from: classes.dex */
public final class szc {
    public static final szc a;
    public static final szc b;
    public static final szc c;
    public static final szc d;
    public static final szc e;
    public static final szc f;
    public static final szc g;
    public static final szc h;
    public static final szc i;
    public static final szc j;
    public static final szc k;
    public static final szc l;
    private static final /* synthetic */ szc[] p;
    public final String m;
    public final sxz n;
    public final sya o;

    static {
        int i2 = 3;
        int i3 = 4;
        szc szcVar = new szc("BATTERY_SAMPLING", 0, "batteryCapturerSamplingCounter", new het(i2), new hes(i3));
        a = szcVar;
        int i4 = 6;
        int i5 = 7;
        szc szcVar2 = new szc("SCROLL_TRACKER_SAMPLING", 1, "scroll_tracker_when_to_sample_counter", new het(i4), new hes(i5));
        b = szcVar2;
        int i6 = 8;
        szc szcVar3 = new szc("ELEMENT_PERF_SAMPLING", 2, "element_performance_metric_sample", new het(i5), new hes(i6));
        c = szcVar3;
        int i7 = 9;
        szc szcVar4 = new szc("STREAMZ_DEFAULT_IMAGE_CLIENT_SAMPLING", 3, "streamz_default_image_client", new het(i7), new hes(i7));
        d = szcVar4;
        int i8 = 10;
        szc szcVar5 = new szc("STREAMZ_SIZED_IMAGE_CLIENT_SAMPLING", 4, "streamz_sized_image_client", new het(i8), new hes(i8));
        e = szcVar5;
        int i9 = 11;
        szc szcVar6 = new szc("STREAMZ_GLIDE_SAMPLING", 5, "streamz_glide_image_manager", new het(i6), new hes(i9));
        f = szcVar6;
        int i10 = 12;
        szc szcVar7 = new szc("NETWORK_BASELINE_SAMPLING", 6, "network_baseline_sampling_key", new het(i9), new hes(i10));
        g = szcVar7;
        int i11 = 13;
        szc szcVar8 = new szc("DATAPUSH_PERF_CLIENT_SAMPLING", 7, "datapush_performance_client_sampling", new het(i10), new hes(i11));
        h = szcVar8;
        int i12 = 14;
        szc szcVar9 = new szc("LOW_MEMORY_SAMPLING", 8, "low_memory_capturer_sample_rate", new het(i11), new hes(i12));
        i = szcVar9;
        szc szcVar10 = new szc("JANK_SAMPLING", 9, "jank_capturer_sampling_key", new het(i12), new hes(i2));
        j = szcVar10;
        int i13 = 5;
        szc szcVar11 = new szc("IMAGE_LOADING_SAMPLING", 10, "image_loading_sampling_key", new het(i3), new hes(i13));
        k = szcVar11;
        szc szcVar12 = new szc("UNIFIED_IMAGE_LOADING_SAMPLING", 11, "unified_image_loading_sampling_key", new het(i13), new hes(i4));
        l = szcVar12;
        p = new szc[]{szcVar, szcVar2, szcVar3, szcVar4, szcVar5, szcVar6, szcVar7, szcVar8, szcVar9, szcVar10, szcVar11, szcVar12};
    }

    private szc(String str, int i2, String str2, sxz sxzVar, sya syaVar) {
        super(str, i2);
        this.m = str2;
        this.n = sxzVar;
        this.o = syaVar;
    }

    public static szc[] values() {
        return (szc[]) p.clone();
    }
}
