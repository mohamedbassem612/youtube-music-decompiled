package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snz implements sxu {
    public final sny a;
    public final wgn b;
    private final zwb c;
    private final Executor d;
    private final zzj e;

    public snz(zwb zwbVar, Executor executor, zzj zzjVar, sny snyVar, wgn wgnVar) {
        zwbVar.getClass();
        this.c = zwbVar;
        executor.getClass();
        this.d = executor;
        zzjVar.getClass();
        this.e = zzjVar;
        snyVar.getClass();
        this.a = snyVar;
        this.b = wgnVar;
    }

    private static final Uri f(aivk aivkVar) {
        try {
            return tyu.c(aivkVar.c);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
    }

    public final void c(aivk aivkVar, zzi... zziVarArr) {
        Uri uriA;
        List<Map.Entry> list = Collections.EMPTY_LIST;
        Uri uriF = f(aivkVar);
        if (uriF == null || uriF.equals(Uri.EMPTY)) {
            return;
        }
        try {
            uriA = this.e.a(uriF, zziVarArr);
        } catch (tzn unused) {
            uriA = null;
        }
        Uri.Builder builderBuildUpon = uriA.buildUpon();
        for (Map.Entry entry : list) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        this.d.execute(new rmx(this, this.a.d(builderBuildUpon.build(), this.c.e()), aivkVar, 6));
    }

    public final boolean d(List list, zzi... zziVarArr) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((aivk) it.next(), zziVarArr);
        }
        return true;
    }

    public final void e(List list) {
        d(list, zzi.f);
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
    }
}
