package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ydg extends ydh {
    public ydf a;
    public xyk b;

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onActivityCreated */
    public final void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m656lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        Bundle arguments = getArguments();
        boolean z = arguments != null && arguments.getBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", false);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) getActivity();
        ydf ydfVar = this.a;
        xvz xvzVar = tvSignInActivity.d;
        int i = tvSignInActivity.f;
        if (z && i != 2) {
            ydfVar.n.a(xvzVar, "canceled");
        }
        xgn xgnVar = ydfVar.e;
        xgnVar.l(new xgj(xhb.b(36380)));
        if (ydfVar.d.u()) {
            rmw rmwVar = ydfVar.b;
            if (rmwVar.c() != null) {
                ydfVar.m = rmwVar.c();
                ydfVar.g.setVisibility(0);
                ydfVar.l.setVisibility(8);
                Spanned spanned = ydfVar.m.d;
                ydfVar.i.setText(spanned);
                ydfVar.j.setText(ydfVar.m.b);
                abuz abuzVar = ydfVar.m.g;
                if (abuzVar != null) {
                    ydfVar.c.h(ydfVar.h, abuzVar.l());
                }
                ydfVar.k.setText(ydfVar.a.getResources().getString(R.string.mdx_tvsignin_account_chooser_continue_as, spanned));
                xgnVar.l(new xgj(xhb.b(36381)));
                xgnVar.l(new xgj(xhb.b(36384)));
                return;
            }
        }
        ydfVar.g.setVisibility(8);
        ydfVar.l.setVisibility(0);
        xgnVar.l(new xgj(xhb.b(36383)));
    }

    @Override // defpackage.cc
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            ydf ydfVar = this.a;
            String stringExtra = intent.getStringExtra("authAccount");
            stringExtra.getClass();
            ydfVar.b(stringExtra);
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ydf ydfVar = this.a;
        View viewInflate = layoutInflater.inflate(R.layout.mdx_tvsignin_account_chooser_fragment, viewGroup, false);
        viewInflate.findViewById(R.id.cancel_button).setOnClickListener(new yde(ydfVar, 1));
        ydfVar.g = viewInflate.findViewById(R.id.profile);
        ydfVar.h = (ImageView) viewInflate.findViewById(R.id.thumbnail);
        ydfVar.i = (TextView) viewInflate.findViewById(R.id.name);
        ydfVar.j = (TextView) viewInflate.findViewById(R.id.email);
        ydfVar.k = (TextView) viewInflate.findViewById(R.id.continue_as_button);
        ydfVar.k.setOnClickListener(new yde(ydfVar, 0));
        viewInflate.findViewById(R.id.switch_accounts_button).setOnClickListener(new yde(ydfVar, 2));
        ydfVar.l = viewInflate.findViewById(R.id.sign_in_button);
        ydfVar.l.setOnClickListener(new yde(ydfVar, 3));
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        if (this.a.f) {
            this.b.a(((TvSignInActivity) getActivity()).d, "canceled");
        }
    }
}
