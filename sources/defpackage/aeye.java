package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeye extends axx {
    final /* synthetic */ NavigationMenuItemView a;

    public aeye(NavigationMenuItemView navigationMenuItemView) {
        this.a = navigationMenuItemView;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        NavigationMenuItemView navigationMenuItemView = this.a;
        bbzVar.s(navigationMenuItemView.c);
        bbzVar.K(navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
    }
}
