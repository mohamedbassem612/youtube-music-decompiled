package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efe implements eet {
    public final dma a = new efc();
    public final dlz b = new efd();
    private final dmq c;

    public efe(dmq dmqVar) {
        this.c = dmqVar;
    }

    @Override // defpackage.eet
    public final void A(dzr dzrVar, String str) {
        str.getClass();
        ((Number) apb.f(this.c, false, true, new efa(dzrVar, str, 0))).intValue();
    }

    @Override // defpackage.eet
    public final List B() {
        return (List) apb.f(this.c, true, false, new apm(14));
    }

    @Override // defpackage.eet
    public final List C() {
        return (List) apb.f(this.c, true, false, new awqg() { // from class: eey
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";

            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(this.a);
                try {
                    dpbVarA.g(1, 20L);
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "state");
                    int iM3 = ape.m(dpbVarA, "worker_class_name");
                    int iM4 = ape.m(dpbVarA, "input_merger_class_name");
                    int iM5 = ape.m(dpbVarA, "input");
                    int iM6 = ape.m(dpbVarA, "output");
                    int iM7 = ape.m(dpbVarA, "initial_delay");
                    int iM8 = ape.m(dpbVarA, "interval_duration");
                    int iM9 = ape.m(dpbVarA, "flex_duration");
                    int iM10 = ape.m(dpbVarA, "run_attempt_count");
                    int iM11 = ape.m(dpbVarA, "backoff_policy");
                    int iM12 = ape.m(dpbVarA, "backoff_delay_duration");
                    int iM13 = ape.m(dpbVarA, "last_enqueue_time");
                    int iM14 = ape.m(dpbVarA, "minimum_retention_duration");
                    int iM15 = ape.m(dpbVarA, "schedule_requested_at");
                    int iM16 = ape.m(dpbVarA, "run_in_foreground");
                    int iM17 = ape.m(dpbVarA, "out_of_quota_policy");
                    int iM18 = ape.m(dpbVarA, "period_count");
                    int iM19 = ape.m(dpbVarA, "generation");
                    int iM20 = ape.m(dpbVarA, "next_schedule_time_override");
                    int iM21 = ape.m(dpbVarA, "next_schedule_time_override_generation");
                    int iM22 = ape.m(dpbVarA, "stop_reason");
                    int iM23 = ape.m(dpbVarA, "trace_tag");
                    int iM24 = ape.m(dpbVarA, "backoff_on_system_interruptions");
                    int iM25 = ape.m(dpbVarA, "required_network_type");
                    int iM26 = ape.m(dpbVarA, "required_network_request");
                    int iM27 = ape.m(dpbVarA, "requires_charging");
                    int iM28 = ape.m(dpbVarA, "requires_device_idle");
                    int iM29 = ape.m(dpbVarA, "requires_battery_not_low");
                    int iM30 = ape.m(dpbVarA, "requires_storage_not_low");
                    int iM31 = ape.m(dpbVarA, "trigger_content_update_delay");
                    int iM32 = ape.m(dpbVarA, "trigger_max_content_delay");
                    int iM33 = ape.m(dpbVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        String strD = dpbVarA.d(iM);
                        int i = iM13;
                        int i2 = iM14;
                        dzr dzrVarM = dms.m((int) dpbVarA.b(iM2));
                        String strD2 = dpbVarA.d(iM3);
                        String strD3 = dpbVarA.d(iM4);
                        byte[] bArrM = dpbVarA.m(iM5);
                        dyp dypVar = dyp.a;
                        dyp dypVarG = azx.g(bArrM);
                        dyp dypVarG2 = azx.g(dpbVarA.m(iM6));
                        long jB = dpbVarA.b(iM7);
                        long jB2 = dpbVarA.b(iM8);
                        long jB3 = dpbVarA.b(iM9);
                        int iB = (int) dpbVarA.b(iM10);
                        int i3 = iM;
                        int i4 = iM2;
                        int iW = dms.w((int) dpbVarA.b(iM11));
                        long jB4 = dpbVarA.b(iM12);
                        long jB5 = dpbVarA.b(i);
                        long jB6 = dpbVarA.b(i2);
                        int i5 = iM15;
                        long jB7 = dpbVarA.b(i5);
                        iM15 = i5;
                        int i6 = iM16;
                        int i7 = iM3;
                        boolean z = ((int) dpbVarA.b(i6)) != 0;
                        int i8 = iM17;
                        int i9 = iM4;
                        int iU = dms.u((int) dpbVarA.b(i8));
                        int i10 = iM18;
                        int iB2 = (int) dpbVarA.b(i10);
                        int i11 = iM19;
                        int iB3 = (int) dpbVarA.b(i11);
                        int i12 = iM20;
                        long jB8 = dpbVarA.b(i12);
                        int i13 = iM21;
                        int iB4 = (int) dpbVarA.b(i13);
                        iM21 = i13;
                        iM22 = iM22;
                        int iB5 = (int) dpbVarA.b(iM22);
                        int i14 = iM23;
                        Boolean boolValueOf = null;
                        String strD4 = dpbVarA.k(i14) ? null : dpbVarA.d(i14);
                        int i15 = iM24;
                        Integer numValueOf = dpbVarA.k(i15) ? null : Integer.valueOf((int) dpbVarA.b(i15));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i16 = iM25;
                        int iT = dms.t((int) dpbVarA.b(i16));
                        int i17 = iM26;
                        efo efoVarN = dms.n(dpbVarA.m(i17));
                        int i18 = iM27;
                        boolean z2 = ((int) dpbVarA.b(i18)) != 0;
                        int i19 = iM28;
                        boolean z3 = ((int) dpbVarA.b(i19)) != 0;
                        int i20 = iM29;
                        boolean z4 = ((int) dpbVarA.b(i20)) != 0;
                        iM29 = i20;
                        int i21 = iM30;
                        int i22 = iM31;
                        int i23 = iM32;
                        iM31 = i22;
                        int i24 = iM33;
                        arrayList.add(new ees(strD, dzrVarM, strD2, strD3, dypVarG, dypVarG2, jB, jB2, jB3, new dyn(efoVarN, iT, z2, z3, z4, ((int) dpbVarA.b(i21)) != 0, dpbVarA.b(i22), dpbVarA.b(i23), dms.o(dpbVarA.m(i24))), iB, iW, jB4, jB5, jB6, jB7, z, iU, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                        iM28 = i19;
                        iM4 = i9;
                        iM17 = i8;
                        iM18 = i10;
                        iM19 = i11;
                        iM20 = i12;
                        iM23 = i14;
                        iM24 = i15;
                        iM25 = i16;
                        iM26 = i17;
                        iM27 = i18;
                        iM33 = i24;
                        iM32 = i23;
                        iM30 = i21;
                        iM = i3;
                        iM3 = i7;
                        iM13 = i;
                        iM14 = i2;
                        iM2 = i4;
                        iM16 = i6;
                    }
                    return arrayList;
                } finally {
                    dpbVarA.close();
                }
            }
        });
    }

    @Override // defpackage.eet
    public final int a() {
        return ((Number) apb.f(this.c, true, false, new ank(8, (byte[]) null))).intValue();
    }

    @Override // defpackage.eet
    public final dzr b(String str) {
        str.getClass();
        return (dzr) apb.f(this.c, true, false, new eck(str, 16, (int[][]) null));
    }

    @Override // defpackage.eet
    public final ees c(final String str) {
        str.getClass();
        return (ees) apb.f(this.c, true, false, new awqg() { // from class: eex
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE id=?";

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(this.a);
                try {
                    dpbVarA.i(1, str);
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "state");
                    int iM3 = ape.m(dpbVarA, "worker_class_name");
                    int iM4 = ape.m(dpbVarA, "input_merger_class_name");
                    int iM5 = ape.m(dpbVarA, "input");
                    int iM6 = ape.m(dpbVarA, "output");
                    int iM7 = ape.m(dpbVarA, "initial_delay");
                    int iM8 = ape.m(dpbVarA, "interval_duration");
                    int iM9 = ape.m(dpbVarA, "flex_duration");
                    int iM10 = ape.m(dpbVarA, "run_attempt_count");
                    int iM11 = ape.m(dpbVarA, "backoff_policy");
                    int iM12 = ape.m(dpbVarA, "backoff_delay_duration");
                    int iM13 = ape.m(dpbVarA, "last_enqueue_time");
                    int iM14 = ape.m(dpbVarA, "minimum_retention_duration");
                    int iM15 = ape.m(dpbVarA, "schedule_requested_at");
                    int iM16 = ape.m(dpbVarA, "run_in_foreground");
                    int iM17 = ape.m(dpbVarA, "out_of_quota_policy");
                    int iM18 = ape.m(dpbVarA, "period_count");
                    int iM19 = ape.m(dpbVarA, "generation");
                    int iM20 = ape.m(dpbVarA, "next_schedule_time_override");
                    int iM21 = ape.m(dpbVarA, "next_schedule_time_override_generation");
                    int iM22 = ape.m(dpbVarA, "stop_reason");
                    int iM23 = ape.m(dpbVarA, "trace_tag");
                    int iM24 = ape.m(dpbVarA, "backoff_on_system_interruptions");
                    int iM25 = ape.m(dpbVarA, "required_network_type");
                    int iM26 = ape.m(dpbVarA, "required_network_request");
                    int iM27 = ape.m(dpbVarA, "requires_charging");
                    int iM28 = ape.m(dpbVarA, "requires_device_idle");
                    int iM29 = ape.m(dpbVarA, "requires_battery_not_low");
                    int iM30 = ape.m(dpbVarA, "requires_storage_not_low");
                    int iM31 = ape.m(dpbVarA, "trigger_content_update_delay");
                    int iM32 = ape.m(dpbVarA, "trigger_max_content_delay");
                    int iM33 = ape.m(dpbVarA, "content_uri_triggers");
                    Object eesVar = null;
                    if (dpbVarA.l()) {
                        String strD = dpbVarA.d(iM);
                        dzr dzrVarM = dms.m((int) dpbVarA.b(iM2));
                        String strD2 = dpbVarA.d(iM3);
                        String strD3 = dpbVarA.d(iM4);
                        byte[] bArrM = dpbVarA.m(iM5);
                        dyp dypVar = dyp.a;
                        dyp dypVarG = azx.g(bArrM);
                        dyp dypVarG2 = azx.g(dpbVarA.m(iM6));
                        long jB = dpbVarA.b(iM7);
                        long jB2 = dpbVarA.b(iM8);
                        long jB3 = dpbVarA.b(iM9);
                        int iB = (int) dpbVarA.b(iM10);
                        int iW = dms.w((int) dpbVarA.b(iM11));
                        long jB4 = dpbVarA.b(iM12);
                        long jB5 = dpbVarA.b(iM13);
                        long jB6 = dpbVarA.b(iM14);
                        long jB7 = dpbVarA.b(iM15);
                        boolean z = ((int) dpbVarA.b(iM16)) != 0;
                        int iU = dms.u((int) dpbVarA.b(iM17));
                        int iB2 = (int) dpbVarA.b(iM18);
                        int iB3 = (int) dpbVarA.b(iM19);
                        long jB8 = dpbVarA.b(iM20);
                        int iB4 = (int) dpbVarA.b(iM21);
                        int iB5 = (int) dpbVarA.b(iM22);
                        String strD4 = dpbVarA.k(iM23) ? null : dpbVarA.d(iM23);
                        Integer numValueOf = dpbVarA.k(iM24) ? null : Integer.valueOf((int) dpbVarA.b(iM24));
                        if (numValueOf != null) {
                            eesVar = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        eesVar = new ees(strD, dzrVarM, strD2, strD3, dypVarG, dypVarG2, jB, jB2, jB3, new dyn(dms.n(dpbVarA.m(iM26)), dms.t((int) dpbVarA.b(iM25)), ((int) dpbVarA.b(iM27)) != 0, ((int) dpbVarA.b(iM28)) != 0, ((int) dpbVarA.b(iM29)) != 0, ((int) dpbVarA.b(iM30)) != 0, dpbVarA.b(iM31), dpbVarA.b(iM32), dms.o(dpbVarA.m(iM33))), iB, iW, jB4, jB5, jB6, jB7, z, iU, iB2, iB3, jB8, iB4, iB5, strD4, (Boolean) eesVar);
                    }
                    return eesVar;
                } finally {
                    dpbVarA.close();
                }
            }
        });
    }

    @Override // defpackage.eet
    public final List d() {
        return (List) apb.f(this.c, true, false, new agw(11, (boolean[]) null));
    }

    @Override // defpackage.eet
    public final List e(String str) {
        return (List) apb.f(this.c, true, false, new eck(str, 13, (byte[][]) null));
    }

    @Override // defpackage.eet
    public final List f(final long j) {
        return (List) apb.f(this.c, true, false, new awqg() { // from class: eew
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";

            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(this.a);
                try {
                    dpbVarA.g(1, j);
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "state");
                    int iM3 = ape.m(dpbVarA, "worker_class_name");
                    int iM4 = ape.m(dpbVarA, "input_merger_class_name");
                    int iM5 = ape.m(dpbVarA, "input");
                    int iM6 = ape.m(dpbVarA, "output");
                    int iM7 = ape.m(dpbVarA, "initial_delay");
                    int iM8 = ape.m(dpbVarA, "interval_duration");
                    int iM9 = ape.m(dpbVarA, "flex_duration");
                    int iM10 = ape.m(dpbVarA, "run_attempt_count");
                    int iM11 = ape.m(dpbVarA, "backoff_policy");
                    int iM12 = ape.m(dpbVarA, "backoff_delay_duration");
                    int iM13 = ape.m(dpbVarA, "last_enqueue_time");
                    int iM14 = ape.m(dpbVarA, "minimum_retention_duration");
                    int iM15 = ape.m(dpbVarA, "schedule_requested_at");
                    int iM16 = ape.m(dpbVarA, "run_in_foreground");
                    int iM17 = ape.m(dpbVarA, "out_of_quota_policy");
                    int iM18 = ape.m(dpbVarA, "period_count");
                    int iM19 = ape.m(dpbVarA, "generation");
                    int iM20 = ape.m(dpbVarA, "next_schedule_time_override");
                    int iM21 = ape.m(dpbVarA, "next_schedule_time_override_generation");
                    int iM22 = ape.m(dpbVarA, "stop_reason");
                    int iM23 = ape.m(dpbVarA, "trace_tag");
                    int iM24 = ape.m(dpbVarA, "backoff_on_system_interruptions");
                    int iM25 = ape.m(dpbVarA, "required_network_type");
                    int iM26 = ape.m(dpbVarA, "required_network_request");
                    int iM27 = ape.m(dpbVarA, "requires_charging");
                    int iM28 = ape.m(dpbVarA, "requires_device_idle");
                    int iM29 = ape.m(dpbVarA, "requires_battery_not_low");
                    int iM30 = ape.m(dpbVarA, "requires_storage_not_low");
                    int iM31 = ape.m(dpbVarA, "trigger_content_update_delay");
                    int iM32 = ape.m(dpbVarA, "trigger_max_content_delay");
                    int iM33 = ape.m(dpbVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        String strD = dpbVarA.d(iM);
                        int i = iM13;
                        int i2 = iM14;
                        dzr dzrVarM = dms.m((int) dpbVarA.b(iM2));
                        String strD2 = dpbVarA.d(iM3);
                        String strD3 = dpbVarA.d(iM4);
                        byte[] bArrM = dpbVarA.m(iM5);
                        dyp dypVar = dyp.a;
                        dyp dypVarG = azx.g(bArrM);
                        dyp dypVarG2 = azx.g(dpbVarA.m(iM6));
                        long jB = dpbVarA.b(iM7);
                        long jB2 = dpbVarA.b(iM8);
                        long jB3 = dpbVarA.b(iM9);
                        int iB = (int) dpbVarA.b(iM10);
                        int i3 = iM;
                        int i4 = iM2;
                        int iW = dms.w((int) dpbVarA.b(iM11));
                        long jB4 = dpbVarA.b(iM12);
                        long jB5 = dpbVarA.b(i);
                        long jB6 = dpbVarA.b(i2);
                        int i5 = iM15;
                        long jB7 = dpbVarA.b(i5);
                        iM15 = i5;
                        int i6 = iM16;
                        int i7 = iM3;
                        boolean z = ((int) dpbVarA.b(i6)) != 0;
                        int i8 = iM17;
                        int i9 = iM4;
                        int iU = dms.u((int) dpbVarA.b(i8));
                        int i10 = iM18;
                        int iB2 = (int) dpbVarA.b(i10);
                        int i11 = iM19;
                        int iB3 = (int) dpbVarA.b(i11);
                        int i12 = iM20;
                        long jB8 = dpbVarA.b(i12);
                        int i13 = iM21;
                        int iB4 = (int) dpbVarA.b(i13);
                        iM21 = i13;
                        iM22 = iM22;
                        int iB5 = (int) dpbVarA.b(iM22);
                        int i14 = iM23;
                        Boolean boolValueOf = null;
                        String strD4 = dpbVarA.k(i14) ? null : dpbVarA.d(i14);
                        int i15 = iM24;
                        Integer numValueOf = dpbVarA.k(i15) ? null : Integer.valueOf((int) dpbVarA.b(i15));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i16 = iM25;
                        int iT = dms.t((int) dpbVarA.b(i16));
                        int i17 = iM26;
                        efo efoVarN = dms.n(dpbVarA.m(i17));
                        int i18 = iM27;
                        boolean z2 = ((int) dpbVarA.b(i18)) != 0;
                        int i19 = iM28;
                        boolean z3 = ((int) dpbVarA.b(i19)) != 0;
                        int i20 = iM29;
                        boolean z4 = ((int) dpbVarA.b(i20)) != 0;
                        iM29 = i20;
                        int i21 = iM30;
                        int i22 = iM31;
                        int i23 = iM32;
                        iM31 = i22;
                        int i24 = iM33;
                        arrayList.add(new ees(strD, dzrVarM, strD2, strD3, dypVarG, dypVarG2, jB, jB2, jB3, new dyn(efoVarN, iT, z2, z3, z4, ((int) dpbVarA.b(i21)) != 0, dpbVarA.b(i22), dpbVarA.b(i23), dms.o(dpbVarA.m(i24))), iB, iW, jB4, jB5, jB6, jB7, z, iU, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                        iM28 = i19;
                        iM4 = i9;
                        iM17 = i8;
                        iM18 = i10;
                        iM19 = i11;
                        iM20 = i12;
                        iM23 = i14;
                        iM24 = i15;
                        iM25 = i16;
                        iM26 = i17;
                        iM27 = i18;
                        iM33 = i24;
                        iM32 = i23;
                        iM30 = i21;
                        iM = i3;
                        iM3 = i7;
                        iM13 = i;
                        iM14 = i2;
                        iM2 = i4;
                        iM16 = i6;
                    }
                    return arrayList;
                } finally {
                    dpbVarA.close();
                }
            }
        });
    }

    @Override // defpackage.eet
    public final List g() {
        return (List) apb.f(this.c, true, false, new agw(10, (int[]) null));
    }

    @Override // defpackage.eet
    public final List h() {
        return (List) apb.f(this.c, true, false, new ank(7));
    }

    @Override // defpackage.eet
    public final List i(String str) {
        return (List) apb.f(this.c, true, false, new eck(str, 11, (float[]) null));
    }

    @Override // defpackage.eet
    public final List j(String str) {
        return (List) apb.f(this.c, true, false, new eck(str, 10, (boolean[]) null));
    }

    @Override // defpackage.eet
    public final awzc k() {
        agw agwVar = new agw(8, (char[]) null);
        dmq dmqVar = this.c;
        dmg dmgVarB = dmqVar.b();
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
        strArr.getClass();
        dnl dnlVar = dmgVarB.b;
        awol awolVar = new awol();
        for (String str : strArr) {
            Map map = dnlVar.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                awolVar.addAll(set);
            } else {
                awolVar.add(str);
            }
        }
        String[] strArr2 = (String[]) awolVar.b().toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = dnlVar.d;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        awml awmlVar = new awml(strArr2, iArr);
        String[] strArr3 = (String[]) awmlVar.a;
        int[] iArr2 = (int[]) awmlVar.b;
        strArr3.getClass();
        iArr2.getClass();
        awyv awyvVar = new awyv(new dnd(dnlVar, iArr2, strArr3, null));
        we weVar = dmgVarB.i;
        return new dnp(awqx.u(new awzj(new awzj(new dmd(dmgVarB, null), awyvVar, 0), new dme(dmgVarB, null), 1), -1, 1), dmqVar, agwVar);
    }

    @Override // defpackage.eet
    public final void l(String str) {
        apb.f(this.c, false, true, new eck(str, 9, (int[]) null));
    }

    @Override // defpackage.eet
    public final void m(String str) {
        apb.f(this.c, false, true, new apm(str, 12, (int[]) null));
    }

    @Override // defpackage.eet
    public final void n(ees eesVar) {
        apb.f(this.c, false, true, new eck(this, eesVar, 17));
    }

    @Override // defpackage.eet
    public final void o(String str, int i) {
        apb.f(this.c, false, true, new hii(str, i, 1));
    }

    @Override // defpackage.eet
    public final void p(final String str, final long j) {
        str.getClass();
        apb.f(this.c, false, true, new awqg() { // from class: efb
            public final /* synthetic */ String a = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";

            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(this.a);
                long j2 = j;
                String str2 = str;
                try {
                    dpbVarA.g(1, j2);
                    dpbVarA.i(2, str2);
                    dpbVarA.l();
                    return awmy.a;
                } finally {
                    dpbVarA.close();
                }
            }
        });
    }

    @Override // defpackage.eet
    public final void q(String str, dyp dypVar) {
        apb.f(this.c, false, true, new hgo(dypVar, str, 1));
    }

    @Override // defpackage.eet
    public final void r(String str, int i) {
        apb.f(this.c, false, true, new eeu(i, str, 0));
    }

    @Override // defpackage.eet
    public final void s(ees eesVar) {
        apb.f(this.c, false, true, new eck(this, eesVar, 12));
    }

    @Override // defpackage.eet
    public final boolean t(String str) {
        return ((Boolean) apb.f(this.c, true, false, new apm(str, 13, (boolean[]) null))).booleanValue();
    }

    @Override // defpackage.eet
    public final List u() {
        return (List) apb.f(this.c, true, false, new awqg() { // from class: eev
            public final /* synthetic */ String a = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";

            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(this.a);
                try {
                    dpbVarA.g(1, 200L);
                    int iM = ape.m(dpbVarA, "id");
                    int iM2 = ape.m(dpbVarA, "state");
                    int iM3 = ape.m(dpbVarA, "worker_class_name");
                    int iM4 = ape.m(dpbVarA, "input_merger_class_name");
                    int iM5 = ape.m(dpbVarA, "input");
                    int iM6 = ape.m(dpbVarA, "output");
                    int iM7 = ape.m(dpbVarA, "initial_delay");
                    int iM8 = ape.m(dpbVarA, "interval_duration");
                    int iM9 = ape.m(dpbVarA, "flex_duration");
                    int iM10 = ape.m(dpbVarA, "run_attempt_count");
                    int iM11 = ape.m(dpbVarA, "backoff_policy");
                    int iM12 = ape.m(dpbVarA, "backoff_delay_duration");
                    int iM13 = ape.m(dpbVarA, "last_enqueue_time");
                    int iM14 = ape.m(dpbVarA, "minimum_retention_duration");
                    int iM15 = ape.m(dpbVarA, "schedule_requested_at");
                    int iM16 = ape.m(dpbVarA, "run_in_foreground");
                    int iM17 = ape.m(dpbVarA, "out_of_quota_policy");
                    int iM18 = ape.m(dpbVarA, "period_count");
                    int iM19 = ape.m(dpbVarA, "generation");
                    int iM20 = ape.m(dpbVarA, "next_schedule_time_override");
                    int iM21 = ape.m(dpbVarA, "next_schedule_time_override_generation");
                    int iM22 = ape.m(dpbVarA, "stop_reason");
                    int iM23 = ape.m(dpbVarA, "trace_tag");
                    int iM24 = ape.m(dpbVarA, "backoff_on_system_interruptions");
                    int iM25 = ape.m(dpbVarA, "required_network_type");
                    int iM26 = ape.m(dpbVarA, "required_network_request");
                    int iM27 = ape.m(dpbVarA, "requires_charging");
                    int iM28 = ape.m(dpbVarA, "requires_device_idle");
                    int iM29 = ape.m(dpbVarA, "requires_battery_not_low");
                    int iM30 = ape.m(dpbVarA, "requires_storage_not_low");
                    int iM31 = ape.m(dpbVarA, "trigger_content_update_delay");
                    int iM32 = ape.m(dpbVarA, "trigger_max_content_delay");
                    int iM33 = ape.m(dpbVarA, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        String strD = dpbVarA.d(iM);
                        int i = iM13;
                        int i2 = iM14;
                        dzr dzrVarM = dms.m((int) dpbVarA.b(iM2));
                        String strD2 = dpbVarA.d(iM3);
                        String strD3 = dpbVarA.d(iM4);
                        byte[] bArrM = dpbVarA.m(iM5);
                        dyp dypVar = dyp.a;
                        dyp dypVarG = azx.g(bArrM);
                        dyp dypVarG2 = azx.g(dpbVarA.m(iM6));
                        long jB = dpbVarA.b(iM7);
                        long jB2 = dpbVarA.b(iM8);
                        long jB3 = dpbVarA.b(iM9);
                        int iB = (int) dpbVarA.b(iM10);
                        int i3 = iM;
                        int i4 = iM2;
                        int iW = dms.w((int) dpbVarA.b(iM11));
                        long jB4 = dpbVarA.b(iM12);
                        long jB5 = dpbVarA.b(i);
                        long jB6 = dpbVarA.b(i2);
                        int i5 = iM15;
                        long jB7 = dpbVarA.b(i5);
                        iM15 = i5;
                        int i6 = iM16;
                        int i7 = iM3;
                        boolean z = ((int) dpbVarA.b(i6)) != 0;
                        int i8 = iM17;
                        int i9 = iM4;
                        int iU = dms.u((int) dpbVarA.b(i8));
                        int i10 = iM18;
                        int iB2 = (int) dpbVarA.b(i10);
                        int i11 = iM19;
                        int iB3 = (int) dpbVarA.b(i11);
                        int i12 = iM20;
                        long jB8 = dpbVarA.b(i12);
                        int i13 = iM21;
                        int iB4 = (int) dpbVarA.b(i13);
                        iM21 = i13;
                        iM22 = iM22;
                        int iB5 = (int) dpbVarA.b(iM22);
                        int i14 = iM23;
                        Boolean boolValueOf = null;
                        String strD4 = dpbVarA.k(i14) ? null : dpbVarA.d(i14);
                        int i15 = iM24;
                        Integer numValueOf = dpbVarA.k(i15) ? null : Integer.valueOf((int) dpbVarA.b(i15));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i16 = iM25;
                        int iT = dms.t((int) dpbVarA.b(i16));
                        int i17 = iM26;
                        efo efoVarN = dms.n(dpbVarA.m(i17));
                        int i18 = iM27;
                        boolean z2 = ((int) dpbVarA.b(i18)) != 0;
                        int i19 = iM28;
                        boolean z3 = ((int) dpbVarA.b(i19)) != 0;
                        int i20 = iM29;
                        boolean z4 = ((int) dpbVarA.b(i20)) != 0;
                        iM29 = i20;
                        int i21 = iM30;
                        int i22 = iM31;
                        int i23 = iM32;
                        iM31 = i22;
                        int i24 = iM33;
                        arrayList.add(new ees(strD, dzrVarM, strD2, strD3, dypVarG, dypVarG2, jB, jB2, jB3, new dyn(efoVarN, iT, z2, z3, z4, ((int) dpbVarA.b(i21)) != 0, dpbVarA.b(i22), dpbVarA.b(i23), dms.o(dpbVarA.m(i24))), iB, iW, jB4, jB5, jB6, jB7, z, iU, iB2, iB3, jB8, iB4, iB5, strD4, bool));
                        iM28 = i19;
                        iM4 = i9;
                        iM17 = i8;
                        iM18 = i10;
                        iM19 = i11;
                        iM20 = i12;
                        iM23 = i14;
                        iM24 = i15;
                        iM25 = i16;
                        iM26 = i17;
                        iM27 = i18;
                        iM33 = i24;
                        iM32 = i23;
                        iM30 = i21;
                        iM = i3;
                        iM3 = i7;
                        iM13 = i;
                        iM14 = i2;
                        iM2 = i4;
                        iM16 = i6;
                    }
                    return arrayList;
                } finally {
                    dpbVarA.close();
                }
            }
        });
    }

    @Override // defpackage.eet
    public final void v(String str) {
        ((Number) apb.f(this.c, false, true, new eck(str, 15, (short[][]) null))).intValue();
    }

    @Override // defpackage.eet
    public final void w(final String str, final long j) {
        str.getClass();
        ((Number) apb.f(this.c, false, true, new awqg() { // from class: eez
            public final /* synthetic */ String a = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";

            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(this.a);
                long j2 = j;
                String str2 = str;
                try {
                    dpbVarA.g(1, j2);
                    dpbVarA.i(2, str2);
                    dpbVarA.l();
                    return Integer.valueOf(ape.n(dptVar));
                } finally {
                    dpbVarA.close();
                }
            }
        })).intValue();
    }

    @Override // defpackage.eet
    public final void x() {
        ((Number) apb.f(this.c, false, true, new agw(9, (short[]) null))).intValue();
    }

    @Override // defpackage.eet
    public final void y(String str) {
        ((Number) apb.f(this.c, false, true, new apm(str, 11, (short[]) null))).intValue();
    }

    @Override // defpackage.eet
    public final void z(String str) {
        str.getClass();
        ((Number) apb.f(this.c, false, true, new eck(str, 14, (char[][]) null))).intValue();
    }
}
