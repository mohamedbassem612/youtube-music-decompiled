package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wto extends wnn implements wnf {
    public static final agkz c = agkz.q(alxr.SEARCH_PAGE_TYPE_AI_SEARCH, alxr.SEARCH_PAGE_TYPE_LANDING);
    public final wtl d;
    private final zwb e;
    private final vyo f;
    private final String g;
    private final boolean h;
    private final Set i;
    private final tbt j;
    private final vxz k;

    public wto(abxv abxvVar, zwb zwbVar, tgg tggVar, vxu vxuVar, Set set, wtl wtlVar, tbt tbtVar, vyo vyoVar, vxz vxzVar) {
        super(abxvVar, tggVar);
        this.e = zwbVar;
        this.g = "search";
        set.getClass();
        this.i = set;
        this.d = wtlVar;
        this.h = vys.a(vxuVar);
        tbtVar.getClass();
        this.j = tbtVar;
        this.f = vyoVar;
        this.k = vxzVar;
    }

    @Override // defpackage.wnf
    public final /* bridge */ /* synthetic */ wlu a(acjx acjxVar) {
        wtm wtmVarH = h();
        wtmVarH.q(acjxVar);
        return wtmVarH;
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture b(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    @Override // defpackage.wnf
    public final void c(wlu wluVar, wne wneVar, zza zzaVar) {
        this.d.k((wtm) wluVar, wneVar, zzaVar, g());
    }

    @Override // defpackage.wnf
    public final /* synthetic */ ListenableFuture d(wlu wluVar, wne wneVar, Executor executor) {
        return zik.ch(this, wluVar, wneVar);
    }

    public final wlt g() {
        vyo vyoVar = this.f;
        if (vyoVar.b() != null) {
            anin aninVar = vyoVar.b().g;
            if (aninVar == null) {
                aninVar = anin.a;
            }
            apnu apnuVar = aninVar.g;
            if (apnuVar == null) {
                apnuVar = apnu.a;
            }
            if (apnuVar.b) {
                ahfi ahfiVarB = wlt.b(apnuVar.c);
                ahfiVarB.a = new hyl(vyoVar, 5);
                ahfiVarB.i(new wix(4));
                return ahfiVarB.g();
            }
        }
        return null;
    }

    public final wtm h() {
        tez tezVar = new tez(this.j, new xng(), new xng(), null, null);
        zwb zwbVar = this.e;
        wtm wtmVar = new wtm(this.b, zwbVar.e(), this.h, this.k.m(54, 45415635L));
        wtmVar.x = tezVar;
        agqr it = ((agpr) this.i).iterator();
        while (it.hasNext()) {
            ((wtn) it.next()).a();
        }
        return wtmVar;
    }
}
