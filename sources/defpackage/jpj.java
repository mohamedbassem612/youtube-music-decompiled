package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpj extends ViewOutlineProvider {
    final /* synthetic */ PlayerBottomSheet a;

    public jpj(PlayerBottomSheet playerBottomSheet) {
        this.a = playerBottomSheet;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        PlayerBottomSheet playerBottomSheet = this.a;
        int dimensionPixelSize = playerBottomSheet.getResources().getDimensionPixelSize(R.dimen.player_bottom_sheet_corner_radius);
        outline.setRoundRect(0, 0, playerBottomSheet.getWidth(), playerBottomSheet.getHeight() + dimensionPixelSize, dimensionPixelSize);
    }
}
