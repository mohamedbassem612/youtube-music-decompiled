package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class scj extends sbk implements sog, sah, sai {
    private final awmd a;
    private final vyo b;
    private final sci c;
    private String d;

    public scj(awmd awmdVar, vyo vyoVar, sci sciVar) {
        this.a = awmdVar;
        this.b = vyoVar;
        this.c = sciVar;
    }

    @Override // defpackage.sah
    public final void W(smr smrVar, sko skoVar) {
        if (smrVar.c() == aixo.SLOT_TYPE_PLAYER_BYTES && skoVar.b == aixg.LAYOUT_TYPE_MEDIA) {
            this.d = skoVar.a;
        }
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(snp.class);
    }

    @Override // defpackage.sai
    public final void b(smr smrVar, sko skoVar, int i) {
        if (TextUtils.equals(skoVar.a, this.d)) {
            this.d = null;
        }
    }

    @Override // defpackage.sog
    public final void y() {
        if (this.d == null) {
            if (taq.aI(this.b)) {
                rmp.n(null, "Ping migration VisitAdvertiserLinkClickedTriggerAdapter has no active media layout for click event");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : this.g.aa()) {
            snp snpVar = (snp) sniVar.b;
            if (TextUtils.equals(snpVar.b, this.d) && (!snpVar.a || !this.c.a(snpVar.c))) {
                arrayList.add(sniVar);
            }
        }
        if (!arrayList.isEmpty()) {
            ((rsk) this.a.io()).q(arrayList);
        } else if (taq.aI(this.b)) {
            rmp.n(null, "Ping migration VisitAdvertiserLinkClickedTriggerAdapter has null triggered bundle for click event");
        }
    }

    @Override // defpackage.sog
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void u(int i, int i2) {
    }
}
