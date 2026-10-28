package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bou {
    public bou() {
    }

    public static bpa a(dow dowVar) {
        doz dozVarR = dowVar.getSavedStateRegistry().a.d.r("androidx.lifecycle.internal.SavedStateHandlesProvider");
        dos dosVar = dozVarR != null ? dozVarR.a : null;
        if (true != (dosVar instanceof dos)) {
            dosVar = null;
        }
        if (dosVar == null) {
            return null;
        }
        if (dosVar instanceof bpa) {
            return (bpa) dosVar;
        }
        throw new IllegalStateException("The registered SavedStateProvider under SAVED_STATE_KEY is not of type SavedStateHandleController");
    }

    public static void b(dow dowVar, bpp bppVar) {
        awrm awrmVar = new awrm();
        awrmVar.a = a(dowVar);
        if (awrmVar.a == null) {
            awrmVar.a = new bpa(dowVar, bppVar);
            dowVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", (dos) awrmVar.a);
            if (dowVar.getLifecycle().a().a(bob.c)) {
                ((bpa) awrmVar.a).c();
            } else {
                dowVar.getLifecycle().b(new pz(awrmVar, 4, null));
            }
        }
    }

    public static bog c(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            bog bogVar = tag instanceof bog ? (bog) tag : null;
            if (bogVar != null) {
                return bogVar;
            }
            Object objD = bcy.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    public static void d(View view, bog bogVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, bogVar);
    }

    public static eek e(ees eesVar) {
        eesVar.getClass();
        return new eek(eesVar.c, eesVar.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r18 >= r8) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long f(boolean r3, int r4, int r5, long r6, long r8, int r10, boolean r11, long r12, long r14, long r16, long r18) {
        /*
            if (r5 == 0) goto L55
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 == 0) goto L1a
            if (r11 == 0) goto L1a
            if (r10 == 0) goto L17
            r3 = 900000(0xdbba0, double:4.44659E-318)
            long r8 = r8 + r3
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 < 0) goto L48
        L17:
            r3 = r18
            goto L54
        L1a:
            if (r3 == 0) goto L35
            r3 = 2
            if (r5 != r3) goto L22
            long r3 = (long) r4
            long r6 = r6 * r3
            goto L2a
        L22:
            float r3 = (float) r6
            int r4 = r4 + (-1)
            float r3 = java.lang.Math.scalb(r3, r4)
            long r6 = (long) r3
        L2a:
            r3 = 18000000(0x112a880, double:8.8931816E-317)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L32
            r6 = r3
        L32:
            long r3 = r8 + r6
            goto L54
        L35:
            if (r11 == 0) goto L4a
            if (r10 != 0) goto L3c
            long r8 = r8 + r12
            r10 = 0
            goto L3e
        L3c:
            long r8 = r8 + r16
        L3e:
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 == 0) goto L48
            if (r10 != 0) goto L48
            long r3 = r16 - r14
            long r3 = r3 + r8
            goto L54
        L48:
            r3 = r8
            goto L54
        L4a:
            r3 = -1
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L52
            r3 = r0
            goto L54
        L52:
            long r3 = r8 + r12
        L54:
            return r3
        L55:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bou.f(boolean, int, int, long, long, int, boolean, long, long, long, long):long");
    }

    public static List g(edw edwVar, String str) {
        edwVar.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listA = edwVar.a(str);
        listA.getClass();
        ArrayList arrayList = new ArrayList(listA);
        while (!arrayList.isEmpty()) {
            String str2 = (String) atqq.Q(arrayList);
            linkedHashSet.add(str2);
            arrayList.addAll(edwVar.a(str2));
        }
        return atqq.ap(linkedHashSet);
    }

    public bou(char[] cArr) {
    }
}
