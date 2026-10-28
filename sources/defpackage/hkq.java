package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.music.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkq {
    public final Activity a;
    public final aunn b;
    public final tqj c;
    public anit d;
    public final vxz f;
    private final jnj h;
    public final List e = new ArrayList();
    private final Map g = new afv();

    public hkq(Activity activity, jnj jnjVar, aunn aunnVar, tqj tqjVar, vxz vxzVar) {
        this.a = activity;
        this.h = jnjVar;
        this.b = aunnVar;
        this.c = tqjVar;
        this.f = vxzVar;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [awmd, java.lang.Object] */
    public final void a(Menu menu, ajnf ajnfVar, Optional optional, int i, int i2) {
        List list = (List) j$.util.Map.EL.computeIfAbsent(this.g, menu, new hds(2));
        MenuItem menuItemAdd = menu.add(i, i2, 1, "");
        menuItemAdd.setShowAsAction(2);
        jnj jnjVar = this.h;
        Context context = (Context) jnjVar.c.io();
        context.getClass();
        xgm xgmVar = (xgm) jnjVar.b.io();
        xgmVar.getClass();
        jij jijVar = (jij) jnjVar.d.io();
        jijVar.getClass();
        wco wcoVar = (wco) jnjVar.a.io();
        wcoVar.getClass();
        zwb zwbVar = (zwb) jnjVar.e.io();
        zwbVar.getClass();
        avmb avmbVar = (avmb) jnjVar.f.io();
        avmbVar.getClass();
        ajnfVar.getClass();
        hkr hkrVar = new hkr(context, xgmVar, jijVar, wcoVar, zwbVar, avmbVar, ajnfVar, optional);
        list.add(hkrVar);
        azs.d(menuItemAdd, hkrVar);
    }

    public final void b(Menu menu) {
        List list = this.e;
        if (list.isEmpty()) {
            return;
        }
        c(menu);
        if (this.f.m(257, 45823344L)) {
            menu.removeGroup(R.id.browse_toolbar_client_removable_buttons_group);
            menu.removeGroup(R.id.browse_toolbar_server_buttons_group);
        } else {
            menu.clear();
        }
        Iterable$EL.forEach(list, new hfo(this, menu, 5));
    }

    public final void c(Menu menu) {
        List list = (List) this.g.remove(menu);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((hkr) it.next()).i();
            }
        }
    }

    public final void d(heh hehVar) {
        Object obj;
        almd almdVar;
        this.e.clear();
        if (hehVar == null || (obj = hehVar.h) == null || (almdVar = ((wfy) obj).a) == null) {
            return;
        }
        Collection.EL.stream(almdVar.l).filter(new gqk(6)).forEach(new gmk(this, 11));
    }
}
