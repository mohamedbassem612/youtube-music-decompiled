package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sqq implements adma {
    public final View a;
    private final heg b;
    private final vwt c;

    public sqq(Context context, ViewGroup viewGroup, heg hegVar, vwt vwtVar) {
        this.b = hegVar;
        this.c = vwtVar;
        this.a = LayoutInflater.from(context).inflate(R.layout.watch_metadata_companion_cards, viewGroup);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.adma
    public final void b(admh admhVar) {
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((rte) it.next()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public final void d(adly adlyVar) {
        Object obj = this.b.a;
        obj.getClass();
        rsf rsfVar = (rsf) obj;
        View view = this.a;
        rsfVar.d = view;
        rsfVar.e = adlyVar;
        sqr sqrVar = rsfVar.f;
        if (sqrVar != null) {
            sqrVar.a(view, adlyVar);
        }
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((rte) it.next()).b();
        }
    }

    @Override // defpackage.adma
    public final /* bridge */ /* synthetic */ void hU(adly adlyVar, Object obj) {
        d(adlyVar);
    }
}
