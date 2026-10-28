package defpackage;

import android.text.TextUtils;
import com.google.cardboard.sdk.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xwv {
    protected final awmd a;
    public aazk b;
    public arij c;
    public final abvn d;
    protected final mbc f;
    public String h;
    private final vxz k;
    private final ci l;
    public final xqy j = new xqy(this);
    public final xqy i = new xqy(this);
    public final avmm e = new avmm();
    public final AtomicBoolean g = new AtomicBoolean(false);

    public xwv(awmd awmdVar, abvn abvnVar, vxz vxzVar, ci ciVar, mbc mbcVar) {
        this.a = awmdVar;
        this.d = abvnVar;
        this.k = vxzVar;
        this.l = ciVar;
        this.f = mbcVar;
    }

    protected abstract int a();

    protected abstract xyv b(xyv xyvVar);

    protected abstract String c();

    protected Optional d() {
        return Optional.empty();
    }

    public xyv e() {
        arij arijVar;
        aigj aigjVar;
        abvk abvkVar = (abvk) this.a.io();
        String strN = this.h;
        if (strN == null) {
            strN = abvkVar.n();
        }
        acfw acfwVarH = abvkVar.h();
        wjf wjfVarC = acfwVarH == null ? null : acfwVarH.c();
        boolean z = true;
        boolean z2 = wjfVarC != null && wjfVarC.f().ax();
        boolean andSet = this.g.getAndSet(false);
        if (TextUtils.isEmpty(strN) || z2) {
            return b(xyv.a);
        }
        abnl abnlVar = abvkVar.f(0).a;
        if (abnlVar != null) {
            ajwo ajwoVar = abnlVar.b;
            aigjVar = ajwoVar == null ? null : ajwoVar.c;
            if (ajwoVar == null) {
                arijVar = this.c;
            } else {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                arijVar = (arij) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            }
        } else {
            arijVar = this.c;
            aigjVar = null;
        }
        xyv xyvVar = xyv.a;
        xyu xyuVar = new xyu();
        xyuVar.n(strN);
        xyuVar.l(Integer.valueOf(a()));
        xyuVar.c(yno.cU(wjfVarC, this.b, acfwVarH, this.f));
        xyuVar.m(abvkVar.g());
        xyuVar.k(aigjVar == null ? null : aigjVar.G());
        xyuVar.e(arijVar == null ? null : arijVar.l);
        xyuVar.j(arijVar != null ? arijVar.h : null);
        xyuVar.h(wjfVarC == null ? "" : wjfVarC.t().v);
        String strC = c();
        if (strC != null) {
            xyuVar.f(strC);
        }
        vxz vxzVar = this.k;
        if (vxzVar.l(96, 45460566L, false)) {
            if (abvkVar.X() || (vxzVar.l(164, 45673420L, false) && andSet)) {
                z = false;
            }
            xyuVar.d(z);
        }
        xyuVar.g(andSet);
        if (vxzVar.l(R.styleable.AppCompatTheme_windowNoTitle, 45630215L, false) && aavv.f(wjfVarC)) {
            xyuVar.b(this.l.ap());
        }
        d().isPresent();
        return b(xyuVar.a());
    }
}
