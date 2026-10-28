package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gxu implements DialogInterface.OnShowListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gxu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                gxx gxxVar = (gxx) obj;
                gxxVar.e.requestFocus();
                gxxVar.e.post(new gnc(obj, 17));
                break;
            case 1:
                gti gtiVar = (gti) this.a;
                EditText editText = gtiVar.f;
                if (editText != null) {
                    editText.requestFocus();
                    gtiVar.f.post(new gnc(this, 15));
                }
                break;
            case 2:
                hre hreVar = (hre) this.a;
                ScrollView scrollView = hreVar.a;
                if (scrollView != null) {
                    hreVar.g = scrollView.getChildAt(0).getHeight();
                    ViewGroup.LayoutParams layoutParams = hreVar.a.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = hreVar.g;
                        hreVar.a.setLayoutParams(layoutParams);
                    }
                }
                break;
            case 3:
                if (dialogInterface != null) {
                    jmg jmgVar = (jmg) this.a;
                    if (jmgVar.ap != aolh.PANEL_EXPANDED_STYLE_WRAP_CONTENT) {
                        ((aevw) dialogInterface).a().I(3);
                    } else {
                        ((aevw) dialogInterface).a().Q(jmgVar.k());
                    }
                }
                break;
            case 4:
                ((AlertDialog) this.a).getButton(-1).setAllCaps(false);
                break;
            case 5:
                ((srd) this.a).h();
                break;
            case 6:
                ((srd) this.a).h();
                break;
            case 7:
                sui suiVar = (sui) this.a;
                if (suiVar.j.i.size() > 0) {
                    suiVar.a.d(suiVar.j.i, null);
                }
                break;
            default:
                Object obj2 = this.a;
                uii uiiVar = (uii) obj2;
                if (uiiVar.p.getChildCount() == 0 && uiiVar.n.getText().length() == 0) {
                    if (!uiiVar.n()) {
                        ((agrc) ((agrc) uii.k.c()).k("com/google/android/libraries/youtube/creation/common/ui/bottomsheet/CreationBottomSheetDialog", "onCreateDialog", 396, "CreationBottomSheetDialog.java")).t("Invalid fragment state while attempting to dismiss (empty contents)");
                    } else {
                        ((bp) obj2).dismiss();
                    }
                    break;
                } else if (uiiVar.r != null && uiiVar.n()) {
                    uiiVar.r.j();
                    break;
                }
                break;
        }
    }

    public gxu(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
