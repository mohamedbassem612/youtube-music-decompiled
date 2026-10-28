package defpackage;

import android.util.Pair;
import androidx.car.app.model.Alert;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DateRetargetClass;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class aarg {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/sync/DefaultPlaylistAutoSyncController");
    private final aari b;
    private final mbc c;
    private final twf d;
    public boolean e = false;
    private final tfq f;
    private final aaqg g;
    private final vxz h;
    private final abxv i;
    private final abfv j;

    public aarg(aari aariVar, abfv abfvVar, aaqg aaqgVar, tfq tfqVar, mbc mbcVar, twf twfVar, abxv abxvVar, vxz vxzVar) {
        this.b = aariVar;
        this.j = abfvVar;
        this.g = aaqgVar;
        this.f = tfqVar;
        this.c = mbcVar;
        this.d = twfVar;
        this.i = abxvVar;
        this.h = vxzVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[PHI: r11
      0x0121: PHI (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:39:0x010f, B:43:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    public synchronized int a(String str, aaqn aaqnVar, boolean z) {
        alts altsVarY;
        boolean z2;
        taq.c();
        boolean z3 = true;
        if (this.g.j() && !this.f.j(1)) {
            return 1;
        }
        aaew aaewVarD = aaqnVar.d();
        if (aaewVarD != null) {
            List listB = b(aaewVarD);
            if (!listB.isEmpty()) {
                try {
                    if (this.h.m(201, 45779562L)) {
                        Iterator it = aaewVarD.l().iterator();
                        long j = -1;
                        while (it.hasNext()) {
                            long j2 = ((aamt) it.next()).h;
                            if (j2 > 0) {
                                long seconds = Duration.between(Instant.ofEpochMilli(j2), this.c.f()).toSeconds();
                                if (j < 0 || seconds < j) {
                                    j = seconds;
                                }
                            }
                        }
                        abfv abfvVar = this.j;
                        abxv abxvVar = this.i;
                        altsVarY = abfvVar.y(abxvVar.a(), abxvVar.d(), (int) Math.max(0L, j), this.d.a(), listB);
                    } else {
                        Iterator it2 = aaewVarD.l().iterator();
                        int i = Integer.MAX_VALUE;
                        while (it2.hasNext()) {
                            int seconds2 = (int) Duration.between(Instant.ofEpochMilli(((aamt) it2.next()).h), this.c.f()).toSeconds();
                            if (seconds2 >= 0 && seconds2 < i) {
                                i = seconds2;
                            }
                        }
                        abfv abfvVar2 = this.j;
                        abxv abxvVar2 = this.i;
                        altsVarY = abfvVar2.y(abxvVar2.a(), abxvVar2.d(), i, this.d.a(), listB);
                    }
                    aaqm aaqmVarI = aaqnVar.i();
                    ArrayList arrayList = new ArrayList();
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    long jB = this.i.b() - altsVarY.d;
                    Iterator it3 = listB.iterator();
                    int iMax = 0;
                    while (it3.hasNext()) {
                        String str2 = ((aapt) it3.next()).a;
                        altq altqVarD = aajg.d(altsVarY, str2);
                        if (altqVarD != null) {
                            iMax = Math.max(iMax, altqVarD.e);
                            if (altqVarD.d || !altqVarD.g) {
                                z2 = false;
                            } else {
                                z2 = z3;
                            }
                        } else {
                            z2 = z3;
                        }
                        if (this.e) {
                            arrayList.add(str2);
                            map.put(str2, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
                            map2.put(str2, 2);
                        } else if (z) {
                            arrayList.add(str2);
                            map.put(str2, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
                            map2.put(str2, 0);
                        } else if (z2) {
                            arrayList.add(str2);
                            map.put(str2, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
                            map2.put(str2, Integer.valueOf((altqVarD == null || !altqVarD.f) ? 1 : 0));
                        }
                        z3 = true;
                    }
                    if (!arrayList.isEmpty()) {
                        aaqmVarI.q(arrayList, map, map2, 1, jB);
                    }
                    aari aariVar = this.b;
                    if (iMax > 0) {
                        aariVar.c(str, iMax);
                    } else {
                        aariVar.d();
                    }
                } catch (ExecutionException e) {
                    ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/sync/DefaultPlaylistAutoSyncController", "runPlaylistAutoSync", 's', "DefaultPlaylistAutoSyncController.java")).t("[Offline] PlaylistSyncCheckRequest failed");
                    return 1;
                }
            }
        }
        return 0;
    }

    protected List b(aaew aaewVar) {
        String[] strArr;
        List<String> list = (List) Collection.EL.stream(aaewVar.ap()).map(new aalr(4)).collect(Collectors.toCollection(new yoj(9)));
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            aamj aamjVarE = aaewVar.e(str);
            if (aamjVarE == null) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/sync/DefaultPlaylistAutoSyncController", "generatePlaylistSyncCheckRequestData", 155, "DefaultPlaylistAutoSyncController.java")).w("[Offline] No offlinePlaylistSnapshot found for %s", str);
            } else {
                Pair pairB = aaewVar.b(str);
                if (pairB == null) {
                    strArr = new String[0];
                } else {
                    List list2 = (List) pairB.second;
                    strArr = new String[list2.size()];
                    for (int i = 0; i < list2.size(); i++) {
                        strArr[i] = ((aamo) list2.get(i)).d();
                    }
                }
                arrayList.add(new aapt(str, DateRetargetClass.toInstant(aamjVarE.a.g).getEpochSecond(), strArr, Duration.ofMillis(aamjVarE.f).toSeconds(), 0L));
            }
        }
        return arrayList;
    }
}
