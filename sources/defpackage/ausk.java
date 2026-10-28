package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ausk implements ausj {
    private static final qmc a;
    private static final qmc b;
    private static final qmc c;

    static {
        omm ommVar = aurg.c;
        a = ommVar.w("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = ommVar.w("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = ommVar.w("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.ausj
    public final boolean a() {
        return ((Boolean) a.io()).booleanValue();
    }

    @Override // defpackage.ausj
    public final boolean b() {
        return ((Boolean) b.io()).booleanValue();
    }

    @Override // defpackage.ausj
    public final boolean c() {
        return ((Boolean) c.io()).booleanValue();
    }
}
