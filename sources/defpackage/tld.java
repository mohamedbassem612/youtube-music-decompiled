package defpackage;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.graphics.Typeface;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import j$.util.Comparator$CC;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tld {
    public final Object a;
    public final Object b;

    public tld(reo reoVar) {
        ahqj ahqjVar = new ahqj();
        agwi agwiVar = agwi.b;
        agwj agwjVar = new agwj(agwiVar);
        agwi agwiVar2 = agwjVar.a;
        boolean z = true;
        if (agwiVar2 != agwi.a && agwiVar2 != agwiVar) {
            z = false;
        }
        ahno.K(z, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", agwjVar);
        ahqjVar.b = agwjVar;
        agwm agwmVar = new agwm(ahqjVar);
        this.b = agwmVar;
        this.a = reoVar;
        agwmVar.g(reoVar);
    }

    private static long J(slb slbVar, int i) {
        return ((((long) slbVar.a()) * 1000) * ((long) i)) / 4;
    }

    public static /* synthetic */ Object i(Object obj) {
        aihh aihhVar = (aihh) afhq.a.createBuilder();
        String strD = rmp.d((zwa) obj);
        aihhVar.copyOnWrite();
        afhq afhqVar = (afhq) aihhVar.instance;
        afhqVar.b |= 1;
        afhqVar.c = strD;
        aihhVar.copyOnWrite();
        afhq afhqVar2 = (afhq) aihhVar.instance;
        afhqVar2.b |= SemanticState.Hidden;
        afhqVar2.f = "youtube-incognito";
        return (afhq) aihhVar.build();
    }

    public final void A(String str) {
        ((StringBuilder) this.a).append(str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final void B(String str, Object... objArr) {
        ((StringBuilder) this.a).append(str);
        if (objArr != null) {
            ?? r3 = this.b;
            if (r3.size() + objArr.length > 999) {
                throw new IllegalArgumentException("Single SQL statements support at most 999 parameters.");
            }
            for (Object obj : objArr) {
                if (obj == null) {
                    throw new IllegalArgumentException("Bind argument can't be null for query".concat(str));
                }
                r3.add(obj.toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ple] */
    public final synchronized Object C(plx plxVar) {
        Object objA;
        Long lValueOf = plxVar != null ? Long.valueOf(plxVar.a) : null;
        ?? r1 = this.b;
        objA = r1.get(lValueOf);
        if (objA == null) {
            objA = this.a.a(plxVar);
            r1.put(lValueOf, objA);
        }
        return objA;
    }

    public final pjw D(pcu pcuVar, String str) {
        Object systemService = ((Context) this.a).getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        StatusBarNotification[] statusBarNotificationArrA = nvz.a((NotificationManager) systemService);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrA) {
            if (pjx.h(statusBarNotification, (pls) this.b)) {
                arrayList.add(statusBarNotification);
            }
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            pjx pjxVar = pjx.a;
            if (pjx.n((StatusBarNotification) next, pcuVar, str)) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        StatusBarNotification statusBarNotification2 = (StatusBarNotification) obj;
        if (statusBarNotification2 == null) {
            return null;
        }
        pjx pjxVar2 = pjx.a;
        return pjx.k(statusBarNotification2);
    }

    public final Map E(pcu pcuVar, Collection collection) {
        pjw pjwVarK;
        collection.getClass();
        Map mapF = F(pcuVar, collection);
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(collection, 10)), 16));
        for (Object obj : collection) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) mapF.get((String) obj);
            if (statusBarNotification != null) {
                pjx pjxVar = pjx.a;
                pjwVarK = pjx.k(statusBarNotification);
            } else {
                pjwVarK = null;
            }
            linkedHashMap.put(obj, pjwVarK);
        }
        return linkedHashMap;
    }

    public final Map F(pcu pcuVar, Collection collection) {
        Object obj = this.a;
        Set setAw = atqq.aw(collection);
        Object systemService = ((Context) obj).getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        StatusBarNotification[] statusBarNotificationArrA = nvz.a((NotificationManager) systemService);
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrA) {
            if (pjx.h(statusBarNotification, (pls) this.b)) {
                arrayList.add(statusBarNotification);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            StatusBarNotification statusBarNotification2 = (StatusBarNotification) obj2;
            if (atqq.ay(setAw, pjx.g(statusBarNotification2)) && pjx.m(statusBarNotification2, pcuVar)) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(arrayList2, 10)), 16));
        for (Object obj3 : arrayList2) {
            String strG = pjx.g((StatusBarNotification) obj3);
            if (strG == null) {
                throw new IllegalArgumentException("Thread ID was null");
            }
            linkedHashMap.put(strG, obj3);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nxl] */
    public final Typeface G(Context context, oxk oxkVar, String str) {
        String str2 = oxkVar.a;
        int i = oxkVar.b;
        boolean z = oxkVar.c;
        Typeface typefaceC = this.b.c(context, str2, i, z, null);
        if (typefaceC != null) {
            return typefaceC;
        }
        String strAe = ahno.ae(str2);
        if (Build.VERSION.SDK_INT < 28) {
            if (i <= 500) {
                return Typeface.create(strAe, true != z ? 0 : 2);
            }
            return Typeface.create(strAe, true == z ? 3 : 1);
        }
        if (i == 0) {
            return Typeface.create(strAe, true != z ? 0 : 2);
        }
        return Typeface.create(Typeface.create(strAe, 0), i, z);
    }

    public final int H() {
        Iterator it = ((EnumSet) this.b).iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((ofp) it.next()).q;
        }
        return i;
    }

    public final void I(ofp ofpVar) {
        ((EnumSet) this.b).add(ofpVar);
        EnumMap enumMap = (EnumMap) this.a;
        if (enumMap.containsKey(ofpVar)) {
            return;
        }
        enumMap.put(ofpVar, Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final void a(String str) {
        NetworkInfo networkInfoA;
        taq.c();
        int i = tqr.a;
        if (this.a.k(1073814456) || ((networkInfoA = ((tof) this.b.io()).a()) != null && networkInfoA.isConnected())) {
            try {
                InetAddress.getByName(str);
            } catch (UnknownHostException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final boolean b(ProviderInfo providerInfo, int i) {
        return (i & SemanticState.Focused) == 128 && TextUtils.equals(providerInfo.authority, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final agkj c(slb slbVar, String str) {
        String str2;
        int i;
        boolean z;
        agkj agkjVarD;
        sks sksVar;
        agkh agkhVar = new agkh(4);
        int i2 = 0;
        if (!slbVar.X().isEmpty() || !slbVar.ae().isEmpty()) {
            Object obj = this.b;
            aixr aixrVar = aixr.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED;
            slh slhVar = new slh(((xsc) obj).Z(aixrVar), aixrVar, false, slbVar.o);
            agjz agjzVar = new agjz(4);
            agjzVar.j(slbVar.X());
            agjzVar.j(slbVar.ae());
            agkhVar.e(slhVar, agjzVar.g());
        }
        if (!slbVar.ao().isEmpty() || !slbVar.at().isEmpty()) {
            Object obj2 = this.b;
            aixr aixrVar2 = aixr.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED;
            slh slhVar2 = new slh(((xsc) obj2).Z(aixrVar2), aixrVar2, true, slbVar.o);
            agjz agjzVar2 = new agjz(4);
            agjzVar2.j(slbVar.ao());
            agjzVar2.j(slbVar.at());
            agkhVar.e(slhVar2, agjzVar2.g());
        }
        if (!slbVar.U().isEmpty()) {
            Object obj3 = this.b;
            aixr aixrVar3 = aixr.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR;
            agkhVar.e(new shd(((xsc) obj3).Z(aixrVar3), aixrVar3, false, slbVar.o), slbVar.U());
        }
        if (!slbVar.al().isEmpty()) {
            Object obj4 = this.b;
            aixr aixrVar4 = aixr.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR;
            agkhVar.e(new shd(((xsc) obj4).Z(aixrVar4), aixrVar4, true, slbVar.o), slbVar.al());
        }
        if (!slbVar.aa().isEmpty()) {
            Object obj5 = this.b;
            aixr aixrVar5 = aixr.TRIGGER_TYPE_MEDIA_PAUSED;
            agkhVar.e(new slg(((xsc) obj5).Z(aixrVar5), aixrVar5, false, slbVar.o), slbVar.aa());
        }
        if (!slbVar.aq().isEmpty()) {
            Object obj6 = this.b;
            aixr aixrVar6 = aixr.TRIGGER_TYPE_MEDIA_PAUSED;
            agkhVar.e(new slg(((xsc) obj6).Z(aixrVar6), aixrVar6, true, slbVar.o), slbVar.aq());
        }
        if (!slbVar.ac().isEmpty()) {
            Object obj7 = this.b;
            aixr aixrVar7 = aixr.TRIGGER_TYPE_MEDIA_RESUMED;
            agkhVar.e(new sli(((xsc) obj7).Z(aixrVar7), aixrVar7, false, false, slbVar.o), slbVar.ac());
        }
        if (!slbVar.ar().isEmpty()) {
            Object obj8 = this.b;
            aixr aixrVar8 = aixr.TRIGGER_TYPE_MEDIA_RESUMED;
            agkhVar.e(new sli(((xsc) obj8).Z(aixrVar8), aixrVar8, false, true, slbVar.o), slbVar.ar());
        }
        if (!slbVar.ad().isEmpty()) {
            Object obj9 = this.b;
            aixr aixrVar9 = aixr.TRIGGER_TYPE_SKIP_REQUESTED_PING;
            agkhVar.e(new smo(((xsc) obj9).Z(aixrVar9), aixrVar9, false, str, slbVar.o), slbVar.ad());
        }
        if (!slbVar.as().isEmpty()) {
            Object obj10 = this.b;
            aixr aixrVar10 = aixr.TRIGGER_TYPE_SKIP_REQUESTED_PING;
            agkhVar.e(new smo(((xsc) obj10).Z(aixrVar10), aixrVar10, true, str, slbVar.o), slbVar.as());
        }
        if (!slbVar.R().isEmpty()) {
            Object obj11 = this.b;
            aixr aixrVar11 = aixr.TRIGGER_TYPE_CLOSE_REQUESTED;
            agkhVar.e(new ska(((xsc) obj11).Z(aixrVar11), aixrVar11, false, false, slbVar.o, "", 1, 1, 1), slbVar.R());
        }
        if (!slbVar.ai().isEmpty()) {
            Object obj12 = this.b;
            aixr aixrVar12 = aixr.TRIGGER_TYPE_CLOSE_REQUESTED;
            agkhVar.e(new ska(((xsc) obj12).Z(aixrVar12), aixrVar12, false, true, slbVar.o, "", 1, 1, 1), slbVar.ai());
        }
        if (!slbVar.Q().isEmpty()) {
            Object obj13 = this.b;
            aixr aixrVar13 = aixr.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED;
            agkhVar.e(new snp(((xsc) obj13).Z(aixrVar13), aixrVar13, false, str, slbVar.o), slbVar.Q());
        }
        if (slbVar.ah().isEmpty()) {
            str2 = str;
        } else {
            Object obj14 = this.b;
            aixr aixrVar14 = aixr.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED;
            str2 = str;
            agkhVar.e(new snp(((xsc) obj14).Z(aixrVar14), aixrVar14, true, str2, slbVar.o), slbVar.ah());
        }
        if (!slbVar.W().isEmpty()) {
            Object obj15 = this.b;
            aixr aixrVar15 = aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED;
            agkhVar.e(new sld(((xsc) obj15).Z(aixrVar15), aixrVar15, false, slbVar.o), slbVar.W());
        }
        if (!slbVar.an().isEmpty()) {
            Object obj16 = this.b;
            aixr aixrVar16 = aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED;
            agkhVar.e(new sld(((xsc) obj16).Z(aixrVar16), aixrVar16, true, slbVar.o), slbVar.an());
        }
        if (!slbVar.T().isEmpty()) {
            Object obj17 = this.b;
            aixr aixrVar17 = aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED;
            agkhVar.e(new sle(((xsc) obj17).Z(aixrVar17), aixrVar17, false, slbVar.o), slbVar.T());
        }
        if (!slbVar.ak().isEmpty()) {
            Object obj18 = this.b;
            aixr aixrVar18 = aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED;
            agkhVar.e(new sle(((xsc) obj18).Z(aixrVar18), aixrVar18, true, slbVar.o), slbVar.ak());
        }
        if (!slbVar.K().isEmpty()) {
            Object obj19 = this.b;
            aixr aixrVar19 = aixr.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED;
            xsc xscVar = (xsc) obj19;
            String strZ = xscVar.Z(aixrVar19);
            String str3 = slbVar.o;
            agkhVar.e(new slf(strZ, aixrVar19, false, str3), slbVar.K());
            agkhVar.e(sks.e(xscVar.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, str3, 4), slbVar.K());
        }
        if (!slbVar.ag().isEmpty()) {
            Object obj20 = this.b;
            aixr aixrVar20 = aixr.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED;
            xsc xscVar2 = (xsc) obj20;
            String strZ2 = xscVar2.Z(aixrVar20);
            String str4 = slbVar.o;
            agkhVar.e(new slf(strZ2, aixrVar20, true, str4), slbVar.ag());
            agkhVar.e(sks.e(xscVar2.Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, str4, 4), slbVar.ag());
        }
        if (!slbVar.P().isEmpty()) {
            Object obj21 = this.b;
            aixr aixrVar21 = aixr.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED;
            agkhVar.e(new sgl(((xsc) obj21).Z(aixrVar21), aixrVar21, str2), slbVar.P());
        }
        if (!slbVar.O().isEmpty()) {
            Object obj22 = this.b;
            aixr aixrVar22 = aixr.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED;
            agkhVar.e(new sgh(((xsc) obj22).Z(aixrVar22), aixrVar22, str2), slbVar.O());
        }
        if (!slbVar.N().isEmpty()) {
            Object obj23 = this.b;
            aixr aixrVar23 = aixr.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED;
            agkhVar.e(new sgg(((xsc) obj23).Z(aixrVar23), aixrVar23, str2), slbVar.N());
        }
        if (!slbVar.L().isEmpty()) {
            Object obj24 = this.b;
            aixr aixrVar24 = aixr.TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_AUDIBLE_CRITERIA_SATISFIED;
            agkhVar.e(new sge(((xsc) obj24).Z(aixrVar24), aixrVar24, str2), slbVar.L());
        }
        if (!slbVar.M().isEmpty()) {
            Object obj25 = this.b;
            aixr aixrVar25 = aixr.TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_MEASURABLE_CRITERIA_SATISFIED;
            agkhVar.e(new sgf(((xsc) obj25).Z(aixrVar25), aixrVar25, str2), slbVar.M());
        }
        if (!slbVar.V().isEmpty()) {
            Object obj26 = this.b;
            aixr aixrVar26 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            agkhVar.e(new slj(((xsc) obj26).Z(aixrVar26), aixrVar26, false, slbVar.o, new snh(J(slbVar, 1), 9223372036854775806L), false, true), slbVar.V());
        }
        if (!slbVar.Z().isEmpty()) {
            Object obj27 = this.b;
            aixr aixrVar27 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            agkhVar.e(new slj(((xsc) obj27).Z(aixrVar27), aixrVar27, false, slbVar.o, new snh(J(slbVar, 2), 9223372036854775806L), false, true), slbVar.Z());
        }
        if (!slbVar.af().isEmpty()) {
            Object obj28 = this.b;
            aixr aixrVar28 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            agkhVar.e(new slj(((xsc) obj28).Z(aixrVar28), aixrVar28, false, slbVar.o, new snh(J(slbVar, 3), 9223372036854775806L), false, true), slbVar.af());
        }
        if (!slbVar.S().isEmpty()) {
            boolean zAC = taq.aC((vyo) this.a);
            Object obj29 = this.b;
            agkhVar.e(zAC ? sks.f(((xsc) obj29).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, slbVar.o, false, 0) : sks.e(((xsc) obj29).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, slbVar.o, 0), slbVar.S());
        }
        if (!slbVar.am().isEmpty()) {
            Object obj30 = this.b;
            aixr aixrVar29 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            agkhVar.e(new slj(((xsc) obj30).Z(aixrVar29), aixrVar29, true, slbVar.o, new snh(J(slbVar, 1), 9223372036854775806L), false, true), slbVar.am());
        }
        if (!slbVar.ap().isEmpty()) {
            Object obj31 = this.b;
            aixr aixrVar30 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            agkhVar.e(new slj(((xsc) obj31).Z(aixrVar30), aixrVar30, true, slbVar.o, new snh(J(slbVar, 2), 9223372036854775806L), false, true), slbVar.ap());
        }
        if (!slbVar.au().isEmpty()) {
            Object obj32 = this.b;
            aixr aixrVar31 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
            agkhVar.e(new slj(((xsc) obj32).Z(aixrVar31), aixrVar31, true, slbVar.o, new snh(J(slbVar, 3), 9223372036854775806L), false, true), slbVar.au());
        }
        if (slbVar.aj().isEmpty()) {
            i2 = 0;
            i = 3;
        } else {
            boolean zAC2 = taq.aC((vyo) this.a);
            Object obj33 = this.b;
            if (zAC2) {
                sksVar = sks.f(((xsc) obj33).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, slbVar.o, true, 0);
                i = 3;
            } else {
                aixr aixrVar32 = aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING;
                i = 3;
                sksVar = new sks(((xsc) obj33).Z(aixrVar32), aixrVar32, false, true, str, slbVar.o, ahbo.c(0));
                str2 = str;
            }
            agkhVar.e(sksVar, slbVar.aj());
        }
        if (!slbVar.Y().isEmpty() && !slbVar.l()) {
            boolean zAC3 = taq.aC((vyo) this.a);
            Object obj34 = this.b;
            agkhVar.e(zAC3 ? sks.f(((xsc) obj34).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, slbVar.o, true, i2) : sks.e(((xsc) obj34).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, slbVar.o, i2), slbVar.Y());
        }
        List<aivk> listAb = slbVar.ab();
        long millis = TimeUnit.SECONDS.toMillis(slbVar.a());
        String str5 = slbVar.o;
        if (listAb.isEmpty()) {
            agkjVarD = agpn.b;
            z = true;
        } else {
            PriorityQueue priorityQueue = new PriorityQueue(listAb.size(), new rit(i));
            ArrayList arrayList = new ArrayList();
            for (aivk aivkVar : listAb) {
                if (aivkVar.d >= millis) {
                    arrayList.add(aivkVar);
                } else {
                    priorityQueue.add(aivkVar);
                }
            }
            agkh agkhVar2 = new agkh(4);
            if (!priorityQueue.isEmpty()) {
                int i3 = ((aivk) priorityQueue.peek()).d;
                agjz agjzVar3 = new agjz(4);
                while (!priorityQueue.isEmpty()) {
                    if (((aivk) priorityQueue.peek()).d == i3) {
                        agjzVar3.h((aivk) priorityQueue.poll());
                    } else {
                        Object obj35 = this.b;
                        aixr aixrVar33 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
                        String str6 = str5;
                        agkhVar2.e(new slj(((xsc) obj35).Z(aixrVar33), aixrVar33, false, str6, new snh(i3, 9223372036854775806L), true, false), agjzVar3.g());
                        i3 = ((aivk) priorityQueue.peek()).d;
                        agjzVar3 = new agjz(4);
                        str5 = str6;
                    }
                }
                String str7 = str5;
                long j = i3;
                Object obj36 = this.b;
                aixr aixrVar34 = aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING;
                slj sljVar = new slj(((xsc) obj36).Z(aixrVar34), aixrVar34, false, str7, new snh(j, 9223372036854775806L), true, false);
                str5 = str7;
                agkhVar2.e(sljVar, agjzVar3.g());
            }
            if (!arrayList.isEmpty()) {
                boolean zAC4 = taq.aC((vyo) this.a);
                Object obj37 = this.b;
                agkhVar2.e(zAC4 ? sks.f(((xsc) obj37).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, str5, i2, i2) : sks.e(((xsc) obj37).Z(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING), str2, str5, i2), arrayList);
            }
            z = true;
            agkjVarD = agkhVar2.d(true);
        }
        agkhVar.i(agkjVarD);
        return agkhVar.d(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [awmd, java.lang.Object] */
    public final void d(skj skjVar) {
        xte xteVar = (xte) this.b.io();
        sny snyVar = (sny) this.a.io();
        int i = skjVar.h.ordinal() != 67 ? 0 : 1;
        sko skoVar = skjVar.g;
        smr smrVar = skjVar.f;
        int i2 = skjVar.i;
        long j = skjVar.d;
        boolean z = skjVar.c;
        xteVar.k(snyVar, skjVar.a, skjVar.b, z, j, i2, smrVar, skoVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final void e(final smr smrVar, final String str, final acfw acfwVar, final wjf wjfVar, final skl sklVar, final Optional optional, final ski skiVar) {
        ((roq) this.a.io()).f(9, skh.a(str, wjfVar), new Supplier() { // from class: rzk
            /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
            @Override // java.util.function.Supplier
            public final Object get() {
                snh snhVar;
                smr[] smrVarArr = new smr[1];
                aaok aaokVar = (aaok) this.h.b.io();
                ski skiVar2 = skiVar;
                alam alamVar = skiVar2.b;
                skl sklVar2 = sklVar;
                if (sklVar2.b() != slm.PRE_ROLL) {
                    smr smrVar2 = smrVar;
                    int i = 0;
                    while (true) {
                        agke agkeVar = smrVar2.d;
                        if (i >= ((agpi) agkeVar).d) {
                            snhVar = new snh(0L, 0L);
                            break;
                        }
                        snk snkVar = (snk) agkeVar.get(i);
                        i++;
                        if (snkVar instanceof slk) {
                            snhVar = ((slk) snkVar).b;
                            break;
                        }
                    }
                } else {
                    snhVar = new snh(0L, 0L);
                }
                snh snhVar2 = snhVar;
                Optional optional2 = optional;
                smrVarArr[0] = aaokVar.X(alamVar, str, acfwVar, wjfVar, sklVar2, optional2, snhVar2, skiVar2);
                return Arrays.asList(smrVarArr);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
    public final void f(smc smcVar) {
        if (smcVar instanceof ski) {
            return;
        }
        sek sekVar = (sek) this.b.io();
        long epochMilli = this.a.f().toEpochMilli();
        sekVar.e = ahng.n(Long.valueOf(epochMilli));
        taf.j(sekVar.b.b(new xfj(epochMilli, 1)), new iul(16));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g(String str, rlt rltVar, ror rorVar) {
        this.b.execute(new mrh(this, rorVar, str, rltVar, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final rnz h(rnp rnpVar, ViewGroup viewGroup) {
        Context context = (Context) this.b.io();
        context.getClass();
        vxe vxeVar = (vxe) this.a.io();
        vxeVar.getClass();
        rnpVar.getClass();
        return new rnz(context, vxeVar, rnpVar, viewGroup);
    }

    public final boolean j() {
        KeyguardManager keyguardManager = (KeyguardManager) ((Context) this.b).getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }

    public final Looper k() {
        return ((HandlerThread) this.a).getLooper();
    }

    public final void l(Runnable runnable) {
        ((Handler) this.b).post(runnable);
    }

    public final void m() {
        Object obj = this.a;
        HandlerThread handlerThread = (HandlerThread) obj;
        if (handlerThread.getLooper() != null) {
            rjs.a((Thread) obj, handlerThread.getLooper());
            return;
        }
        rbc rbcVar = new rbc(rjs.a, rbd.e);
        rbcVar.c();
        rbcVar.a("Looper is null when shutting down the thread named=%s", handlerThread.getName());
    }

    public final agke n() {
        agwm agwmVar = (agwm) this.b;
        if (agwmVar.e().isEmpty()) {
            return agpi.a;
        }
        Comparator comparatorComparing = Comparator$CC.comparing(new rcs(6));
        Object obj = this.a;
        agwt agwtVar = agwmVar.a;
        return agke.B(comparatorComparing, agwtVar.d(new agvz(agwtVar.g(obj)), obj));
    }

    public final void o(rec recVar) {
        reo reoVar = recVar.h;
        if (reoVar != null) {
            ((agwm) this.b).i(reoVar, this.a);
            recVar.h = null;
        }
        agwm agwmVar = (agwm) this.b;
        reo reoVar2 = (reo) aguu.M(agkz.n(agwmVar.f(recVar)));
        reo reoVar3 = recVar.i;
        boolean z = reoVar2 instanceof rec;
        if (z) {
            ((rec) reoVar2).h = reoVar3;
        }
        if (reoVar3 != null) {
            agwmVar.i(reoVar3, reoVar2);
            recVar.i = null;
        }
        if (reoVar == null && reoVar3 == null && z) {
            ((rec) reoVar2).h = null;
        }
        agwmVar.k(recVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final int p(String str, int i) {
        w(str);
        return this.a.getInt(str, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long q(String str, long j) {
        w(str);
        return this.a.getLong(str, j);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final agkj r() {
        ahno.G(this.b == null, "SharedPreferencesView#getAll() not available on key migration");
        return agkj.h(this.a.getAll());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final String s(String str, String str2) {
        w(str);
        return this.a.getString(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final Set t(String str, Set set) {
        w(str);
        return this.a.getStringSet(str, set);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean u(String str) {
        w(str);
        return this.a.contains(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean v(String str, boolean z) {
        w(str);
        return this.a.getBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void w(String str) {
        ?? r1 = this.b;
        if (r1 != 0) {
            ahno.K(r1.contains(str), "Can't access key outside migration: %s", str);
        }
    }

    public final long x() {
        return ((ayq) this.a).V((Uri) this.b);
    }

    public final void y(InputStream inputStream, long j) throws IOException {
        ayq ayqVar = (ayq) this.a;
        Uri uri = (Uri) this.b;
        long jV = ayqVar.V(uri);
        if (j > jV) {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", Long.valueOf(j), Long.valueOf(jV)));
        }
        OutputStream outputStream = (OutputStream) ayqVar.X(uri, j > 0 ? new qqp(0) : new qqu());
        try {
            agyi.a(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final qoe z() {
        return new qoe(((StringBuilder) this.a).toString(), this.b);
    }

    public tld(akrn akrnVar) {
        this.a = akrnVar;
        this.b = (akrnVar.b & 8) != 0 ? akrnVar.d : null;
    }

    public tld(Object obj, long j, long j2) {
        this.b = obj;
        this.a = new tke((int) j, (int) j2);
    }

    public tld(Object obj, long j, long j2, byte[] bArr) {
        this.b = obj;
        this.a = new tke((int) j, (int) j2);
    }

    public tld(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public tld(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public tld(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public tld(Object obj, Object obj2, short[] sArr) {
        this.b = obj;
        this.a = obj2;
    }

    public tld(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public tld(awmd awmdVar, awmd awmdVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public tld(awmd awmdVar, awmd awmdVar2, char[] cArr, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public tld(nxl nxlVar) {
        this.a = new aga(SemanticState.Focused);
        this.b = nxlVar;
    }

    public tld(ajza ajzaVar) {
        this.a = ajzaVar;
        this.b = (ajzaVar.b & SemanticState.ReadOnly) != 0 ? ajzaVar.h : null;
    }

    public tld(syn synVar, rmd rmdVar) {
        synVar.getClass();
        rmdVar.getClass();
        this.b = synVar;
        this.a = rmdVar;
    }

    public tld(byte[] bArr) {
        this.b = EnumSet.noneOf(ofp.class);
        this.a = new EnumMap(ofp.class);
    }

    public tld(awmd awmdVar, awmd awmdVar2, char[] cArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public tld(Context context, pls plsVar) {
        context.getClass();
        plsVar.getClass();
        this.a = context;
        this.b = plsVar;
    }

    public tld(String str, Bundle bundle) {
        str.getClass();
        this.b = str;
        this.a = bundle;
    }

    public tld(byte[] bArr, byte[] bArr2) {
        this.b = new HashMap();
        this.a = new ArrayList();
    }

    public tld(ple pleVar) {
        this.a = pleVar;
        this.b = new HashMap();
    }

    public tld(tns tnsVar, awuz awuzVar, List list) {
        tnsVar.getClass();
        this.b = awuzVar;
        this.a = list;
    }

    public tld(awmd awmdVar, awmd awmdVar2, byte[] bArr, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
    }

    public tld(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        this.a = handlerThread;
        handlerThread.start();
        handlerThread.setUncaughtExceptionHandler(new rdf(4));
        this.b = new Handler(handlerThread.getLooper());
    }

    public tld(kjc kjcVar) {
        this.b = new AtomicReference(null);
        this.a = kjcVar;
    }

    public tld() {
        this.a = new StringBuilder();
        this.b = new ArrayList();
    }
}
