package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.tabs.DefaultTabsBar;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbi {
    private static avbi e;
    public final Object a;
    public int b;
    public final Object c;
    public Object d;

    public avbi(DefaultTabsBar defaultTabsBar, LinearLayout linearLayout) {
        linearLayout.getClass();
        this.c = defaultTabsBar;
        this.b = -1;
        Context context = defaultTabsBar.getContext();
        context.getClass();
        this.a = context;
        context.getResources().getDimensionPixelSize(R.dimen.pinned_floating_tab_button_width);
        context.getResources().getDimensionPixelSize(R.dimen.pinned_floating_tab_gradient_width);
    }

    public static synchronized avbi a() {
        avbi avbiVar;
        avbiVar = e;
        if (avbiVar == null) {
            avbiVar = new avbi();
            e = avbiVar;
        }
        return avbiVar;
    }

    public final void b() {
        Object obj = this.d;
        this.d = (avby[]) Arrays.copyOf((Object[]) obj, ((avby[]) obj).length + 5);
    }

    public final void c() {
        synchronized (this.a) {
            DesugarCollections.unmodifiableList(Arrays.asList((avby[]) Arrays.copyOfRange((Object[]) this.d, 0, this.b)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final avby d(String str, List list, List list2) {
        avby avbyVar;
        ahno.G(!ahno.aa(str), "missing metric name");
        synchronized (this.a) {
            ?? r1 = this.c;
            if (r1.contains(str)) {
                throw new IllegalStateException(a.bT(str, "Metric with name ", " already exists"));
            }
            int i = this.b;
            if (i + 1 == ((avby[]) this.d).length) {
                b();
            }
            avbyVar = new avby(i, str, list, list2);
            ((avby[]) this.d)[i] = avbyVar;
            r1.add(str);
            this.b++;
        }
        return avbyVar;
    }

    public final void e() {
        if (this.b != -1) {
            ((aeej) this.c).d();
        }
    }

    public avbi(String str, qte... qteVarArr) {
        this.a = str;
        this.c = qteVarArr;
    }

    public avbi() {
        this.a = new Object();
        this.c = new HashSet();
        this.d = new avby[5];
    }
}
