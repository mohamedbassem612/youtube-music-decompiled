package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aazo {
    public final Object a;
    public final Object b;

    public aazo(View view) {
        TextView textView = (TextView) view.findViewById(R.id.stream_quality);
        textView.getClass();
        this.b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.stream_size);
        textView2.getClass();
        this.a = textView2;
    }

    public static final yog c(aodp aodpVar) {
        int iOrdinal = aodpVar.ordinal();
        if (iOrdinal == 1) {
            return new yog(2, 2);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? yoc.a : new yog(4, 4);
        }
        return new yog(3, 3);
    }

    private static final xsc q(List list, List list2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            aamo aamoVar = (aamo) it.next();
            if (list.contains(aamoVar.d())) {
                hashSet.add(aamoVar.d());
            } else {
                arrayList2.add(aamoVar);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return new xsc((Object) hashSet, (Object) arrayList, (Object) arrayList2, (char[]) null);
    }

    public final boolean a() {
        ResolveInfo resolveInfoResolveActivity = ((Activity) this.a).getPackageManager().resolveActivity(new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"), 65536);
        return resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo.isEnabled() && resolveInfoResolveActivity.activityInfo.exported;
    }

    public final void b(String str, abxz abxzVar) {
        str.getClass();
        ((ijt) this.b).o(str, ((ijt) this.a).l(abxzVar));
    }

    public final void d() {
        AlertDialog alertDialog = (AlertDialog) this.b;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized aaro e(String str) {
        return (aaro) this.b.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final synchronized aaro f(String str) {
        ((tbo) this.a).b(str);
        return (aaro) this.b.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized agkj g() {
        return (agkj) Collection.EL.stream(this.b.values()).map(new aalr(7)).collect(aghu.a(new aalr(8), new aalr(9)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List h() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        tbn tbnVar = new tbn((tbo) this.a);
        while (tbnVar.hasNext()) {
            aaro aaroVar = (aaro) this.b.get((String) tbnVar.next());
            if (aaroVar != null) {
                arrayList.add(aaroVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void i(aaro aaroVar) {
        ?? r0 = this.b;
        String str = aaroVar.a;
        r0.put(str, aaroVar);
        Object obj = this.a;
        Iterator it = ((tbo) obj).a.values().iterator();
        while (it.hasNext()) {
            if (((LinkedList) it.next()).contains(str)) {
                ((tbo) obj).b(str);
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(aaroVar.h);
        aamb aambVar = aaroVar.e;
        long j = aarq.a;
        ((tbo) obj).a(new Pair(numValueOf, Long.valueOf(aambVar.c("transfer_added_time_millis"))), str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void j() {
        this.b.clear();
        ((tbo) this.a).a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized boolean k(String str) {
        return this.b.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized boolean l() {
        return !this.b.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awmd, java.lang.Object] */
    public final long m(String str, String str2, String str3) {
        ?? r4 = this.a;
        aamt aamtVarF = ((aaew) r4.io()).f(str);
        if (aamtVarF != null && !aamtVarF.e) {
            Set setM = ((aaew) r4.io()).m(str);
            if (setM.isEmpty() || (setM.size() == 1 && str2 != null && setM.contains(str2))) {
                aaew aaewVar = (aaew) r4.io();
                typ.f(str);
                Set setD = aaewVar.b.d(str);
                if (setD.isEmpty() || (setD.size() == 1 && str3 != null && setD.contains(str3))) {
                    return aamtVarF.e();
                }
            }
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final boolean n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamt aamtVarF = ((aaew) this.a.io()).f((String) it.next());
            if (aamtVarF == null || !aamtVarF.n.b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0274  */
    /* JADX WARN: Code duplicated, block: B:106:0x0280  */
    /* JADX WARN: Code duplicated, block: B:107:0x0294  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ea A[LOOP:5: B:118:0x02e4->B:120:0x02ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x030e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0323  */
    /* JADX WARN: Code duplicated, block: B:137:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0201  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:96:0x023e  */
    /* JADX WARN: Type inference failed for: r12v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v19, types: [awmd, java.lang.Object] */
    public final aaqp o(String str, String str2, List list, List list2, aohm aohmVar, byte[] bArr, boolean z, long j, aohx aohxVar, aodp aodpVar) {
        long j2;
        aofb aofbVar;
        int i;
        LinkedHashMap linkedHashMap;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        int size;
        int i2;
        String str3;
        int iIntValue;
        String str4;
        String str5;
        Iterator it2;
        aamt aamtVarF;
        boolean z2 = true;
        ahno.F((str != null) ^ (str2 != null));
        String str6 = true != ahno.aa(str) ? str : str2;
        str6.getClass();
        HashSet<String> hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iOrdinal = aohmVar.ordinal();
        long j3 = 0;
        if (iOrdinal == 2 || iOrdinal == 3) {
            xsc xscVarQ = q(list, list2);
            abqq abqqVar = (abqq) this.b.io();
            int iA = aaus.a(aohxVar, -1);
            if (iA != -1) {
                long jLongValue = j;
                long jLongValue2 = 0;
                for (String str7 : xscVarQ.b) {
                    boolean z3 = z2;
                    long jM = m(str7, str, str2);
                    jLongValue += jM;
                    jLongValue2 -= jM;
                    hashSet.add(str7);
                    z2 = z3;
                }
                if (jLongValue < 0) {
                    HashMap map = new HashMap();
                    for (String str8 : xscVarQ.c) {
                        long j4 = j3;
                        map.put(str8, Long.valueOf(m(str8, str, str2)));
                        j3 = j4;
                    }
                    j2 = j3;
                    ArrayList arrayList3 = new ArrayList(map.entrySet());
                    Collections.sort(arrayList3, new rit(11));
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Map.Entry entry = (Map.Entry) arrayList3.get(i3);
                        if (jLongValue >= j2) {
                            break;
                        }
                        jLongValue += ((Long) entry.getValue()).longValue();
                        jLongValue2 -= ((Long) entry.getValue()).longValue();
                        hashSet.add((String) entry.getKey());
                    }
                } else {
                    j2 = 0;
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = list2.iterator();
                long j5 = jLongValue;
                long j6 = jLongValue2;
                while (it3.hasNext()) {
                    aamo aamoVar = (aamo) it3.next();
                    String strD = aamoVar.d();
                    Iterator it4 = it3;
                    if (xscVarQ.c.contains(strD) || hashSet2.contains(strD)) {
                        arrayList.add(aamoVar.d());
                    } else {
                        if (z) {
                            try {
                                aofbVar = aofb.OFFLINE_DEFERRED;
                            } catch (wno unused) {
                            }
                        } else {
                            aofbVar = aofb.OFFLINE_NOW;
                        }
                        wjf wjfVarJ = abqqVar.j(strD, aofbVar, bArr, null, null);
                        if (abqq.l(wjfVarJ) && abqq.k(wjfVarJ)) {
                            wja wjaVarG = wjfVarJ.g();
                            boolean zI = abqq.i(iA);
                            i = iA;
                            wgs wgsVarN = abqqVar.n(i, aodpVar, wjaVarG, true, wjfVarJ.f());
                            wgs wgsVarN2 = zI ? null : abqqVar.n(i, aodpVar, wjaVarG, false, wjfVarJ.f());
                            if (wgsVarN != null && (zI || wgsVarN2 != null)) {
                                long j7 = wgsVarN.j() + (wgsVarN2 == null ? j2 : wgsVarN2.j());
                                if (j5 >= j7) {
                                    j6 += j7;
                                    linkedHashSet.add(aamoVar);
                                    arrayList.add(strD);
                                    hashSet2.add(strD);
                                    j5 -= j7;
                                }
                            }
                        }
                        it3 = it4;
                        iA = i;
                    }
                    i = iA;
                    it3 = it4;
                    iA = i;
                }
                for (String str9 : hashSet) {
                    if (arrayList.contains(str9)) {
                        arrayList.removeAll(Collections.singleton(str9));
                    }
                }
                j3 = j6;
            }
            if (aohmVar == aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE) {
                if (!n(arrayList)) {
                    it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        aamtVarF = ((aaew) this.a.io()).f((String) it2.next());
                        if (aamtVarF == null && aamtVarF.n == aamg.COMPLETE) {
                            it2.remove();
                        }
                    }
                }
                linkedHashMap = new LinkedHashMap();
                it = list.iterator();
                while (it.hasNext()) {
                    str5 = (String) it.next();
                    if (hashSet.contains(str5)) {
                        if (linkedHashMap.containsKey(str5)) {
                            linkedHashMap.put(str5, Integer.valueOf(((Integer) linkedHashMap.get(str5)).intValue() + 1));
                        } else {
                            linkedHashMap.put(str5, 1);
                        }
                    }
                }
                linkedHashMap2 = new LinkedHashMap();
                size = arrayList.size();
                for (i2 = 0; i2 < size; i2++) {
                    str4 = (String) arrayList.get(i2);
                    if (linkedHashMap2.containsKey(str4)) {
                        linkedHashMap2.put(str4, Integer.valueOf(((Integer) linkedHashMap2.get(str4)).intValue() + 1));
                    } else {
                        linkedHashMap2.put(str4, 1);
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    str3 = (String) entry2.getKey();
                    if (linkedHashMap.containsKey(str3)) {
                        iIntValue = ((Integer) linkedHashMap.get(str3)).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    linkedHashMap.put(str3, Integer.valueOf(Math.max(iIntValue, ((Integer) entry2.getValue()).intValue())));
                }
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    arrayList2.addAll(Collections.nCopies(((Integer) entry3.getValue()).intValue(), (String) entry3.getKey()));
                }
            }
            return arrayList2.isEmpty() ? new aaqp(str6, hashSet, linkedHashSet, arrayList, null, j3) : new aaqp(str6, hashSet, linkedHashSet, arrayList, arrayList2, j3);
        }
        xsc xscVarQ2 = q(list, list2);
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList.add(((aamo) it5.next()).d());
        }
        hashSet.addAll(xscVarQ2.b);
        linkedHashSet.addAll(xscVarQ2.a);
        if (aohmVar == aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE) {
            if (!n(arrayList)) {
                it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    aamtVarF = ((aaew) this.a.io()).f((String) it2.next());
                    if (aamtVarF == null) {
                    }
                }
            }
            linkedHashMap = new LinkedHashMap();
            it = list.iterator();
            while (it.hasNext()) {
                str5 = (String) it.next();
                if (hashSet.contains(str5)) {
                    if (linkedHashMap.containsKey(str5)) {
                        linkedHashMap.put(str5, Integer.valueOf(((Integer) linkedHashMap.get(str5)).intValue() + 1));
                    } else {
                        linkedHashMap.put(str5, 1);
                    }
                }
            }
            linkedHashMap2 = new LinkedHashMap();
            size = arrayList.size();
            while (i2 < size) {
                str4 = (String) arrayList.get(i2);
                if (linkedHashMap2.containsKey(str4)) {
                    linkedHashMap2.put(str4, Integer.valueOf(((Integer) linkedHashMap2.get(str4)).intValue() + 1));
                } else {
                    linkedHashMap2.put(str4, 1);
                }
            }
            while (r1.hasNext()) {
                str3 = (String) entry2.getKey();
                if (linkedHashMap.containsKey(str3)) {
                    iIntValue = ((Integer) linkedHashMap.get(str3)).intValue();
                } else {
                    iIntValue = 0;
                }
                linkedHashMap.put(str3, Integer.valueOf(Math.max(iIntValue, ((Integer) entry2.getValue()).intValue())));
            }
            while (r0.hasNext()) {
                arrayList2.addAll(Collections.nCopies(((Integer) entry3.getValue()).intValue(), (String) entry3.getKey()));
            }
        }
        if (arrayList2.isEmpty()) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final aazo p(wja wjaVar, wiu wiuVar, int i, int i2, aodp aodpVar, boolean z, String str) {
        yog yogVar = yoc.a;
        try {
            yod yodVarA = ((yob) this.a.io()).a(wjaVar, wiuVar, new yoc(new yog(i, i), c(aodpVar), false, (((vxz) this.b).l(194, 45738203L, false) || TextUtils.isEmpty(str)) ? null : str, -1, -2, -1L, i2, true != z ? 0 : 32, null));
            wgs[] wgsVarArrN = yodVarA.n();
            wgs[] wgsVarArr = yodVarA.c;
            wgs wgsVar = wgsVarArrN.length > 0 ? wgsVarArrN[0] : null;
            wgs wgsVar2 = wgsVarArr.length > 0 ? wgsVarArr[0] : null;
            if (z && wgsVar2 != null) {
                wgsVar = null;
            }
            if (wgsVar == null && wgsVar2 == null) {
                return null;
            }
            return new aazo(wgsVar, wgsVar2);
        } catch (yof unused) {
            return null;
        }
    }

    public aazo(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public aazo(Set set, Executor executor) {
        this.a = set;
        this.b = executor;
    }

    public aazo(abwk abwkVar, awmd awmdVar) {
        abwkVar.getClass();
        awmdVar.getClass();
        this.b = abwkVar;
        this.a = awmdVar;
    }

    public aazo(wgs wgsVar, wgs wgsVar2) {
        boolean z = true;
        if (wgsVar == null && wgsVar2 == null) {
            z = false;
        }
        ahno.F(z);
        this.a = wgsVar;
        this.b = wgsVar2;
    }

    public aazo(aamh aamhVar, List list) {
        this.b = aamhVar;
        list.getClass();
        this.a = list;
        ahno.F(aamhVar.d == list.size());
    }

    public aazo(ijt ijtVar, ijt ijtVar2) {
        ijtVar.getClass();
        this.b = ijtVar;
        this.a = ijtVar2;
    }

    public aazo() {
        this.b = new LinkedHashMap();
        this.a = new tbo(new aqv(8));
    }

    public aazo(Context context, AlertDialog.Builder builder) {
        this.a = context;
        this.b = builder.create();
    }

    public aazo(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
