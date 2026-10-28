package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dep {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x0283  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object, java.util.Map] */
    public dep(tv tvVar, String str, String str2) throws ts {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        String str3;
        int i4;
        String str4;
        jrv jrvVar;
        ss[] ssVarArr;
        int i5;
        this.c = new afv();
        this.a = tvVar;
        this.b = str;
        this.d = str2;
        su suVarL = l(str);
        int i6 = suVarL.a;
        int i7 = 6;
        jrv jrvVar2 = null;
        if (i6 == 0) {
            i = 1;
            Iterator it = suVarL.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = 0;
                    arrayList = new ArrayList();
                    break;
                }
                String str5 = ((sl) it.next()).a;
                if (str5.equals("VisibilityType") || str5.equals("PackageAccessibleType")) {
                    tvVar.b.readLock().lock();
                    try {
                        afv afvVar = new afv();
                        for (String str6 : DesugarCollections.unmodifiableSet(tvVar.i.b.keySet())) {
                            String strF = ed.f(str6);
                            Set afxVar = (Set) afvVar.get(strF);
                            if (afxVar == null) {
                                afxVar = new afx(0);
                                afvVar.put(strF, afxVar);
                            }
                            afxVar.add(ed.e(str6));
                        }
                        i2 = 0;
                        tvVar.b.readLock().unlock();
                        arrayList = new ArrayList(afvVar.d);
                        for (Map.Entry entry : afvVar.entrySet()) {
                            String str7 = (String) entry.getKey();
                            if (!str7.equals("VS#Pkg")) {
                                Iterator it2 = ((Set) entry.getValue()).iterator();
                                while (it2.hasNext()) {
                                    try {
                                        arrayList.add(tvVar.h("uri:".concat(ed.d(str7, (String) it2.next())), Collections.EMPTY_MAP));
                                    } catch (ts e) {
                                        if (e.a != 6) {
                                            throw e;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    } catch (Throwable th) {
                        tvVar.b.readLock().unlock();
                        throw th;
                    }
                }
            }
            afv afvVar2 = new afv();
            int i8 = i2;
            while (i8 < arrayList.size()) {
                ss ssVar = (ss) arrayList.get(i8);
                String[] strArrN = ssVar.n("notPlatformSurfaceable");
                if (strArrN != null) {
                    int i9 = i2;
                    while (i9 < strArrN.length) {
                        uv uvVarC = ed.c(afvVar2, strArrN[i9]);
                        int i10 = i2;
                        boolean[] zArr = new boolean[1];
                        zArr[i10] = true;
                        i9++;
                        i2 = i10;
                    }
                }
                int i11 = i2;
                ss[] ssVarArrM = ssVar.m("packageAccessible");
                if (ssVarArrM != null) {
                    for (int i12 = i11; i12 < ssVarArrM.length; i12++) {
                        ss ssVar2 = ssVarArrM[i12];
                        String strG = ssVar2.g("accessibleSchema");
                        azs.l(strG);
                        uv uvVarC2 = ed.c(afvVar2, strG);
                        String strG2 = ssVar2.g("packageName");
                        azs.l(strG2);
                        byte[] bArrK = ssVar2.k("sha256Cert");
                        azs.l(bArrK);
                        uvVarC2.c.add(new sz(strG2, bArrK));
                    }
                }
                i8++;
                i2 = i11;
            }
            i3 = i2;
            arrayList2 = new ArrayList(afvVar2.d);
            Iterator it3 = afvVar2.entrySet().iterator();
            while (it3.hasNext()) {
                arrayList2.add(((uv) ((Map.Entry) it3.next()).getValue()).d());
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new ts(2, "Found unsupported visibility version: " + suVarL.a, null);
                }
                Set setA = suVarL.a();
                sl slVar = ux.a;
                if (setA.contains(slVar)) {
                    sl slVar2 = tr.a;
                    if (setA.contains(slVar2) && setA.contains(ux.c)) {
                        str3 = "Found unsupported visibility version: ";
                        if (!tvVar.m("VS#Pkg", str, Arrays.asList(slVar, slVar2), Collections.EMPTY_LIST, Collections.EMPTY_MAP, true, 2, null).a) {
                            throw new ts(2, "Fail to force override deprecated visibility schema with public acl.", null);
                        }
                    } else {
                        str3 = "Found unsupported visibility version: ";
                        if (setA.contains(slVar) || !setA.contains(tr.a)) {
                            i4 = 1;
                            if (!tvVar.m("VS#Pkg", str, Arrays.asList(slVar, tr.a), Collections.EMPTY_LIST, Collections.EMPTY_MAP, false, 2, null).a) {
                                throw new ts(2, "Fail to set the latest visibility schema to AppSearch. You may need to update the visibility schema version number.", null);
                            }
                        }
                    }
                    i4 = 1;
                } else {
                    str3 = "Found unsupported visibility version: ";
                    if (setA.contains(slVar)) {
                    }
                    i4 = 1;
                    if (!tvVar.m("VS#Pkg", str, Arrays.asList(slVar, tr.a), Collections.EMPTY_LIST, Collections.EMPTY_MAP, false, 2, null).a) {
                        throw new ts(2, "Fail to set the latest visibility schema to AppSearch. You may need to update the visibility schema version number.", null);
                    }
                }
                su suVarL2 = l(str2);
                int i13 = suVarL2.a;
                if (i13 == 0) {
                    str4 = str2;
                    sv svVarM = tvVar.m("VS#Pkg", str4, Collections.singletonList(ux.b), Collections.EMPTY_LIST, Collections.EMPTY_MAP, true, 1, null);
                    if (!svVarM.a) {
                        throw new ts(2, svVarM.c, null);
                    }
                } else {
                    if (i13 != i4) {
                        throw new ts(2, str3 + suVarL2.a, null);
                    }
                    Set setA2 = suVarL2.a();
                    sl slVar3 = ux.b;
                    if (!setA2.contains(slVar3) && !tvVar.m("VS#Pkg", str2, Collections.singletonList(slVar3), Collections.EMPTY_LIST, Collections.EMPTY_MAP, false, 1, null).a) {
                        throw new ts(2, "Fail to set the overlay visibility schema to AppSearch. You may need to create new overlay schema.", null);
                    }
                    str4 = str2;
                }
                List listM = m(str4, "androidVOverlay");
                afv afvVar3 = new afv(listM.size());
                for (int i14 = 0; i14 < listM.size(); i14++) {
                    ss ssVar3 = (ss) listM.get(i14);
                    afvVar3.put(ssVar3.e(), ssVar3);
                }
                List listM2 = m((String) this.b, "");
                int i15 = 0;
                while (i15 < listM2.size()) {
                    ss ssVar4 = (ss) listM2.get(i15);
                    ss ssVar5 = (ss) afvVar3.get(ssVar4.e());
                    ?? r5 = this.c;
                    String strE = ssVar4.e();
                    ssVar4.getClass();
                    if (ssVar5 != null) {
                        try {
                            byte[] bArrK2 = ssVar5.k("visibilityProtoSerializeProperty");
                            if (bArrK2 != null) {
                                jrvVar = (jrv) lxt.y(jrv.DEFAULT_INSTANCE, bArrK2);
                            } else {
                                jrvVar = jrvVar2;
                            }
                        } catch (lyh e2) {
                            Log.e("AppSearchVisibilityToDo", "Get an invalid android V visibility overlay proto.", e2);
                        }
                    } else {
                        jrvVar = jrvVar2;
                    }
                    zz zzVar = new zz();
                    String[] strArrN2 = ssVar4.n("packageName");
                    byte[][] bArrO = ssVar4.o("sha256Cert");
                    if (strArrN2 != null && bArrO != null) {
                        int i16 = 0;
                        while (i16 < strArrN2.length) {
                            zzVar.b(new sz(strArrN2[i16], bArrO[i16]));
                            i16++;
                            afvVar3 = afvVar3;
                            listM2 = listM2;
                        }
                    }
                    afv afvVar4 = afvVar3;
                    List list = listM2;
                    ss[] ssVarArrM2 = ssVar4.m("permission");
                    if (ssVarArrM2 != null) {
                        int i17 = 0;
                        while (i17 < ssVarArrM2.length) {
                            long[] jArrL = ssVarArrM2[i17].l("allRequiredPermissions");
                            if (jArrL != null) {
                                afx afxVar2 = new afx(jArrL.length);
                                int i18 = 0;
                                while (true) {
                                    ssVarArr = ssVarArrM2;
                                    if (i18 >= jArrL.length) {
                                        break;
                                    }
                                    afxVar2.add(Integer.valueOf((int) jArrL[i18]));
                                    i18++;
                                    ssVarArrM2 = ssVarArr;
                                    i17 = i17;
                                }
                                i5 = i17;
                                zzVar.c(afxVar2);
                            } else {
                                ssVarArr = ssVarArrM2;
                                i5 = i17;
                            }
                            i17 = i5 + 1;
                            ssVarArrM2 = ssVarArr;
                        }
                    }
                    if (jrvVar != null) {
                        jrx jrxVar = jrvVar.visibilityConfig_;
                        zzVar.d(ux.b(jrxVar == null ? jrx.DEFAULT_INSTANCE : jrxVar).a());
                    }
                    te teVarA = zzVar.a();
                    sw swVar = new sw(ssVar4.e());
                    swVar.f(ssVar4.p());
                    swVar.b();
                    swVar.b = new zz(teVarA);
                    if (jrvVar != null) {
                        lye lyeVar = jrvVar.visibleToConfigs_;
                        for (int i19 = 0; i19 < lyeVar.size(); i19++) {
                            swVar.c(ux.b((jrx) lyeVar.get(i19)));
                        }
                    }
                    r5.put(strE, swVar.a());
                    i15++;
                    afvVar3 = afvVar4;
                    listM2 = list;
                    jrvVar2 = null;
                }
                return;
            }
            i = 1;
            i3 = 0;
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            Object obj = this.a;
            tv tvVar2 = (tv) obj;
            tvVar2.b.readLock().lock();
            try {
                dep depVar = ((tv) obj).i;
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = depVar.b.values().iterator();
                while (it4.hasNext()) {
                    arrayList3.addAll(((Map) it4.next()).keySet());
                }
                tvVar2.b.readLock().unlock();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                for (int i20 = i3; i20 < arrayList3.size(); i20++) {
                    if (!ed.f((String) arrayList3.get(i20)).equals("VS#Pkg")) {
                        try {
                            arrayList4.add(new uw(((tv) obj).h((String) arrayList3.get(i20), Collections.EMPTY_MAP)));
                        } catch (ts e3) {
                            if (e3.a != 6) {
                                throw e3;
                            }
                        }
                    }
                }
                arrayList2 = arrayList4;
            } catch (Throwable th2) {
                tvVar2.b.readLock().unlock();
                throw th2;
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList2.size());
        int i21 = i3;
        while (i21 < arrayList2.size()) {
            uw uwVar = (uw) arrayList2.get(i21);
            afx afxVar3 = new afx(i3);
            Set setQ = uw.q(uwVar.l("role"));
            if (setQ != null) {
                afw afwVar = new afw((afx) setQ);
                while (afwVar.hasNext()) {
                    int iIntValue = ((Integer) afwVar.next()).intValue();
                    afx afxVar4 = new afx(0);
                    if (iIntValue == i) {
                        afxVar4.add(5);
                    } else if (iIntValue == 2) {
                        afxVar4.add(Integer.valueOf(i7));
                    }
                    afxVar3.add(afxVar4);
                }
            }
            Set setQ2 = uw.q(uwVar.l("permission"));
            if (setQ2 != null) {
                afxVar3.add(setQ2);
            }
            sw swVar2 = new sw(uwVar.e());
            swVar2.f(uwVar.p());
            String[] strArrN3 = uwVar.n("packageName");
            azs.l(strArrN3);
            byte[][] bArrO2 = uwVar.o("sha256Cert");
            azs.l(bArrO2);
            if (strArrN3.length == bArrO2.length) {
                for (int i22 = 0; i22 < strArrN3.length; i22++) {
                    swVar2.d(new sz(strArrN3[i22], bArrO2[i22]));
                }
            }
            afw afwVar2 = new afw(afxVar3);
            while (afwVar2.hasNext()) {
                swVar2.e((Set) afwVar2.next());
            }
            arrayList5.add(swVar2.a());
            i21++;
            i7 = 6;
            i3 = 0;
        }
        Object obj2 = this.a;
        Object obj3 = this.b;
        sl[] slVarArr = new sl[2];
        slVarArr[0] = ux.a;
        slVarArr[i] = tr.a;
        sv svVarM2 = ((tv) obj2).m("VS#Pkg", (String) obj3, Arrays.asList(slVarArr), Collections.EMPTY_LIST, Collections.EMPTY_MAP, true, 2, null);
        if (!svVarM2.a) {
            throw new ts(2, svVarM2.c, null);
        }
        sv svVarM3 = ((tv) this.a).m("VS#Pkg", (String) this.d, Collections.singletonList(ux.b), Collections.EMPTY_LIST, Collections.EMPTY_MAP, true, 1, null);
        if (!svVarM3.a) {
            throw new ts(2, svVarM3.c, null);
        }
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        for (int i23 = 0; i23 < arrayList5.size(); i23++) {
            sx sxVar = (sx) arrayList5.get(i23);
            this.c.put(sxVar.a, sxVar);
            arrayList6.add(ux.a(sxVar));
        }
        if (arrayList6.isEmpty()) {
            return;
        }
        ((tv) this.a).r("VS#Pkg", (String) this.b, arrayList6, new eob(null, null), false, null, luv.UNKNOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence, java.lang.Object] */
    private final void k(atn atnVar) {
        IconCompat iconCompatA = atnVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? aaj.e(iconCompatA, null) : null, atnVar.e, atnVar.f);
        aamo[] aamoVarArr = atnVar.g;
        if (aamoVarArr != null) {
            int length = aamoVarArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            for (int i = 0; i < aamoVarArr.length; i++) {
                aamo aamoVar = aamoVarArr[i];
                RemoteInput.Builder choices = new RemoteInput.Builder((String) aamoVar.d).setLabel(aamoVar.e).setChoices(null);
                boolean z = aamoVar.a;
                RemoteInput.Builder builderAddExtras = choices.setAllowFreeFormInput(true).addExtras((Bundle) aamoVar.b);
                Iterator it = aamoVar.c.iterator();
                while (it.hasNext()) {
                    builderAddExtras.setAllowDataType((String) it.next(), true);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    builderAddExtras.setEditChoicesBeforeSending(0);
                }
                remoteInputArr[i] = builderAddExtras.build();
            }
            for (int i2 = 0; i2 < length; i2++) {
                builder.addRemoteInput(remoteInputArr[i2]);
            }
        }
        Bundle bundle = new Bundle(atnVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", atnVar.b);
        builder.setAllowGeneratedReplies(atnVar.b);
        bundle.putInt("android.support.action.semanticAction", 0);
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(false);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(false);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            builder.setEmphasisHint(0);
            builder.setStyleHint(0);
        }
        Object obj = this.c;
        bundle.putBoolean("android.support.action.showsUserInterface", atnVar.c);
        builder.addExtras(bundle);
        ((Notification.Builder) obj).addAction(builder.build());
    }

    private final su l(String str) {
        Object obj = this.a;
        tv tvVar = (tv) obj;
        ReadWriteLock readWriteLock = tvVar.b;
        String strD = ed.d("VS#Pkg", str);
        readWriteLock.readLock().lock();
        try {
            st stVar = new st();
            for (lvq lvqVar : ((tv) obj).i.g(strD).values()) {
                lvp lvpVar = (lvp) lvqVar.v();
                ed.i(lvpVar);
                stVar.e(lvqVar.version_);
                stVar.d(f.e(lvpVar));
            }
            return stVar.a();
        } finally {
            tvVar.b.readLock().unlock();
        }
    }

    private final List m(String str, String str2) {
        tk tkVar = new tk();
        tkVar.e(str2);
        tkVar.c(100);
        tl tlVarA = tkVar.a();
        tv tvVar = (tv) this.a;
        tj tjVarK = tvVar.k("VS#Pkg", str, "", tlVarA, null);
        ArrayList arrayList = new ArrayList();
        List listA = tjVarK.a();
        while (!listA.isEmpty()) {
            for (int i = 0; i < listA.size(); i++) {
                arrayList.add(((ti) listA.get(i)).a());
            }
            tjVarK = tvVar.i("VS#Pkg", tjVarK.a, null);
            listA = tjVarK.a();
        }
        return arrayList;
    }

    private final void n(String str, Map map, Set set, Map map2) {
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        lvq lvqVar = (lvq) map.get(str);
        azs.l(lvqVar);
        for (int i = 0; i < lvqVar.b(); i++) {
            String strE = lvqVar.e(i);
            Integer num = (Integer) map2.get(strE);
            if (num == null) {
                num = 0;
            }
            map2.put(strE, Integer.valueOf(num.intValue() + 1));
            n(strE, map, set, map2);
        }
    }

    public final void a() {
        ((bxl) this.c).b(0);
    }

    public final void b(long j, bwb bwbVar) {
        ((bxl) this.c).a(j, bwbVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void c(cvk cvkVar, dev devVar) {
        int i = 0;
        while (true) {
            cwj[] cwjVarArr = (cwj[]) this.d;
            if (i >= cwjVarArr.length) {
                return;
            }
            devVar.c();
            cwj cwjVarS = cvkVar.s(devVar.a(), 3);
            bse bseVar = (bse) this.a.get(i);
            String str = bseVar.q;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            ahno.K(z, "Invalid closed caption MIME type provided: %s", str);
            String strB = bseVar.a;
            if (strB == null) {
                strB = devVar.b();
            }
            bsd bsdVar = new bsd();
            bsdVar.a = strB;
            bsdVar.a((String) this.b);
            bsdVar.e(str);
            bsdVar.e = bseVar.e;
            bsdVar.d = bseVar.d;
            bsdVar.M = bseVar.O;
            bsdVar.r = bseVar.t;
            cwjVarS.b(new bse(bsdVar));
            cwjVarArr[i] = cwjVarS;
            i++;
        }
    }

    public final void d() {
        ((bxl) this.c).b(0);
    }

    public final void e(int i) {
        ((bxl) this.c).c(i);
    }

    public final String f() {
        return ((String) this.c) + '/' + ((String) this.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map g(String str) {
        azs.l(str);
        Map map = (Map) this.b.get(str);
        return map == null ? Collections.EMPTY_MAP : map;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void h(String str, lvq lvqVar) {
        azs.l(str);
        azs.l(lvqVar);
        ?? r1 = this.b;
        Map afvVar = (Map) r1.get(str);
        if (afvVar == null) {
            afvVar = new afv();
            r1.put(str, afvVar);
        }
        afvVar.put(lvqVar.schemaType_, lvqVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void i(String str, Set set) {
        this.a.put(str, set);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void j(String str) {
        azs.l(str);
        ?? r0 = this.c;
        r0.remove(str);
        ?? r1 = this.d;
        r1.remove(str);
        Map map = (Map) this.b.get(str);
        if (map != null) {
            afv afvVar = new afv();
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                lvq lvqVar = (lvq) it.next();
                for (int i = 0; i < lvqVar.b(); i++) {
                    String strE = lvqVar.e(i);
                    List arrayList = (List) afvVar.get(strE);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        afvVar.put(strE, arrayList);
                    }
                    arrayList.add(lvqVar.schemaType_);
                }
            }
            if (!afvVar.isEmpty()) {
                r0.put(str, afvVar);
            }
            afv afvVar2 = new afv();
            for (lvq lvqVar2 : map.values()) {
                if (lvqVar2.b() > 0) {
                    String str2 = lvqVar2.schemaType_;
                    Map afvVar3 = new afv();
                    n(str2, map, new afx(0), afvVar3);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.add(str2);
                    while (!arrayDeque.isEmpty()) {
                        lvq lvqVar3 = (lvq) map.get(arrayDeque.poll());
                        azs.l(lvqVar3);
                        for (int i2 = 0; i2 < lvqVar3.b(); i2++) {
                            String strE2 = lvqVar3.e(i2);
                            Integer num = (Integer) afvVar3.get(strE2);
                            azs.l(num);
                            int iIntValue = num.intValue() - 1;
                            afvVar3.put(strE2, Integer.valueOf(iIntValue));
                            if (iIntValue == 0) {
                                arrayList2.add(ed.h(strE2));
                                arrayDeque.add(strE2);
                            }
                        }
                    }
                    afvVar2.put(str2, arrayList2);
                }
            }
            if (afvVar2.isEmpty()) {
                return;
            }
            r1.put(str, afvVar2);
        }
    }

    public dep(String str, String str2, long[] jArr, cxt[] cxtVarArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = cxtVarArr;
    }

    public dep() {
        this.b = new afv();
        this.c = new afv();
        this.d = new afv();
        this.a = new afv();
    }

    public dep(List list) {
        this.a = list;
        this.b = "video/mp2t";
        this.d = new cwj[list.size()];
        this.c = new bxl(new deo(this, 0));
    }

    public dep(dfb dfbVar, zf zfVar, byte[] bArr, acih[] acihVarArr) {
        this.b = dfbVar;
        this.c = zfVar;
        this.a = bArr;
        this.d = acihVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r15v6, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v70, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r3v18, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v34, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence, java.lang.Object] */
    public dep(atr atrVar) {
        ArrayList arrayList;
        int i;
        ?? bundle;
        ?? r15;
        atn atnVarC;
        atn atnVarC2;
        this.a = new Bundle();
        this.d = atrVar;
        Context context = atrVar.a;
        this.b = context;
        Notification.Builder builder = new Notification.Builder(atrVar.a, atrVar.E);
        this.c = builder;
        Notification notification = atrVar.I;
        Object obj = null;
        int i2 = 2;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(atrVar.e).setContentText(atrVar.f).setContentInfo(atrVar.j).setContentIntent(atrVar.h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & SemanticState.Focused) != 0).setNumber(atrVar.k).setProgress(atrVar.q, atrVar.r, atrVar.s);
        IconCompat iconCompat = atrVar.i;
        builder.setLargeIcon(iconCompat == null ? null : aaj.e(iconCompat, context));
        builder.setSubText(atrVar.o).setUsesChronometer(false).setPriority(atrVar.l);
        auu auuVar = atrVar.n;
        if (auuVar instanceof atu) {
            atu atuVar = (atu) auuVar;
            PendingIntent pendingIntent = atuVar.b;
            if (pendingIntent == null) {
                atnVarC = atuVar.c(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, atuVar.f, R.color.call_notification_decline_color, atuVar.c);
            } else {
                atnVarC = atuVar.c(R.drawable.ic_call_decline, R.string.call_notification_decline_action, atuVar.f, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = atuVar.a;
            if (pendingIntent2 == null) {
                atnVarC2 = null;
            } else {
                boolean z = atuVar.d;
                atnVarC2 = atuVar.c(true != z ? R.drawable.ic_call_answer : R.drawable.ic_call_answer_video, true != z ? R.string.call_notification_answer_action : R.string.call_notification_answer_video_action, atuVar.e, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(atnVarC);
            ArrayList arrayList3 = atuVar.h.b;
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                atn atnVar = (atn) arrayList3.get(i4);
                if (atnVar == null || !atnVar.a.getBoolean("key_action_priority")) {
                    arrayList2.add(atnVar);
                    i2--;
                }
                if (atnVarC2 != null && i2 == 1) {
                    arrayList2.add(atnVarC2);
                    i2 = 0;
                }
            }
            if (atnVarC2 != null && i2 > 0) {
                arrayList2.add(atnVarC2);
            }
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                k((atn) arrayList2.get(i5));
            }
        } else {
            ArrayList arrayList4 = atrVar.b;
            int size3 = arrayList4.size();
            for (int i6 = 0; i6 < size3; i6++) {
                k((atn) arrayList4.get(i6));
            }
        }
        Bundle bundle2 = atrVar.y;
        if (bundle2 != null) {
            ((Bundle) this.a).putAll(bundle2);
        }
        ((Notification.Builder) this.c).setShowWhen(atrVar.m);
        ((Notification.Builder) this.c).setLocalOnly(atrVar.w);
        ((Notification.Builder) this.c).setGroup(atrVar.t);
        ((Notification.Builder) this.c).setSortKey(atrVar.v);
        ((Notification.Builder) this.c).setGroupSummary(atrVar.u);
        ((Notification.Builder) this.c).setCategory(atrVar.x);
        ((Notification.Builder) this.c).setColor(atrVar.z);
        ((Notification.Builder) this.c).setVisibility(atrVar.A);
        ((Notification.Builder) this.c).setPublicVersion(atrVar.B);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<avc> arrayList5 = atrVar.c;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            for (avc avcVar : arrayList5) {
                String strConcat = avcVar.c;
                if (strConcat == null) {
                    if (avcVar.a != null) {
                        CharSequence charSequence = avcVar.a;
                        Objects.toString(charSequence);
                        strConcat = "name:".concat(String.valueOf(charSequence));
                    } else {
                        strConcat = "";
                    }
                }
                arrayList6.add(strConcat);
            }
            ArrayList arrayList7 = atrVar.J;
            afx afxVar = new afx(arrayList6.size() + arrayList7.size());
            afxVar.addAll(arrayList6);
            afxVar.addAll(arrayList7);
            arrayList = new ArrayList(afxVar);
        } else {
            arrayList = atrVar.J;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Notification.Builder) this.c).addPerson((String) it.next());
            }
        }
        if (atrVar.d.size() > 0) {
            Bundle bundle3 = atrVar.b().getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle = bundle3;
                bundle = new Bundle();
            }
            bundle = bundle3;
            ?? bundle4 = new Bundle((Bundle) bundle);
            ?? bundle5 = new Bundle();
            int i7 = 0;
            while (i7 < atrVar.d.size()) {
                String string = Integer.toString(i7);
                atn atnVar2 = (atn) atrVar.d.get(i7);
                ?? bundle6 = new Bundle();
                IconCompat iconCompatA = atnVar2.a();
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.a() : i3);
                bundle6.putCharSequence("title", atnVar2.e);
                bundle6.putParcelable("actionIntent", atnVar2.f);
                Bundle bundle7 = new Bundle(atnVar2.a);
                bundle7.putBoolean("android.support.allowGeneratedReplies", atnVar2.b);
                bundle6.putBundle("extras", bundle7);
                aamo[] aamoVarArr = atnVar2.g;
                if (aamoVarArr == null) {
                    r15 = obj;
                } else {
                    r15 = new Bundle[aamoVarArr.length];
                    while (i3 < aamoVarArr.length) {
                        aamo aamoVar = aamoVarArr[i3];
                        ?? bundle8 = new Bundle();
                        int i8 = i7;
                        int i9 = i3;
                        bundle8.putString("resultKey", (String) aamoVar.d);
                        bundle8.putCharSequence("label", aamoVar.e);
                        bundle8.putCharSequenceArray("choices", null);
                        boolean z2 = aamoVar.a;
                        bundle8.putBoolean("allowFreeFormInput", true);
                        bundle8.putBundle("extras", (Bundle) aamoVar.b);
                        ?? r8 = aamoVar.c;
                        if (!r8.isEmpty()) {
                            ArrayList arrayList8 = new ArrayList(r8.size());
                            Iterator it2 = r8.iterator();
                            while (it2.hasNext()) {
                                arrayList8.add((String) it2.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        r15[i9] = bundle8;
                        i3 = i9 + 1;
                        i7 = i8;
                    }
                }
                int i10 = i7;
                bundle6.putParcelableArray("remoteInputs", r15);
                bundle6.putBoolean("showsUserInterface", atnVar2.c);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i7 = i10 + 1;
                obj = null;
                i3 = 0;
            }
            bundle.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            atrVar.b().putBundle("android.car.EXTENSIONS", bundle);
            ((Bundle) this.a).putBundle("android.car.EXTENSIONS", bundle4);
        }
        ((Notification.Builder) this.c).setExtras(atrVar.y);
        ((Notification.Builder) this.c).setRemoteInputHistory(atrVar.p);
        RemoteViews remoteViews = atrVar.C;
        if (remoteViews != null) {
            ((Notification.Builder) this.c).setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = atrVar.D;
        if (remoteViews2 != null) {
            ((Notification.Builder) this.c).setCustomBigContentView(remoteViews2);
        }
        ((Notification.Builder) this.c).setBadgeIconType(0);
        ((Notification.Builder) this.c).setSettingsText(null);
        ((Notification.Builder) this.c).setShortcutId(atrVar.F);
        ((Notification.Builder) this.c).setTimeoutAfter(atrVar.G);
        ((Notification.Builder) this.c).setGroupAlertBehavior(atrVar.H);
        if (TextUtils.isEmpty(atrVar.E)) {
            i = 0;
        } else {
            i = 0;
            ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList9 = atrVar.c;
            int size4 = arrayList9.size();
            for (int i11 = i; i11 < size4; i11++) {
                ((Notification.Builder) this.c).addPerson(ats.b((avc) arrayList9.get(i11)));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ((Notification.Builder) this.c).setAllowSystemGeneratedContextualActions(true);
            ((Notification.Builder) this.c).setBubbleMetadata(null);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            ((Notification.Builder) this.c).setShortCriticalText(atrVar.g);
        }
    }

    public dep(Typeface typeface, dqp dqpVar) {
        this.c = typeface;
        this.a = dqpVar;
        this.b = new zg(SemanticState.ReadOnly);
        int iE = dqpVar.e();
        if (iE <= 100000) {
            this.d = new char[iE << 1];
            int iE2 = dqpVar.e();
            for (int i = 0; i < iE2; i++) {
                blm blmVar = new blm(this, i);
                Character.toChars(blmVar.c(), (char[]) this.d, i << 1);
                azs.f(blmVar.b() > 0, "invalid metadata codepoint length");
                ((zg) this.b).c(blmVar, 0, blmVar.b() - 1);
            }
            return;
        }
        throw new IllegalArgumentException("Metadata list length is too large.");
    }

    public dep(List list, eol eolVar, eol eolVar2, eol eolVar3) {
        this.a = list != null ? agke.n(list) : agpi.a;
        this.c = eolVar;
        this.d = eolVar2;
        this.b = eolVar3;
    }
}
