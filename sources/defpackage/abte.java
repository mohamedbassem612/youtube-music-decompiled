package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abte {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public abte(xeu xeuVar, dov dovVar, vxu vxuVar, vxz vxzVar, txp txpVar) {
        this.b = xeuVar;
        this.e = new ConcurrentHashMap();
        this.c = dovVar;
        this.f = vxzVar;
        this.d = txpVar;
        ajvu ajvuVarC = vxuVar.c();
        amuc amucVar = ajvuVarC.p;
        akzo akzoVar = (amucVar == null ? amuc.a : amucVar).d;
        if (((akzoVar == null ? akzo.a : akzoVar).b & 1) == 0) {
            this.a = true;
            return;
        }
        amuc amucVar2 = ajvuVarC.p;
        akzo akzoVar2 = (amucVar2 == null ? amuc.a : amucVar2).d;
        this.a = (akzoVar2 == null ? akzo.a : akzoVar2).c;
    }

    private final boolean f(xfh xfhVar) {
        boolean zL = ((vxz) this.f).l(49, 45422959L, false);
        boolean z = this.a;
        if (zL) {
            return z;
        }
        return z && xfhVar != null;
    }

    public final String a() {
        if (!((vxz) this.f).m(24, 45388123L)) {
            return ((dov) this.c).af(16);
        }
        txp txpVar = (txp) this.d;
        int i = txpVar.c;
        if (i <= 0) {
            i = 4;
        }
        return txpVar.b(i);
    }

    public final void b(xfh xfhVar, alai alaiVar) {
        if (f(xfhVar)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.e;
            String strA = (String) concurrentHashMap.get(alaiVar);
            if (strA == null) {
                strA = a();
                String str = (String) concurrentHashMap.putIfAbsent(alaiVar, strA);
                if (str != null) {
                    strA = str;
                }
            }
            e(xfhVar, alaiVar, strA);
        }
    }

    public final void c(xfh xfhVar, alai alaiVar, String str, long j) {
        if (!f(xfhVar) || TextUtils.isEmpty(str)) {
            return;
        }
        aihf aihfVarA = xfhVar.a();
        aihfVarA.copyOnWrite();
        akzj akzjVar = (akzj) aihfVarA.instance;
        akzj akzjVar2 = akzj.a;
        str.getClass();
        akzjVar.b |= 1;
        akzjVar.c = str;
        aihfVarA.copyOnWrite();
        akzj akzjVar3 = (akzj) aihfVarA.instance;
        akzjVar3.f = alaiVar.aH;
        akzjVar3.b |= 8;
        xeu xeuVar = (xeu) this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarA, alot.FLOW_EVENT);
            xffVarA.h = j;
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        akzj akzjVar4 = (akzj) aihfVarA.build();
        akzjVar4.getClass();
        alouVar.d = akzjVar4;
        alouVar.c = 304;
        xeuVar.c((alou) alosVar.build(), j);
    }

    public final void d(xfh xfhVar, alai alaiVar) {
        if (f(xfhVar)) {
            String strA = a();
            ((ConcurrentHashMap) this.e).put(alaiVar, strA);
            e(xfhVar, alaiVar, strA);
        }
    }

    public final void e(xfh xfhVar, alai alaiVar, String str) {
        if (!f(xfhVar) || TextUtils.isEmpty(str)) {
            return;
        }
        aihf aihfVarA = xfhVar.a();
        aihfVarA.copyOnWrite();
        akzj akzjVar = (akzj) aihfVarA.instance;
        akzj akzjVar2 = akzj.a;
        str.getClass();
        akzjVar.b |= 1;
        akzjVar.c = str;
        aihfVarA.copyOnWrite();
        akzj akzjVar3 = (akzj) aihfVarA.instance;
        akzjVar3.f = alaiVar.aH;
        akzjVar3.b |= 8;
        xeu xeuVar = (xeu) this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarA, alot.FLOW_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        akzj akzjVar4 = (akzj) aihfVarA.build();
        akzjVar4.getClass();
        alouVar.d = akzjVar4;
        alouVar.c = 304;
        xeuVar.b((alou) alosVar.build());
    }

    public abte(Context context, awmd awmdVar, zgy zgyVar, awmd awmdVar2, tqj tqjVar) {
        this.b = awmdVar;
        this.d = context;
        this.c = zgyVar;
        this.e = awmdVar2;
        int i = tqr.a;
        boolean zK = tqjVar.k(1073830525);
        this.a = zK;
        this.f = zK ? null : (abtd) awmdVar.io();
    }
}
