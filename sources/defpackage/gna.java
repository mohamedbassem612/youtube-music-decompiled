package defpackage;

import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gna implements advm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public gna(hbo hboVar, int i) {
        this.$cid = i;
        this.a = hboVar;
    }

    @Override // defpackage.advm
    public final void a() {
        switch (this.$cid) {
            case 0:
                gnf gnfVar = (gnf) this.a;
                gnfVar.S(true, 1, Optional.of(hmy.P(gnfVar.s.b(), gnfVar.k)));
                break;
            case 1:
                gms gmsVar = (gms) this.a;
                gmsVar.hF(gmsVar.H);
                break;
            case 2:
                ((grx) this.a).a.b();
                break;
            case 3:
                ((vta) this.a).Y(true);
                break;
            case 4:
                ((ilv) this.a).O();
                break;
            case 5:
                ioc iocVar = (ioc) this.a;
                iocVar.i(iocVar.x);
                LoadingFrameLayout loadingFrameLayout = iocVar.v;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.h(2);
                }
                break;
            case 6:
                iog iogVar = (iog) this.a;
                iogVar.e(iogVar.F);
                break;
            default:
                jjm jjmVar = (jjm) this.a;
                hek hekVar = jjmVar.y;
                if (hekVar != null) {
                    jjmVar.m((heh) hekVar);
                }
                break;
        }
    }

    public /* synthetic */ gna(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
