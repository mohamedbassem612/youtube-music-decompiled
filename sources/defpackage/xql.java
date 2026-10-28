package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xql implements xzf {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediahub/MediaHubDeviceDataModel");
    private final xzs A;
    public final awmd b;
    public final Context c;
    public xvq f;
    public final String h;
    public final abvn j;
    public final xsa k;
    public final xzm l;
    public final ydu n;
    public final xwv o;
    public final xqw p;
    public final yar t;
    public final ycp u;
    public final vxz v;
    private final dij y;
    private final did z;
    public volatile List d = new ArrayList();
    public xvq g = null;
    public final awkv i = new awku().aI();
    public final avmm m = new avmm();
    public int q = -1;
    private boolean B = false;
    public azs x = null;
    public final abvn r = null;
    public final xyz s = new xqx(this, 1);
    public final ahfi w = new ahfi();
    public xvq e = zik.bW();

    public xql(awmd awmdVar, Context context, xmr xmrVar, abvn abvnVar, xsa xsaVar, Optional optional, yar yarVar, xzm xzmVar, ycp ycpVar, dij dijVar, did didVar, ydu yduVar, vxz vxzVar, xwv xwvVar, xzs xzsVar, xqw xqwVar) {
        this.b = awmdVar;
        this.c = context;
        this.h = xmrVar.a;
        this.j = abvnVar;
        this.k = xsaVar;
        this.t = yarVar;
        this.l = xzmVar;
        this.u = ycpVar;
        this.y = dijVar;
        this.z = didVar;
        this.n = yduVar;
        this.v = vxzVar;
        this.o = xwvVar;
        this.A = xzsVar;
        this.p = xqwVar;
        optional.isPresent();
    }

    public final xvq a(String str) {
        for (xvq xvqVar : this.d) {
            if (xvqVar.c().equals(str)) {
                return xvqVar;
            }
        }
        return null;
    }

    public final abvk b() {
        return this.j.o();
    }

    public final asee c(asee aseeVar) {
        xvq xvqVarA = a(aseeVar.c);
        if (xvqVarA == null) {
            return aseeVar;
        }
        dii diiVar = xvqVarA.a;
        if (!xrx.j(diiVar)) {
            xvr xvrVarC = this.t.c(diiVar.s);
            if (xvrVarC == null) {
                return aseeVar;
            }
            aihf builder = aseeVar.toBuilder();
            aklk aklkVar = aseeVar.d;
            if (aklkVar == null) {
                aklkVar = aklk.a;
            }
            aihf builder2 = aklkVar.toBuilder();
            airu airuVarW = xvrVarC.w();
            builder2.copyOnWrite();
            aklk aklkVar2 = (aklk) builder2.instance;
            airuVarW.getClass();
            aklkVar2.c = airuVarW;
            aklkVar2.b |= 1;
            builder.copyOnWrite();
            asee aseeVar2 = (asee) builder.instance;
            aklk aklkVar3 = (aklk) builder2.build();
            aklkVar3.getClass();
            aseeVar2.d = aklkVar3;
            aseeVar2.b |= 2;
            return (asee) builder.build();
        }
        xvp xvpVarA = this.t.a(xvqVarA.c());
        if (xvpVarA == null) {
            return aseeVar;
        }
        aihf builder3 = aseeVar.toBuilder();
        aklk aklkVar4 = aseeVar.d;
        if (aklkVar4 == null) {
            aklkVar4 = aklk.a;
        }
        aihf builder4 = aklkVar4.toBuilder();
        builder4.copyOnWrite();
        aklk aklkVar5 = (aklk) builder4.instance;
        aklkVar5.c = xvpVarA.a;
        aklkVar5.b |= 1;
        builder4.copyOnWrite();
        aklk aklkVar6 = (aklk) builder4.instance;
        aklkVar6.b |= 2;
        aklkVar6.d = xvpVarA.d;
        builder3.copyOnWrite();
        asee aseeVar3 = (asee) builder3.instance;
        aklk aklkVar7 = (aklk) builder4.build();
        aklkVar7.getClass();
        aseeVar3.d = aklkVar7;
        aseeVar3.b |= 2;
        return (asee) builder3.build();
    }

    public final askp d(wjf wjfVar, abvk abvkVar) {
        if (abvkVar.Y()) {
            aihf aihfVarCreateBuilder = askp.a.createBuilder();
            String string = this.c.getString(R.string.main_ad_playing_title);
            aihfVarCreateBuilder.copyOnWrite();
            askp askpVar = (askp) aihfVarCreateBuilder.instance;
            string.getClass();
            askpVar.b |= 1;
            askpVar.c = string;
            return (askp) aihfVarCreateBuilder.build();
        }
        aihf aihfVarCreateBuilder2 = askp.a.createBuilder();
        String strF = wjfVar.F();
        aihfVarCreateBuilder2.copyOnWrite();
        askp askpVar2 = (askp) aihfVarCreateBuilder2.instance;
        strF.getClass();
        askpVar2.b |= 1;
        askpVar2.c = strF;
        return (askp) aihfVarCreateBuilder2.build();
    }

    public final Optional e() {
        wjf wjfVarC;
        acfw acfwVarI = b().i();
        return (acfwVarI == null || this.j.h().t() || (wjfVarC = acfwVarI.c()) == null) ? Optional.empty() : Optional.of(wjfVarC);
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        this.q = -1;
    }

    @Override // defpackage.xzf
    public final void h(xzc xzcVar) {
        k();
    }

    public final Optional i(xvq xvqVar) {
        return (xvqVar.equals(this.e) || (!o() && xvqVar.l())) ? e() : Optional.empty();
    }

    public final List j(List list) {
        return (List) Collection.EL.stream(list).filter(new xdo(this, 2)).collect(Collectors.toCollection(new ieu(18)));
    }

    public final void k() {
        this.u.d(this);
        this.g = null;
        if (this.B) {
            m();
        }
    }

    public final void l() {
        if (this.x == null) {
            this.x = new xqk(this);
        }
        this.y.p(this.z, this.x, 0);
        this.B = false;
    }

    public final void m() {
        azs azsVar = this.x;
        if (azsVar == null || this.g != null) {
            this.B = true;
        } else {
            this.y.q(azsVar);
            this.x = null;
        }
    }

    public final boolean n(xvq xvqVar) {
        return s(xvqVar) == 4;
    }

    public final boolean o() {
        return (p() || this.e.l()) ? false : true;
    }

    public final boolean p() {
        xvq xvqVar = this.f;
        return (xvqVar == null || xvqVar.l()) ? false : true;
    }

    public final boolean q(xvq xvqVar) {
        xtl xtlVar = (xtl) this.b.io();
        if (xtlVar == null) {
            return false;
        }
        this.j.o().ap(false, 19);
        return xtlVar.a(xvqVar.a);
    }

    public final boolean r(asee aseeVar, Consumer consumer) {
        yco ycoVar;
        xvq xvqVarA = a(aseeVar.c);
        boolean z = false;
        if (xvqVarA == null) {
            return false;
        }
        if (xrx.j(xvqVarA.a)) {
            xvp xvpVarA = this.t.a(xvqVarA.c());
            if (xvpVarA != null && xvpVarA.e) {
                z = true;
            }
            xzs xzsVar = this.A;
            aihf aihfVarCreateBuilder = alwt.a.createBuilder();
            aklk aklkVar = aseeVar.d;
            if (aklkVar == null) {
                aklkVar = aklk.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            alwt alwtVar = (alwt) aihfVarCreateBuilder.instance;
            aklkVar.getClass();
            alwtVar.e = aklkVar;
            alwtVar.b |= 16;
            xyh xyhVar = new xyh();
            xyhVar.c(z);
            xzsVar.f(aihfVarCreateBuilder, xyhVar.a());
        } else {
            if (n(xvqVarA) || (ycoVar = this.u.e) == null || !xvqVarA.c().equals(this.e.c())) {
                return false;
            }
            consumer.r(ycoVar);
        }
        return true;
    }

    public final int s(xvq xvqVar) {
        if (xvqVar.l()) {
            return 4;
        }
        dii diiVar = xvqVar.a;
        if (xrx.j(diiVar)) {
            return 2;
        }
        return (xsa.e(diiVar) || xsa.g(diiVar) || this.k.d(diiVar)) ? 3 : 1;
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void jv(xzc xzcVar) {
    }
}
