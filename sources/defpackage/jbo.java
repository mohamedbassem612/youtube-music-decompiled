package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipLoadingIndicator;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbo extends admr {
    public final ChipCloudChipView a;
    public ixi b;
    public izb c;
    public izb d;
    public ajsy e;
    public avmn f;
    private final vxe g;
    private final aunn h;
    private final Context i;
    private izd j;
    private boolean k;

    public jbo(Context context, vxe vxeVar, aunn aunnVar) {
        this.g = vxeVar;
        aunnVar.getClass();
        this.h = aunnVar;
        vxeVar.getClass();
        this.a = new ChipCloudChipView(context);
        this.i = context;
    }

    private final void g(ChipCloudChipView chipCloudChipView, ViewGroup.LayoutParams layoutParams, boolean z) {
        Resources resources = this.i.getResources();
        layoutParams.height = z ? resources.getDimensionPixelSize(R.dimen.cloud_chip_height) : -2;
        layoutParams.width = z ? resources.getDimensionPixelSize(R.dimen.cloud_chip_height) : -2;
        chipCloudChipView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        ixi ixiVar;
        izd izdVar = this.j;
        if (izdVar == null || this.e == null) {
            return;
        }
        izdVar.c();
        this.c = null;
        this.d = null;
        if ((this.e.b & SemanticState.LiveRegion) != 0) {
            ((abxv) this.h.io()).L(this.e.l);
        }
        Object obj = this.f;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.f = null;
        }
        if (this.k && (ixiVar = this.b) != null) {
            ixiVar.e();
            this.k = false;
        }
        this.b = null;
        ChipCloudChipView chipCloudChipView = this.a;
        chipCloudChipView.setOnClickListener(null);
        chipCloudChipView.setContentDescription(null);
    }

    @Override // defpackage.admr
    protected final /* synthetic */ void d(adly adlyVar, Object obj) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        alay alayVar;
        this.e = (ajsy) obj;
        ixi ixiVar = (ixi) adlyVar.c("chipCloudController");
        if (ixiVar == null) {
            ixiVar = new ixi();
            this.k = true;
        }
        this.b = ixiVar;
        ChipCloudChipView chipCloudChipView = this.a;
        this.j = new izd(chipCloudChipView, this.e.m.G(), adlyVar.b);
        vxe vxeVar = this.g;
        xgn xgnVar = adlyVar.b;
        ajsy ajsyVar = this.e;
        if ((ajsyVar.b & 4) != 0) {
            ajwoVar = ajsyVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.c = izb.c(vxeVar, xgnVar, ajwoVar, adlyVar.e(), new hpf(this, adlyVar, 5));
        xgn xgnVar2 = adlyVar.b;
        ajsy ajsyVar2 = this.e;
        if ((ajsyVar2.b & 8) != 0) {
            ajwoVar2 = ajsyVar2.h;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
        } else {
            ajwoVar2 = null;
        }
        this.d = izb.c(vxeVar, xgnVar2, ajwoVar2, adlyVar.e(), new hpf(this, adlyVar, 6));
        this.j.b(new izc() { // from class: jbn
            @Override // defpackage.izc
            public final void a() {
                izb izbVar;
                ixi ixiVar2;
                jbo jboVar = this.a;
                boolean z = jboVar.e.k;
                if (z && (ixiVar2 = jboVar.b) != null && ixiVar2.d == ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_SINGLE_SELECT_ALWAYS_SELECTED) {
                    return;
                }
                if (!z || (izbVar = jboVar.d) == null) {
                    izb izbVar2 = jboVar.c;
                    if (izbVar2 != null) {
                        izbVar2.a();
                    }
                } else {
                    izbVar.a();
                }
                if (jboVar.b != null) {
                    ixe ixeVar = new ixe(jboVar, 3);
                    if (!jboVar.b.e || jboVar.e.p) {
                        ixeVar.run();
                        return;
                    }
                    ChipCloudChipView chipCloudChipView2 = jboVar.a;
                    aedf aedfVar = chipCloudChipView2.d;
                    if (aedfVar != null) {
                        aedfVar.a();
                        aedfVar.setVisible(true, true);
                    } else {
                        ChipCloudChipLoadingIndicator chipCloudChipLoadingIndicator = chipCloudChipView2.e;
                        chipCloudChipLoadingIndicator.setMinimumHeight(chipCloudChipView2.getHeight());
                        chipCloudChipLoadingIndicator.setVisibility(0);
                        chipCloudChipLoadingIndicator.a.execute(afwl.i(new ixe(chipCloudChipLoadingIndicator, 0)));
                    }
                    Object obj2 = jboVar.f;
                    if (obj2 != null) {
                        awka.f((AtomicReference) obj2);
                    }
                    jboVar.f = jboVar.b.a.P().al(new gkr(jboVar, ixeVar, 15), new ido(18));
                }
            }
        });
        if ((this.e.b & SemanticState.LiveRegion) != 0) {
            ((abxv) this.h.io()).J(this.e.l, chipCloudChipView);
        }
        chipCloudChipView.a(this.e);
        if (adlyVar.j("chipCloudChipEnableUnlimitedWidth")) {
            chipCloudChipView.c.setMaxWidth(Alert.DURATION_SHOW_INDEFINITELY);
        }
        if (gzj.I(this.e)) {
            ViewGroup.LayoutParams layoutParams = chipCloudChipView.getLayoutParams();
            if (layoutParams != null) {
                g(chipCloudChipView, layoutParams, true);
            }
            chipCloudChipView.setVisibility(4);
            chipCloudChipView.c("");
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = chipCloudChipView.getLayoutParams();
        if (layoutParams2 != null) {
            g(chipCloudChipView, layoutParams2, false);
        }
        ajsy ajsyVar3 = this.e;
        if ((ajsyVar3.b & 2) != 0) {
            alayVar = ajsyVar3.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        chipCloudChipView.c(ackj.k(null, alayVar, null, false));
        aiqe aiqeVar = this.e.j;
        if (aiqeVar == null) {
            aiqeVar = aiqe.a;
        }
        aiqd aiqdVar = aiqeVar.c;
        if (aiqdVar == null) {
            aiqdVar = aiqd.a;
        }
        if ((aiqdVar.b & 2) != 0) {
            aiqe aiqeVar2 = this.e.j;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            aiqd aiqdVar2 = aiqeVar2.c;
            if (aiqdVar2 == null) {
                aiqdVar2 = aiqd.a;
            }
            chipCloudChipView.setContentDescription(aiqdVar2.c);
        } else {
            chipCloudChipView.setContentDescription(null);
        }
        chipCloudChipView.setVisibility(0);
    }

    @Override // defpackage.admr
    protected final /* synthetic */ byte[] e(Object obj) {
        return ((ajsy) obj).m.G();
    }
}
