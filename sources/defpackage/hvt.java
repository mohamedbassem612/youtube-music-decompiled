package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hvt extends iyu {
    View k;
    View l;
    public ImageView m;
    public DialogInterface.OnDismissListener n;
    public int o = 1;

    public final void i() {
        View view = this.k;
        if (view != null) {
            view.setVisibility(this.o == 2 ? 0 : 8);
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setVisibility(this.o != 1 ? 8 : 0);
        }
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(1, 0);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.connection_pending_dialog_fragment, viewGroup, true);
        this.m = (ImageView) viewInflate.findViewById(R.id.background_thumbnail);
        this.l = viewInflate.findViewById(R.id.connecting_layout);
        this.k = viewInflate.findViewById(R.id.error);
        i();
        return viewInflate;
    }

    @Override // defpackage.bp, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            ((hvu) onDismissListener).a();
        }
    }
}
