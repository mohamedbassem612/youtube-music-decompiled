package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eef implements eed {
    private final dmq a;

    public eef(dmq dmqVar) {
        this.a = dmqVar;
    }

    @Override // defpackage.eed
    public final List a(dpi dpiVar) {
        dmw dmwVar;
        dpc dpcVar = (dpc) dpiVar;
        Object[] objArr = dpcVar.b;
        String str = dpcVar.a;
        int length = objArr != null ? objArr.length : 0;
        TreeMap treeMap = dmw.a;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(length));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                dmwVar = (dmw) entryCeilingEntry.getValue();
                dmwVar.f(str, length);
                dmwVar.getClass();
            } else {
                dmwVar = new dmw(length);
                dmwVar.f(str, length);
            }
        }
        azu.h(new dmv(dmwVar), dpcVar.b);
        String str2 = dmwVar.b;
        if (str2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        final pj pjVar = new pj(str2, new agw(dmwVar, 4));
        final String str3 = (String) pjVar.a;
        return (List) apb.f(this.a, true, false, new awqg() { // from class: eee
            /* JADX WARN: Code duplicated, block: B:100:0x026e A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x0013, B:4:0x00cc, B:6:0x00d2, B:8:0x00de, B:10:0x00eb, B:12:0x00f5, B:14:0x0102, B:15:0x0114, B:19:0x011d, B:21:0x0123, B:23:0x012e, B:38:0x0161, B:64:0x01d8, B:66:0x01e0, B:68:0x01f1, B:102:0x0277, B:103:0x02d7, B:104:0x02de, B:100:0x026e, B:96:0x0260, B:90:0x024c, B:84:0x0236, B:78:0x021f, B:72:0x0206, B:105:0x02df, B:106:0x02e6, B:107:0x02e7, B:108:0x02ee, B:109:0x02ef, B:110:0x02f6, B:62:0x01ca, B:58:0x01ba, B:54:0x01a8, B:50:0x0192, B:46:0x0182, B:42:0x0174, B:111:0x02f7, B:112:0x02fe, B:36:0x015a, B:32:0x014f, B:29:0x0146, B:26:0x013d, B:113:0x02ff, B:114:0x0306, B:115:0x0307, B:116:0x030e, B:117:0x030f, B:118:0x0316), top: B:124:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:102:0x0277 A[Catch: all -> 0x031b, LOOP:1: B:15:0x0114->B:102:0x0277, LOOP_END, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x0013, B:4:0x00cc, B:6:0x00d2, B:8:0x00de, B:10:0x00eb, B:12:0x00f5, B:14:0x0102, B:15:0x0114, B:19:0x011d, B:21:0x0123, B:23:0x012e, B:38:0x0161, B:64:0x01d8, B:66:0x01e0, B:68:0x01f1, B:102:0x0277, B:103:0x02d7, B:104:0x02de, B:100:0x026e, B:96:0x0260, B:90:0x024c, B:84:0x0236, B:78:0x021f, B:72:0x0206, B:105:0x02df, B:106:0x02e6, B:107:0x02e7, B:108:0x02ee, B:109:0x02ef, B:110:0x02f6, B:62:0x01ca, B:58:0x01ba, B:54:0x01a8, B:50:0x0192, B:46:0x0182, B:42:0x0174, B:111:0x02f7, B:112:0x02fe, B:36:0x015a, B:32:0x014f, B:29:0x0146, B:26:0x013d, B:113:0x02ff, B:114:0x0306, B:115:0x0307, B:116:0x030e, B:117:0x030f, B:118:0x0316), top: B:124:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:136:0x02d7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:76:0x0217  */
            /* JADX WARN: Code duplicated, block: B:78:0x021f A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x0013, B:4:0x00cc, B:6:0x00d2, B:8:0x00de, B:10:0x00eb, B:12:0x00f5, B:14:0x0102, B:15:0x0114, B:19:0x011d, B:21:0x0123, B:23:0x012e, B:38:0x0161, B:64:0x01d8, B:66:0x01e0, B:68:0x01f1, B:102:0x0277, B:103:0x02d7, B:104:0x02de, B:100:0x026e, B:96:0x0260, B:90:0x024c, B:84:0x0236, B:78:0x021f, B:72:0x0206, B:105:0x02df, B:106:0x02e6, B:107:0x02e7, B:108:0x02ee, B:109:0x02ef, B:110:0x02f6, B:62:0x01ca, B:58:0x01ba, B:54:0x01a8, B:50:0x0192, B:46:0x0182, B:42:0x0174, B:111:0x02f7, B:112:0x02fe, B:36:0x015a, B:32:0x014f, B:29:0x0146, B:26:0x013d, B:113:0x02ff, B:114:0x0306, B:115:0x0307, B:116:0x030e, B:117:0x030f, B:118:0x0316), top: B:124:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:80:0x0229  */
            /* JADX WARN: Code duplicated, block: B:82:0x022f  */
            /* JADX WARN: Code duplicated, block: B:84:0x0236 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x0013, B:4:0x00cc, B:6:0x00d2, B:8:0x00de, B:10:0x00eb, B:12:0x00f5, B:14:0x0102, B:15:0x0114, B:19:0x011d, B:21:0x0123, B:23:0x012e, B:38:0x0161, B:64:0x01d8, B:66:0x01e0, B:68:0x01f1, B:102:0x0277, B:103:0x02d7, B:104:0x02de, B:100:0x026e, B:96:0x0260, B:90:0x024c, B:84:0x0236, B:78:0x021f, B:72:0x0206, B:105:0x02df, B:106:0x02e6, B:107:0x02e7, B:108:0x02ee, B:109:0x02ef, B:110:0x02f6, B:62:0x01ca, B:58:0x01ba, B:54:0x01a8, B:50:0x0192, B:46:0x0182, B:42:0x0174, B:111:0x02f7, B:112:0x02fe, B:36:0x015a, B:32:0x014f, B:29:0x0146, B:26:0x013d, B:113:0x02ff, B:114:0x0306, B:115:0x0307, B:116:0x030e, B:117:0x030f, B:118:0x0316), top: B:124:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:86:0x023f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0245  */
            /* JADX WARN: Code duplicated, block: B:90:0x024c A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x0013, B:4:0x00cc, B:6:0x00d2, B:8:0x00de, B:10:0x00eb, B:12:0x00f5, B:14:0x0102, B:15:0x0114, B:19:0x011d, B:21:0x0123, B:23:0x012e, B:38:0x0161, B:64:0x01d8, B:66:0x01e0, B:68:0x01f1, B:102:0x0277, B:103:0x02d7, B:104:0x02de, B:100:0x026e, B:96:0x0260, B:90:0x024c, B:84:0x0236, B:78:0x021f, B:72:0x0206, B:105:0x02df, B:106:0x02e6, B:107:0x02e7, B:108:0x02ee, B:109:0x02ef, B:110:0x02f6, B:62:0x01ca, B:58:0x01ba, B:54:0x01a8, B:50:0x0192, B:46:0x0182, B:42:0x0174, B:111:0x02f7, B:112:0x02fe, B:36:0x015a, B:32:0x014f, B:29:0x0146, B:26:0x013d, B:113:0x02ff, B:114:0x0306, B:115:0x0307, B:116:0x030e, B:117:0x030f, B:118:0x0316), top: B:124:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:92:0x0255  */
            /* JADX WARN: Code duplicated, block: B:94:0x025b  */
            /* JADX WARN: Code duplicated, block: B:96:0x0260 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x0013, B:4:0x00cc, B:6:0x00d2, B:8:0x00de, B:10:0x00eb, B:12:0x00f5, B:14:0x0102, B:15:0x0114, B:19:0x011d, B:21:0x0123, B:23:0x012e, B:38:0x0161, B:64:0x01d8, B:66:0x01e0, B:68:0x01f1, B:102:0x0277, B:103:0x02d7, B:104:0x02de, B:100:0x026e, B:96:0x0260, B:90:0x024c, B:84:0x0236, B:78:0x021f, B:72:0x0206, B:105:0x02df, B:106:0x02e6, B:107:0x02e7, B:108:0x02ee, B:109:0x02ef, B:110:0x02f6, B:62:0x01ca, B:58:0x01ba, B:54:0x01a8, B:50:0x0192, B:46:0x0182, B:42:0x0174, B:111:0x02f7, B:112:0x02fe, B:36:0x015a, B:32:0x014f, B:29:0x0146, B:26:0x013d, B:113:0x02ff, B:114:0x0306, B:115:0x0307, B:116:0x030e, B:117:0x030f, B:118:0x0316), top: B:124:0x0013 }] */
            /* JADX WARN: Code duplicated, block: B:98:0x0267  */
            /* JADX WARN: Type inference failed for: r3v1, types: [awqg, java.lang.Object] */
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                int i;
                int i2;
                boolean z;
                int i3;
                int i4;
                boolean z2;
                int i5;
                boolean z3;
                int i6;
                boolean z4;
                long jB;
                int i7;
                long jB2;
                int i8;
                int i9;
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a(str3);
                pj pjVar2 = pjVar;
                eef eefVar = this;
                try {
                    pjVar2.b.invoke(dpbVarA);
                    int iK = ape.k(dpbVarA, "id");
                    int iK2 = ape.k(dpbVarA, "state");
                    int iK3 = ape.k(dpbVarA, "output");
                    int iK4 = ape.k(dpbVarA, "initial_delay");
                    int iK5 = ape.k(dpbVarA, "interval_duration");
                    int iK6 = ape.k(dpbVarA, "flex_duration");
                    int iK7 = ape.k(dpbVarA, "run_attempt_count");
                    int iK8 = ape.k(dpbVarA, "backoff_policy");
                    int iK9 = ape.k(dpbVarA, "backoff_delay_duration");
                    int iK10 = ape.k(dpbVarA, "last_enqueue_time");
                    int iK11 = ape.k(dpbVarA, "period_count");
                    int iK12 = ape.k(dpbVarA, "generation");
                    int iK13 = ape.k(dpbVarA, "next_schedule_time_override");
                    int iK14 = ape.k(dpbVarA, "stop_reason");
                    int iK15 = ape.k(dpbVarA, "worker_class_name");
                    int iK16 = ape.k(dpbVarA, "required_network_type");
                    int iK17 = ape.k(dpbVarA, "required_network_request");
                    int iK18 = ape.k(dpbVarA, "requires_charging");
                    int iK19 = ape.k(dpbVarA, "requires_device_idle");
                    int iK20 = ape.k(dpbVarA, "requires_battery_not_low");
                    int iK21 = ape.k(dpbVarA, "requires_storage_not_low");
                    int iK22 = ape.k(dpbVarA, "trigger_content_update_delay");
                    int iK23 = ape.k(dpbVarA, "trigger_max_content_delay");
                    int iK24 = ape.k(dpbVarA, "content_uri_triggers");
                    afv afvVar = new afv();
                    int i10 = iK12;
                    afv afvVar2 = new afv();
                    while (dpbVarA.l()) {
                        int i11 = iK11;
                        String strD = dpbVarA.d(iK);
                        if (!afvVar.containsKey(strD)) {
                            afvVar.put(strD, new ArrayList());
                        }
                        String strD2 = dpbVarA.d(iK);
                        if (!afvVar2.containsKey(strD2)) {
                            afvVar2.put(strD2, new ArrayList());
                        }
                        iK11 = i11;
                        iK10 = iK10;
                    }
                    int i12 = iK10;
                    int i13 = iK11;
                    dpbVarA.j();
                    eefVar.c(dptVar, afvVar);
                    eefVar.b(dptVar, afvVar2);
                    ArrayList arrayList = new ArrayList();
                    while (dpbVarA.l()) {
                        if (iK == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String strD3 = dpbVarA.d(iK);
                        if (iK2 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        dzr dzrVarM = dms.m((int) dpbVarA.b(iK2));
                        if (iK3 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        byte[] bArrM = dpbVarA.m(iK3);
                        dyp dypVar = dyp.a;
                        dyp dypVarG = azx.g(bArrM);
                        long jB3 = iK4 == -1 ? 0L : dpbVarA.b(iK4);
                        long jB4 = iK5 == -1 ? 0L : dpbVarA.b(iK5);
                        long jB5 = iK6 == -1 ? 0L : dpbVarA.b(iK6);
                        int iB = iK7 == -1 ? 0 : (int) dpbVarA.b(iK7);
                        if (iK8 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        int i14 = iK2;
                        int i15 = iK3;
                        int iW = dms.w((int) dpbVarA.b(iK8));
                        long jB6 = iK9 == -1 ? 0L : dpbVarA.b(iK9);
                        int i16 = i12;
                        long jB7 = i16 == -1 ? 0L : dpbVarA.b(i16);
                        int i17 = i13;
                        int iB2 = i17 == -1 ? 0 : (int) dpbVarA.b(i17);
                        int i18 = i10;
                        int iB3 = i18 == -1 ? 0 : (int) dpbVarA.b(i18);
                        int i19 = iK13;
                        long jB8 = i19 == -1 ? 0L : dpbVarA.b(i19);
                        int i20 = iK14;
                        int iB4 = i20 == -1 ? 0 : (int) dpbVarA.b(i20);
                        int i21 = iK15;
                        if (i21 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                        }
                        String strD4 = dpbVarA.d(i21);
                        int i22 = iK16;
                        if (i22 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        int iT = dms.t((int) dpbVarA.b(i22));
                        int i23 = iK17;
                        if (i23 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        efo efoVarN = dms.n(dpbVarA.m(i23));
                        int i24 = iK18;
                        if (i24 == -1) {
                            i = i21;
                            i2 = i22;
                        } else {
                            i = i21;
                            i2 = i22;
                            if (((int) dpbVarA.b(i24)) != 0) {
                                z = true;
                            }
                            if (iK19 == -1) {
                                i3 = i23;
                                i4 = i24;
                            } else {
                                i3 = i23;
                                i4 = i24;
                                if (((int) dpbVarA.b(iK19)) != 0) {
                                    z2 = true;
                                }
                                if (iK20 == -1) {
                                    i5 = iK19;
                                } else {
                                    i5 = iK19;
                                    if (((int) dpbVarA.b(iK20)) != 0) {
                                        z3 = true;
                                    }
                                    if (iK21 == -1) {
                                        i6 = i3;
                                    } else {
                                        i6 = i3;
                                        if (((int) dpbVarA.b(iK21)) != 0) {
                                            z4 = true;
                                        }
                                        if (iK22 == -1) {
                                            jB = 0;
                                        } else {
                                            jB = dpbVarA.b(iK22);
                                        }
                                        i7 = iK23;
                                        if (i7 == -1) {
                                            jB2 = 0;
                                        } else {
                                            jB2 = dpbVarA.b(i7);
                                        }
                                        i8 = iK20;
                                        i9 = iK24;
                                        if (i9 != -1) {
                                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                        }
                                        dyn dynVar = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                        Object objT = atqq.t(afvVar, dpbVarA.d(iK));
                                        objT.getClass();
                                        List list = (List) objT;
                                        Object objT2 = atqq.t(afvVar2, dpbVarA.d(iK));
                                        objT2.getClass();
                                        arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list, strD4, (List) objT2));
                                        iK24 = i9;
                                        iK22 = iK22;
                                        iK23 = i7;
                                        iK2 = i14;
                                        iK4 = iK4;
                                        iK5 = iK5;
                                        i12 = i16;
                                        iK14 = i20;
                                        i13 = i17;
                                        iK16 = i2;
                                        i10 = i18;
                                        iK13 = i19;
                                        iK15 = i;
                                        iK18 = i4;
                                        iK19 = i5;
                                        iK20 = i8;
                                        iK17 = i6;
                                        iK21 = iK21;
                                        iK3 = i15;
                                    }
                                    z4 = false;
                                    if (iK22 == -1) {
                                        jB = 0;
                                    } else {
                                        jB = dpbVarA.b(iK22);
                                    }
                                    i7 = iK23;
                                    if (i7 == -1) {
                                        jB2 = 0;
                                    } else {
                                        jB2 = dpbVarA.b(i7);
                                    }
                                    i8 = iK20;
                                    i9 = iK24;
                                    if (i9 != -1) {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                    }
                                    dyn dynVar2 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                    Object objT3 = atqq.t(afvVar, dpbVarA.d(iK));
                                    objT3.getClass();
                                    List list2 = (List) objT3;
                                    Object objT4 = atqq.t(afvVar2, dpbVarA.d(iK));
                                    objT4.getClass();
                                    arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar2, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list2, strD4, (List) objT4));
                                    iK24 = i9;
                                    iK22 = iK22;
                                    iK23 = i7;
                                    iK2 = i14;
                                    iK4 = iK4;
                                    iK5 = iK5;
                                    i12 = i16;
                                    iK14 = i20;
                                    i13 = i17;
                                    iK16 = i2;
                                    i10 = i18;
                                    iK13 = i19;
                                    iK15 = i;
                                    iK18 = i4;
                                    iK19 = i5;
                                    iK20 = i8;
                                    iK17 = i6;
                                    iK21 = iK21;
                                    iK3 = i15;
                                }
                                z3 = false;
                                if (iK21 == -1) {
                                    i6 = i3;
                                } else {
                                    i6 = i3;
                                    if (((int) dpbVarA.b(iK21)) != 0) {
                                        z4 = true;
                                    }
                                    if (iK22 == -1) {
                                        jB = 0;
                                    } else {
                                        jB = dpbVarA.b(iK22);
                                    }
                                    i7 = iK23;
                                    if (i7 == -1) {
                                        jB2 = 0;
                                    } else {
                                        jB2 = dpbVarA.b(i7);
                                    }
                                    i8 = iK20;
                                    i9 = iK24;
                                    if (i9 != -1) {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                    }
                                    dyn dynVar3 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                    Object objT5 = atqq.t(afvVar, dpbVarA.d(iK));
                                    objT5.getClass();
                                    List list3 = (List) objT5;
                                    Object objT6 = atqq.t(afvVar2, dpbVarA.d(iK));
                                    objT6.getClass();
                                    arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar3, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list3, strD4, (List) objT6));
                                    iK24 = i9;
                                    iK22 = iK22;
                                    iK23 = i7;
                                    iK2 = i14;
                                    iK4 = iK4;
                                    iK5 = iK5;
                                    i12 = i16;
                                    iK14 = i20;
                                    i13 = i17;
                                    iK16 = i2;
                                    i10 = i18;
                                    iK13 = i19;
                                    iK15 = i;
                                    iK18 = i4;
                                    iK19 = i5;
                                    iK20 = i8;
                                    iK17 = i6;
                                    iK21 = iK21;
                                    iK3 = i15;
                                }
                                z4 = false;
                                if (iK22 == -1) {
                                    jB = 0;
                                } else {
                                    jB = dpbVarA.b(iK22);
                                }
                                i7 = iK23;
                                if (i7 == -1) {
                                    jB2 = 0;
                                } else {
                                    jB2 = dpbVarA.b(i7);
                                }
                                i8 = iK20;
                                i9 = iK24;
                                if (i9 != -1) {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                dyn dynVar4 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                Object objT7 = atqq.t(afvVar, dpbVarA.d(iK));
                                objT7.getClass();
                                List list4 = (List) objT7;
                                Object objT8 = atqq.t(afvVar2, dpbVarA.d(iK));
                                objT8.getClass();
                                arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar4, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list4, strD4, (List) objT8));
                                iK24 = i9;
                                iK22 = iK22;
                                iK23 = i7;
                                iK2 = i14;
                                iK4 = iK4;
                                iK5 = iK5;
                                i12 = i16;
                                iK14 = i20;
                                i13 = i17;
                                iK16 = i2;
                                i10 = i18;
                                iK13 = i19;
                                iK15 = i;
                                iK18 = i4;
                                iK19 = i5;
                                iK20 = i8;
                                iK17 = i6;
                                iK21 = iK21;
                                iK3 = i15;
                            }
                            z2 = false;
                            if (iK20 == -1) {
                                i5 = iK19;
                            } else {
                                i5 = iK19;
                                if (((int) dpbVarA.b(iK20)) != 0) {
                                    z3 = true;
                                }
                                if (iK21 == -1) {
                                    i6 = i3;
                                } else {
                                    i6 = i3;
                                    if (((int) dpbVarA.b(iK21)) != 0) {
                                        z4 = true;
                                    }
                                    if (iK22 == -1) {
                                        jB = 0;
                                    } else {
                                        jB = dpbVarA.b(iK22);
                                    }
                                    i7 = iK23;
                                    if (i7 == -1) {
                                        jB2 = 0;
                                    } else {
                                        jB2 = dpbVarA.b(i7);
                                    }
                                    i8 = iK20;
                                    i9 = iK24;
                                    if (i9 != -1) {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                    }
                                    dyn dynVar5 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                    Object objT9 = atqq.t(afvVar, dpbVarA.d(iK));
                                    objT9.getClass();
                                    List list5 = (List) objT9;
                                    Object objT10 = atqq.t(afvVar2, dpbVarA.d(iK));
                                    objT10.getClass();
                                    arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar5, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list5, strD4, (List) objT10));
                                    iK24 = i9;
                                    iK22 = iK22;
                                    iK23 = i7;
                                    iK2 = i14;
                                    iK4 = iK4;
                                    iK5 = iK5;
                                    i12 = i16;
                                    iK14 = i20;
                                    i13 = i17;
                                    iK16 = i2;
                                    i10 = i18;
                                    iK13 = i19;
                                    iK15 = i;
                                    iK18 = i4;
                                    iK19 = i5;
                                    iK20 = i8;
                                    iK17 = i6;
                                    iK21 = iK21;
                                    iK3 = i15;
                                }
                                z4 = false;
                                if (iK22 == -1) {
                                    jB = 0;
                                } else {
                                    jB = dpbVarA.b(iK22);
                                }
                                i7 = iK23;
                                if (i7 == -1) {
                                    jB2 = 0;
                                } else {
                                    jB2 = dpbVarA.b(i7);
                                }
                                i8 = iK20;
                                i9 = iK24;
                                if (i9 != -1) {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                dyn dynVar6 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                Object objT11 = atqq.t(afvVar, dpbVarA.d(iK));
                                objT11.getClass();
                                List list6 = (List) objT11;
                                Object objT12 = atqq.t(afvVar2, dpbVarA.d(iK));
                                objT12.getClass();
                                arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar6, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list6, strD4, (List) objT12));
                                iK24 = i9;
                                iK22 = iK22;
                                iK23 = i7;
                                iK2 = i14;
                                iK4 = iK4;
                                iK5 = iK5;
                                i12 = i16;
                                iK14 = i20;
                                i13 = i17;
                                iK16 = i2;
                                i10 = i18;
                                iK13 = i19;
                                iK15 = i;
                                iK18 = i4;
                                iK19 = i5;
                                iK20 = i8;
                                iK17 = i6;
                                iK21 = iK21;
                                iK3 = i15;
                            }
                            z3 = false;
                            if (iK21 == -1) {
                                i6 = i3;
                            } else {
                                i6 = i3;
                                if (((int) dpbVarA.b(iK21)) != 0) {
                                    z4 = true;
                                }
                                if (iK22 == -1) {
                                    jB = 0;
                                } else {
                                    jB = dpbVarA.b(iK22);
                                }
                                i7 = iK23;
                                if (i7 == -1) {
                                    jB2 = 0;
                                } else {
                                    jB2 = dpbVarA.b(i7);
                                }
                                i8 = iK20;
                                i9 = iK24;
                                if (i9 != -1) {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                dyn dynVar7 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                Object objT13 = atqq.t(afvVar, dpbVarA.d(iK));
                                objT13.getClass();
                                List list7 = (List) objT13;
                                Object objT14 = atqq.t(afvVar2, dpbVarA.d(iK));
                                objT14.getClass();
                                arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar7, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list7, strD4, (List) objT14));
                                iK24 = i9;
                                iK22 = iK22;
                                iK23 = i7;
                                iK2 = i14;
                                iK4 = iK4;
                                iK5 = iK5;
                                i12 = i16;
                                iK14 = i20;
                                i13 = i17;
                                iK16 = i2;
                                i10 = i18;
                                iK13 = i19;
                                iK15 = i;
                                iK18 = i4;
                                iK19 = i5;
                                iK20 = i8;
                                iK17 = i6;
                                iK21 = iK21;
                                iK3 = i15;
                            }
                            z4 = false;
                            if (iK22 == -1) {
                                jB = 0;
                            } else {
                                jB = dpbVarA.b(iK22);
                            }
                            i7 = iK23;
                            if (i7 == -1) {
                                jB2 = 0;
                            } else {
                                jB2 = dpbVarA.b(i7);
                            }
                            i8 = iK20;
                            i9 = iK24;
                            if (i9 != -1) {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                            }
                            dyn dynVar8 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                            Object objT15 = atqq.t(afvVar, dpbVarA.d(iK));
                            objT15.getClass();
                            List list8 = (List) objT15;
                            Object objT16 = atqq.t(afvVar2, dpbVarA.d(iK));
                            objT16.getClass();
                            arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar8, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list8, strD4, (List) objT16));
                            iK24 = i9;
                            iK22 = iK22;
                            iK23 = i7;
                            iK2 = i14;
                            iK4 = iK4;
                            iK5 = iK5;
                            i12 = i16;
                            iK14 = i20;
                            i13 = i17;
                            iK16 = i2;
                            i10 = i18;
                            iK13 = i19;
                            iK15 = i;
                            iK18 = i4;
                            iK19 = i5;
                            iK20 = i8;
                            iK17 = i6;
                            iK21 = iK21;
                            iK3 = i15;
                        }
                        z = false;
                        if (iK19 == -1) {
                            i3 = i23;
                            i4 = i24;
                        } else {
                            i3 = i23;
                            i4 = i24;
                            if (((int) dpbVarA.b(iK19)) != 0) {
                                z2 = true;
                            }
                            if (iK20 == -1) {
                                i5 = iK19;
                            } else {
                                i5 = iK19;
                                if (((int) dpbVarA.b(iK20)) != 0) {
                                    z3 = true;
                                }
                                if (iK21 == -1) {
                                    i6 = i3;
                                } else {
                                    i6 = i3;
                                    if (((int) dpbVarA.b(iK21)) != 0) {
                                        z4 = true;
                                    }
                                    if (iK22 == -1) {
                                        jB = 0;
                                    } else {
                                        jB = dpbVarA.b(iK22);
                                    }
                                    i7 = iK23;
                                    if (i7 == -1) {
                                        jB2 = 0;
                                    } else {
                                        jB2 = dpbVarA.b(i7);
                                    }
                                    i8 = iK20;
                                    i9 = iK24;
                                    if (i9 != -1) {
                                        throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                    }
                                    dyn dynVar9 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                    Object objT17 = atqq.t(afvVar, dpbVarA.d(iK));
                                    objT17.getClass();
                                    List list9 = (List) objT17;
                                    Object objT18 = atqq.t(afvVar2, dpbVarA.d(iK));
                                    objT18.getClass();
                                    arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar9, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list9, strD4, (List) objT18));
                                    iK24 = i9;
                                    iK22 = iK22;
                                    iK23 = i7;
                                    iK2 = i14;
                                    iK4 = iK4;
                                    iK5 = iK5;
                                    i12 = i16;
                                    iK14 = i20;
                                    i13 = i17;
                                    iK16 = i2;
                                    i10 = i18;
                                    iK13 = i19;
                                    iK15 = i;
                                    iK18 = i4;
                                    iK19 = i5;
                                    iK20 = i8;
                                    iK17 = i6;
                                    iK21 = iK21;
                                    iK3 = i15;
                                }
                                z4 = false;
                                if (iK22 == -1) {
                                    jB = 0;
                                } else {
                                    jB = dpbVarA.b(iK22);
                                }
                                i7 = iK23;
                                if (i7 == -1) {
                                    jB2 = 0;
                                } else {
                                    jB2 = dpbVarA.b(i7);
                                }
                                i8 = iK20;
                                i9 = iK24;
                                if (i9 != -1) {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                dyn dynVar10 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                Object objT19 = atqq.t(afvVar, dpbVarA.d(iK));
                                objT19.getClass();
                                List list10 = (List) objT19;
                                Object objT110 = atqq.t(afvVar2, dpbVarA.d(iK));
                                objT110.getClass();
                                arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar10, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list10, strD4, (List) objT110));
                                iK24 = i9;
                                iK22 = iK22;
                                iK23 = i7;
                                iK2 = i14;
                                iK4 = iK4;
                                iK5 = iK5;
                                i12 = i16;
                                iK14 = i20;
                                i13 = i17;
                                iK16 = i2;
                                i10 = i18;
                                iK13 = i19;
                                iK15 = i;
                                iK18 = i4;
                                iK19 = i5;
                                iK20 = i8;
                                iK17 = i6;
                                iK21 = iK21;
                                iK3 = i15;
                            }
                            z3 = false;
                            if (iK21 == -1) {
                                i6 = i3;
                            } else {
                                i6 = i3;
                                if (((int) dpbVarA.b(iK21)) != 0) {
                                    z4 = true;
                                }
                                if (iK22 == -1) {
                                    jB = 0;
                                } else {
                                    jB = dpbVarA.b(iK22);
                                }
                                i7 = iK23;
                                if (i7 == -1) {
                                    jB2 = 0;
                                } else {
                                    jB2 = dpbVarA.b(i7);
                                }
                                i8 = iK20;
                                i9 = iK24;
                                if (i9 != -1) {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                dyn dynVar11 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                Object objT111 = atqq.t(afvVar, dpbVarA.d(iK));
                                objT111.getClass();
                                List list11 = (List) objT111;
                                Object objT112 = atqq.t(afvVar2, dpbVarA.d(iK));
                                objT112.getClass();
                                arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar11, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list11, strD4, (List) objT112));
                                iK24 = i9;
                                iK22 = iK22;
                                iK23 = i7;
                                iK2 = i14;
                                iK4 = iK4;
                                iK5 = iK5;
                                i12 = i16;
                                iK14 = i20;
                                i13 = i17;
                                iK16 = i2;
                                i10 = i18;
                                iK13 = i19;
                                iK15 = i;
                                iK18 = i4;
                                iK19 = i5;
                                iK20 = i8;
                                iK17 = i6;
                                iK21 = iK21;
                                iK3 = i15;
                            }
                            z4 = false;
                            if (iK22 == -1) {
                                jB = 0;
                            } else {
                                jB = dpbVarA.b(iK22);
                            }
                            i7 = iK23;
                            if (i7 == -1) {
                                jB2 = 0;
                            } else {
                                jB2 = dpbVarA.b(i7);
                            }
                            i8 = iK20;
                            i9 = iK24;
                            if (i9 != -1) {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                            }
                            dyn dynVar12 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                            Object objT113 = atqq.t(afvVar, dpbVarA.d(iK));
                            objT113.getClass();
                            List list12 = (List) objT113;
                            Object objT114 = atqq.t(afvVar2, dpbVarA.d(iK));
                            objT114.getClass();
                            arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar12, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list12, strD4, (List) objT114));
                            iK24 = i9;
                            iK22 = iK22;
                            iK23 = i7;
                            iK2 = i14;
                            iK4 = iK4;
                            iK5 = iK5;
                            i12 = i16;
                            iK14 = i20;
                            i13 = i17;
                            iK16 = i2;
                            i10 = i18;
                            iK13 = i19;
                            iK15 = i;
                            iK18 = i4;
                            iK19 = i5;
                            iK20 = i8;
                            iK17 = i6;
                            iK21 = iK21;
                            iK3 = i15;
                        }
                        z2 = false;
                        if (iK20 == -1) {
                            i5 = iK19;
                        } else {
                            i5 = iK19;
                            if (((int) dpbVarA.b(iK20)) != 0) {
                                z3 = true;
                            }
                            if (iK21 == -1) {
                                i6 = i3;
                            } else {
                                i6 = i3;
                                if (((int) dpbVarA.b(iK21)) != 0) {
                                    z4 = true;
                                }
                                if (iK22 == -1) {
                                    jB = 0;
                                } else {
                                    jB = dpbVarA.b(iK22);
                                }
                                i7 = iK23;
                                if (i7 == -1) {
                                    jB2 = 0;
                                } else {
                                    jB2 = dpbVarA.b(i7);
                                }
                                i8 = iK20;
                                i9 = iK24;
                                if (i9 != -1) {
                                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                dyn dynVar13 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                                Object objT115 = atqq.t(afvVar, dpbVarA.d(iK));
                                objT115.getClass();
                                List list13 = (List) objT115;
                                Object objT116 = atqq.t(afvVar2, dpbVarA.d(iK));
                                objT116.getClass();
                                arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar13, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list13, strD4, (List) objT116));
                                iK24 = i9;
                                iK22 = iK22;
                                iK23 = i7;
                                iK2 = i14;
                                iK4 = iK4;
                                iK5 = iK5;
                                i12 = i16;
                                iK14 = i20;
                                i13 = i17;
                                iK16 = i2;
                                i10 = i18;
                                iK13 = i19;
                                iK15 = i;
                                iK18 = i4;
                                iK19 = i5;
                                iK20 = i8;
                                iK17 = i6;
                                iK21 = iK21;
                                iK3 = i15;
                            }
                            z4 = false;
                            if (iK22 == -1) {
                                jB = 0;
                            } else {
                                jB = dpbVarA.b(iK22);
                            }
                            i7 = iK23;
                            if (i7 == -1) {
                                jB2 = 0;
                            } else {
                                jB2 = dpbVarA.b(i7);
                            }
                            i8 = iK20;
                            i9 = iK24;
                            if (i9 != -1) {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                            }
                            dyn dynVar14 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                            Object objT117 = atqq.t(afvVar, dpbVarA.d(iK));
                            objT117.getClass();
                            List list14 = (List) objT117;
                            Object objT118 = atqq.t(afvVar2, dpbVarA.d(iK));
                            objT118.getClass();
                            arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar14, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list14, strD4, (List) objT118));
                            iK24 = i9;
                            iK22 = iK22;
                            iK23 = i7;
                            iK2 = i14;
                            iK4 = iK4;
                            iK5 = iK5;
                            i12 = i16;
                            iK14 = i20;
                            i13 = i17;
                            iK16 = i2;
                            i10 = i18;
                            iK13 = i19;
                            iK15 = i;
                            iK18 = i4;
                            iK19 = i5;
                            iK20 = i8;
                            iK17 = i6;
                            iK21 = iK21;
                            iK3 = i15;
                        }
                        z3 = false;
                        if (iK21 == -1) {
                            i6 = i3;
                        } else {
                            i6 = i3;
                            if (((int) dpbVarA.b(iK21)) != 0) {
                                z4 = true;
                            }
                            if (iK22 == -1) {
                                jB = 0;
                            } else {
                                jB = dpbVarA.b(iK22);
                            }
                            i7 = iK23;
                            if (i7 == -1) {
                                jB2 = 0;
                            } else {
                                jB2 = dpbVarA.b(i7);
                            }
                            i8 = iK20;
                            i9 = iK24;
                            if (i9 != -1) {
                                throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                            }
                            dyn dynVar15 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                            Object objT119 = atqq.t(afvVar, dpbVarA.d(iK));
                            objT119.getClass();
                            List list15 = (List) objT119;
                            Object objT1110 = atqq.t(afvVar2, dpbVarA.d(iK));
                            objT1110.getClass();
                            arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar15, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list15, strD4, (List) objT1110));
                            iK24 = i9;
                            iK22 = iK22;
                            iK23 = i7;
                            iK2 = i14;
                            iK4 = iK4;
                            iK5 = iK5;
                            i12 = i16;
                            iK14 = i20;
                            i13 = i17;
                            iK16 = i2;
                            i10 = i18;
                            iK13 = i19;
                            iK15 = i;
                            iK18 = i4;
                            iK19 = i5;
                            iK20 = i8;
                            iK17 = i6;
                            iK21 = iK21;
                            iK3 = i15;
                        }
                        z4 = false;
                        if (iK22 == -1) {
                            jB = 0;
                        } else {
                            jB = dpbVarA.b(iK22);
                        }
                        i7 = iK23;
                        if (i7 == -1) {
                            jB2 = 0;
                        } else {
                            jB2 = dpbVarA.b(i7);
                        }
                        i8 = iK20;
                        i9 = iK24;
                        if (i9 != -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        dyn dynVar16 = new dyn(efoVarN, iT, z, z2, z3, z4, jB, jB2, dms.o(dpbVarA.m(i9)));
                        Object objT1111 = atqq.t(afvVar, dpbVarA.d(iK));
                        objT1111.getClass();
                        List list16 = (List) objT1111;
                        Object objT1112 = atqq.t(afvVar2, dpbVarA.d(iK));
                        objT1112.getClass();
                        arrayList.add(new eer(strD3, dzrVarM, dypVarG, jB3, jB4, jB5, dynVar16, iB, iW, jB6, jB7, iB2, iB3, jB8, iB4, list16, strD4, (List) objT1112));
                        iK24 = i9;
                        iK22 = iK22;
                        iK23 = i7;
                        iK2 = i14;
                        iK4 = iK4;
                        iK5 = iK5;
                        i12 = i16;
                        iK14 = i20;
                        i13 = i17;
                        iK16 = i2;
                        i10 = i18;
                        iK13 = i19;
                        iK15 = i;
                        iK18 = i4;
                        iK19 = i5;
                        iK20 = i8;
                        iK17 = i6;
                        iK21 = iK21;
                        iK3 = i15;
                    }
                    dpbVarA.close();
                    return arrayList;
                } catch (Throwable th) {
                    dpbVarA.close();
                    throw th;
                }
            }
        });
    }

    public final void b(dpt dptVar, afv afvVar) {
        Set setKeySet = afvVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (afvVar.d > 999) {
            wf.h(afvVar, new apm(this, dptVar, 8));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        api.o(sb, setKeySet.size());
        sb.append(')');
        dpb dpbVarA = dptVar.a(sb.toString());
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            dpbVarA.i(i, (String) it.next());
            i++;
        }
        try {
            int iK = ape.k(dpbVarA, "work_spec_id");
            if (iK != -1) {
                while (dpbVarA.l()) {
                    List list = (List) afvVar.get(dpbVarA.d(iK));
                    if (list != null) {
                        byte[] bArrM = dpbVarA.m(0);
                        dyp dypVar = dyp.a;
                        list.add(azx.g(bArrM));
                    }
                }
            }
        } finally {
            dpbVarA.close();
        }
    }

    public final void c(dpt dptVar, afv afvVar) {
        Set setKeySet = afvVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (afvVar.d > 999) {
            wf.h(afvVar, new apm(this, dptVar, 9));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        api.o(sb, setKeySet.size());
        sb.append(')');
        dpb dpbVarA = dptVar.a(sb.toString());
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            dpbVarA.i(i, (String) it.next());
            i++;
        }
        try {
            int iK = ape.k(dpbVarA, "work_spec_id");
            if (iK != -1) {
                while (dpbVarA.l()) {
                    List list = (List) afvVar.get(dpbVarA.d(iK));
                    if (list != null) {
                        list.add(dpbVarA.d(0));
                    }
                }
            }
        } finally {
            dpbVarA.close();
        }
    }
}
