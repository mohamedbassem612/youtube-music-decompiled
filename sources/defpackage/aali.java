package defpackage;

import app.rive.semantics.SemanticState;
import internal.org.jni_zero.CommonApis;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aali implements aalv {
    private static final Set a = ahng.aj();
    private final xeu b;
    private final mbc c;
    private final tfq d;
    private final tqa e;
    private final aaqg f;
    private final vxz g;
    private final abte h;
    private final abxv i;

    public aali(xeu xeuVar, abxv abxvVar, tfq tfqVar, mbc mbcVar, aaqg aaqgVar, tqa tqaVar, abte abteVar, vxz vxzVar) {
        xeuVar.getClass();
        this.b = xeuVar;
        this.i = abxvVar;
        this.d = tfqVar;
        this.c = mbcVar;
        this.f = aaqgVar;
        this.e = tqaVar;
        this.h = abteVar;
        this.g = vxzVar;
    }

    private static synchronized boolean j(int i) {
        Set set = a;
        Integer numValueOf = Integer.valueOf(i);
        if (set.contains(numValueOf)) {
            return true;
        }
        set.add(numValueOf);
        return false;
    }

    @Override // defpackage.aalv
    public final void a(aoen aoenVar) {
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aoenVar, alot.OFFLINE_DELETE_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aoenVar.getClass();
        alouVar.d = aoenVar;
        alouVar.c = 486;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.aalv
    public final void b(String str, aofb aofbVar, argn argnVar, int i, int i2, boolean z) {
        aihf aihfVarCreateBuilder = aofr.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aofr aofrVar = (aofr) aihfVarCreateBuilder.instance;
        str.getClass();
        aofrVar.b |= 1;
        aofrVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        aofr aofrVar2 = (aofr) aihfVarCreateBuilder.instance;
        aofrVar2.d = aofbVar.i;
        aofrVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aofr aofrVar3 = (aofr) aihfVarCreateBuilder.instance;
        argnVar.getClass();
        aofrVar3.e = argnVar;
        aofrVar3.b |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        aofr aofrVar4 = (aofr) aihfVarCreateBuilder.instance;
        aofrVar4.b |= 32;
        aofrVar4.f = i;
        aihfVarCreateBuilder.copyOnWrite();
        aofr aofrVar5 = (aofr) aihfVarCreateBuilder.instance;
        aofrVar5.b |= 64;
        aofrVar5.g = i2;
        aihfVarCreateBuilder.copyOnWrite();
        aofr aofrVar6 = (aofr) aihfVarCreateBuilder.instance;
        aofrVar6.b |= SemanticState.Hidden;
        aofrVar6.h = z;
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.OFFLINE_PLAYBACK_STARTED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aofr aofrVar7 = (aofr) aihfVarCreateBuilder.build();
        aofrVar7.getClass();
        alouVar.d = aofrVar7;
        alouVar.c = 63;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.aalv
    public final void c(aofq aofqVar) {
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aofqVar, alot.OFFLINE_PLAYBACK_EXCEPTION_DIGEST);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aofqVar.getClass();
        alouVar.d = aofqVar;
        alouVar.c = 217;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.aalv
    public final void d(aogy aogyVar) {
        int iH;
        long epochMilli = this.c.f().toEpochMilli();
        typ.f(aogyVar.d);
        int iE = agvp.E(aogyVar.h);
        boolean zG = false;
        ahno.F(((iE == 0 || iE == 1) && ((iH = CommonApis.h(aogyVar.g)) == 0 || iH == 1)) ? false : true);
        aihf builder = aogyVar.toBuilder();
        long jB = this.i.b() / 1024;
        builder.copyOnWrite();
        aogy aogyVar2 = (aogy) builder.instance;
        aogyVar2.b |= SemanticState.LiveRegion;
        aogyVar2.l = jB;
        int iL = this.d.l();
        builder.copyOnWrite();
        aogy aogyVar3 = (aogy) builder.instance;
        aogyVar3.p = iL - 1;
        aogyVar3.b |= 16384;
        aaqg aaqgVar = this.f;
        if (aaqgVar.n()) {
            tqa tqaVar = this.e;
            zG = tqaVar.g(aaqgVar.D(tqaVar));
        }
        builder.copyOnWrite();
        aogy aogyVar4 = (aogy) builder.instance;
        aogyVar4.c |= 16;
        aogyVar4.y = zG;
        aogy aogyVar5 = (aogy) builder.build();
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aogyVar5, alot.OFFLINE_TRANSFER_STATUS_CHANGED);
            xffVarA.h = epochMilli;
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            aogyVar5.getClass();
            alouVar.d = aogyVar5;
            alouVar.c = 2;
            xeuVar.c((alou) alosVar.build(), epochMilli);
        }
        if ((aogyVar5.b & 2) != 0) {
            abte abteVar = this.h;
            int iE2 = agvp.E(aogyVar5.h);
            if (iE2 == 0) {
                iE2 = 1;
            }
            xfh xfhVar = new xfh(iE2 - 1, 3);
            aihf aihfVarCreateBuilder = akzk.a.createBuilder();
            aihf aihfVarCreateBuilder2 = aogx.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aogx aogxVar = (aogx) aihfVarCreateBuilder2.instance;
            aogyVar5.getClass();
            aogxVar.c = aogyVar5;
            aogxVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            akzk akzkVar = (akzk) aihfVarCreateBuilder.instance;
            aogx aogxVar2 = (aogx) aihfVarCreateBuilder2.build();
            aogxVar2.getClass();
            akzkVar.e = aogxVar2;
            akzkVar.b |= 2;
            xfhVar.a = (akzk) aihfVarCreateBuilder.build();
            abteVar.c(xfhVar, alai.FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED, aogyVar5.e, epochMilli);
        }
    }

    @Override // defpackage.aalv
    public final boolean e(aoec aoecVar) {
        long epochMilli = this.c.f().toEpochMilli();
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aoecVar, alot.OFFLINE_STATE_SNAPSHOT);
            xffVarA.h = epochMilli;
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return true;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alouVar.d = aoecVar;
        alouVar.c = 22;
        return xeuVar.c((alou) alosVar.build(), epochMilli);
    }

    @Override // defpackage.aalv
    public final void f(agev agevVar, int i, int i2) {
        aihf aihfVarCreateBuilder = aoou.a.createBuilder();
        if (agevVar.g()) {
            Object objC = agevVar.c();
            aihfVarCreateBuilder.copyOnWrite();
            aoou aoouVar = (aoou) aihfVarCreateBuilder.instance;
            aoouVar.b |= 1;
            aoouVar.c = (String) objC;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aoou aoouVar2 = (aoou) aihfVarCreateBuilder.instance;
        aoouVar2.d = i - 1;
        aoouVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aoou aoouVar3 = (aoou) aihfVarCreateBuilder.instance;
        aoouVar3.e = i2 - 1;
        aoouVar3.b |= 4;
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.PLAYBACK_OFFLINE_FALLBACK_USED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aoou aoouVar4 = (aoou) aihfVarCreateBuilder.build();
        aoouVar4.getClass();
        alouVar.d = aoouVar4;
        alouVar.c = 186;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.aalv
    public final void g(aoel aoelVar) {
        if (this.g.l(82, 45427346L, false)) {
            int i = aoelVar.s;
            if (j(i)) {
                return;
            }
            aihf aihfVarCreateBuilder = aoek.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoek aoekVar = (aoek) aihfVarCreateBuilder.instance;
            aoekVar.c = 1;
            aoekVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aoek aoekVar2 = (aoek) aihfVarCreateBuilder.instance;
            aoekVar2.b |= 2;
            aoekVar2.d = 38;
            aihfVarCreateBuilder.copyOnWrite();
            aoek aoekVar3 = (aoek) aihfVarCreateBuilder.instance;
            aoekVar3.e = i;
            aoekVar3.b |= 4;
            xeu xeuVar = this.b;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.OFFLINE_DB_OPEN_COMPLETED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            aoek aoekVar4 = (aoek) aihfVarCreateBuilder.build();
            aoekVar4.getClass();
            alouVar.d = aoekVar4;
            alouVar.c = 232;
            xeuVar.b((alou) alosVar.build());
        }
    }

    @Override // defpackage.aalv
    public final void h(String str, aofb aofbVar) {
        aihf aihfVarCreateBuilder = aoen.a.createBuilder();
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
            aoenVar.b |= 1;
            aoenVar.c = str;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
        aoenVar2.e = 0;
        aoenVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        aoen aoenVar3 = (aoen) aihfVarCreateBuilder.instance;
        aoenVar3.f = aofbVar.i;
        aoenVar3.b |= 16;
        a((aoen) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.aalv
    public final void i(int i) {
        if (this.g.m(199, 45767559L)) {
            aihf aihfVarCreateBuilder = aogu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aogu aoguVar = (aogu) aihfVarCreateBuilder.instance;
            aoguVar.c = 1;
            aoguVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aogu aoguVar2 = (aogu) aihfVarCreateBuilder.instance;
            aoguVar2.d = 1;
            aoguVar2.b |= 2;
            aihf aihfVarCreateBuilder2 = aogs.a.createBuilder();
            aihf aihfVarCreateBuilder3 = aogt.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            aogt aogtVar = (aogt) aihfVarCreateBuilder3.instance;
            aogtVar.c = 3;
            aogtVar.b |= 1;
            aihfVarCreateBuilder3.copyOnWrite();
            aogt aogtVar2 = (aogt) aihfVarCreateBuilder3.instance;
            aogtVar2.d = i - 1;
            aogtVar2.b |= 2;
            aihfVarCreateBuilder2.copyOnWrite();
            aogs aogsVar = (aogs) aihfVarCreateBuilder2.instance;
            aogt aogtVar3 = (aogt) aihfVarCreateBuilder3.build();
            aogtVar3.getClass();
            aogsVar.c = aogtVar3;
            aogsVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aogu aoguVar3 = (aogu) aihfVarCreateBuilder.instance;
            aogs aogsVar2 = (aogs) aihfVarCreateBuilder2.build();
            aogsVar2.getClass();
            aoguVar3.e = aogsVar2;
            aoguVar3.b |= 4;
            xeu xeuVar = this.b;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.OFFLINE_SYSTEM_FAILURE);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            aogu aoguVar4 = (aogu) aihfVarCreateBuilder.build();
            aoguVar4.getClass();
            alouVar.d = aoguVar4;
            alouVar.c = 546;
            xeuVar.b((alou) alosVar.build());
        }
    }
}
