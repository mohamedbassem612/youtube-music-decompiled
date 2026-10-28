package com.facebook.litho;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import defpackage.fhu;
import defpackage.fhv;
import defpackage.fhw;
import defpackage.fjw;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class LithoViewTestHelper {
    public static String a(fjw fjwVar) {
        if (fjwVar == null) {
            return "";
        }
        String strViewToString = viewToString(fjwVar, true);
        if (!TextUtils.isEmpty(strViewToString)) {
            return strViewToString;
        }
        return "(" + fjwVar.getLeft() + ',' + fjwVar.getTop() + '-' + fjwVar.getRight() + ',' + fjwVar.getBottom() + ')';
    }

    private static void b(fhu fhuVar, StringBuilder sb, boolean z, boolean z2, int i, int i2, int i3, fhv fhvVar) {
        for (int i4 = 0; i4 < i; i4++) {
            sb.append("  ");
        }
        fhv fhvVar2 = fhvVar;
        fhw.addViewDescription(fhuVar, sb, i2, i3, z, z2, fhvVar2);
        sb.append('\n');
        Rect rectA = fhuVar.a();
        Iterator it = fhuVar.m().iterator();
        while (it.hasNext()) {
            fhv fhvVar3 = fhvVar2;
            b((fhu) it.next(), sb, z, z2, i + 1, rectA.left, rectA.top, fhvVar3);
            fhvVar2 = fhvVar3;
        }
    }

    public static TestItem findTestItem(fjw fjwVar, String str) {
        Deque dequeFindTestItems = fjwVar.findTestItems(str);
        if (dequeFindTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) dequeFindTestItems.getLast();
    }

    public static Deque findTestItems(fjw fjwVar, String str) {
        return fjwVar.findTestItems(str);
    }

    public static String viewToString(fjw fjwVar, boolean z) {
        int i;
        fhu fhuVarG = fhu.g(fjwVar);
        if (fhuVarG == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            i = 3;
            for (ViewParent parent = fjwVar.getParent(); parent != null; parent = parent.getParent()) {
                i++;
            }
        } else {
            i = 0;
        }
        sb.append('\n');
        b(fhuVarG, sb, z, false, i, 0, 0, null);
        return sb.toString();
    }

    public static String viewToStringForE2E(View view, int i, boolean z, fhv fhvVar) {
        fhu fhuVarG;
        if (!(view instanceof fjw) || (fhuVarG = fhu.g((fjw) view)) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        b(fhuVarG, sb, true, z, i, 0, 0, fhvVar);
        return sb.toString();
    }

    public static String viewToStringForE2E(View view, int i, boolean z) {
        return viewToStringForE2E(view, i, z, null);
    }

    public static String viewToString(fjw fjwVar) {
        return viewToString(fjwVar, false).trim();
    }
}
