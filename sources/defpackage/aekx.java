package defpackage;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aekx extends adsv implements aeks, aelj, aemq {
    public final PackageManager a;
    public final vxe b;
    public final aeky c;
    public final tbt d;
    public final xgn e;
    public final Map f;
    public final Map g;
    public final Executor h;
    public final ahex i;
    public boolean j;
    public String k;
    private final Context l;
    private final admu m;
    private final int n;
    private final List o;
    private final adhv p;
    private final boolean q;
    private final int r;
    private final aepb s;

    public aekx(aqst aqstVar, Context context, vxe vxeVar, ajdl ajdlVar, List list, aeky aekyVar, tbt tbtVar, adhv adhvVar, aepb aepbVar, xgn xgnVar, boolean z, Executor executor, ahex ahexVar) {
        aptq aptqVar;
        this.l = context;
        this.b = vxeVar;
        this.c = aekyVar;
        this.d = tbtVar;
        this.p = adhvVar;
        this.s = aepbVar;
        this.e = xgnVar;
        this.q = z;
        this.r = true != aekyVar.c() ? 4 : 1;
        this.h = executor;
        ahexVar.getClass();
        this.i = ahexVar;
        this.f = new HashMap();
        this.g = new HashMap();
        this.m = new admu();
        this.n = context.getResources().getInteger(R.integer.share_panel_third_party_columns);
        this.a = context.getPackageManager();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            tym.W(map, adul.p(resolveInfo.activityInfo.applicationInfo.packageName, ajdlVar), resolveInfo);
        }
        this.o = new ArrayList();
        this.j = true;
        for (aptr aptrVar : aqstVar.c) {
            if ((aptrVar.b & 2) != 0) {
                aptq aptqVar2 = aptrVar.c;
                aptqVar2 = aptqVar2 == null ? aptq.a : aptqVar2;
                Set set = (Set) map.get(Integer.valueOf(aptqVar2.d));
                if (set == null || set.isEmpty()) {
                    this.o.add(aptqVar2);
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ResolveInfo resolveInfo2 = (ResolveInfo) it2.next();
                        aptq aptqVarX = aewo.x(aptqVar2, resolveInfo2);
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo != null && activityInfo.exported) {
                            this.f.put(aptqVarX, resolveInfo2);
                            this.o.add(aptqVarX);
                        }
                        it2.remove();
                    }
                }
            }
        }
        for (aptj aptjVar : aqstVar.e) {
            if (aptjVar != null) {
                map.remove(Integer.valueOf(aptjVar.c));
            }
        }
        if ((aqstVar.b & 2) != 0) {
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                for (ResolveInfo resolveInfo3 : (Set) it3.next()) {
                    apts aptsVar = aqstVar.d;
                    if (((aptsVar == null ? apts.a : aptsVar).b & 1) != 0) {
                        apts aptsVar2 = aqstVar.d;
                        aptqVar = (aptsVar2 == null ? apts.a : aptsVar2).c;
                        if (aptqVar == null) {
                            aptqVar = aptq.a;
                        }
                    } else {
                        aptqVar = null;
                    }
                    aptq aptqVarX2 = aewo.x(aptqVar, resolveInfo3);
                    this.f.put(aptqVarX2, resolveInfo3);
                    this.o.add(aptqVarX2);
                }
            }
        }
        h();
        aepbVar.d(this);
    }

    public static final amdd g(aptq aptqVar) {
        ajwo ajwoVar = aptqVar.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(appo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        almw almwVar = ((appo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).e;
        if (almwVar == null) {
            almwVar = almw.a;
        }
        aptj aptjVar = almwVar.c;
        if (aptjVar == null) {
            aptjVar = aptj.a;
        }
        if (aptjVar.d.isEmpty() || aptjVar.e.isEmpty()) {
            return null;
        }
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amdj.a.createBuilder();
        String str = String.format("%s/%s", aptjVar.d, aptjVar.e);
        aihfVarCreateBuilder2.copyOnWrite();
        amdj amdjVar = (amdj) aihfVarCreateBuilder2.instance;
        str.getClass();
        amdjVar.b |= 1;
        amdjVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdj amdjVar2 = (amdj) aihfVarCreateBuilder2.build();
        amdjVar2.getClass();
        amddVar.i = amdjVar2;
        amddVar.b |= 32;
        return (amdd) aihfVarCreateBuilder.build();
    }

    private final void h() {
        if (this.q && !this.j) {
            this.m.clear();
            return;
        }
        List list = this.o;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.d(new xgj(((aptq) it.next()).h, (amud) null));
        }
        int i = this.n;
        aekw aekwVar = new aekw(list, i);
        admu admuVar = this.m;
        admuVar.clear();
        aeky aekyVar = this.c;
        boolean z = !aekyVar.c();
        for (int i2 = 0; i2 < aekwVar.size(); i2++) {
            List listA = aekwVar.get(i2);
            if (i2 < this.r) {
                admuVar.add(new aemp(i, listA));
            } else {
                admuVar.add(new adla(i, listA, 0, 0, 0, 0));
                z = false;
            }
        }
        aekyVar.b(z);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.m;
    }

    @Override // defpackage.aeks
    public final void c(admh admhVar) {
        adhv adhvVar = this.p;
        Context context = this.l;
        admhVar.d(aptq.class, new jdg(context, this, adhvVar, 4));
        jcx jcxVar = new jcx(context, admhVar, 11, null);
        admhVar.d(adla.class, jcxVar);
        admhVar.d(aemp.class, jcxVar);
    }

    @Override // defpackage.aelj
    public final void e() {
        this.c.a(false);
    }

    @Override // defpackage.aelj
    public final void f() {
        aeky aekyVar = this.c;
        aekyVar.a(false);
        ((aemn) aekyVar).dismiss();
        this.d.c(new aelb());
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.s.e(this);
    }

    @Override // defpackage.adsv, defpackage.advc
    public final void k(Configuration configuration) {
        h();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.aemq
    public final void kc(aepb aepbVar) {
        this.j = aepbVar.a.isEmpty();
        if (this.q) {
            h();
        } else {
            this.m.m();
        }
    }

    @Override // defpackage.aeks
    public final void b(List list) {
    }
}
