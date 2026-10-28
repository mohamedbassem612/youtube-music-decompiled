package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.mediapicker.greenscreen.GreenScreenMediaThumbnailContainer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vdb extends ViewOutlineProvider {
    final /* synthetic */ GreenScreenMediaThumbnailContainer a;

    public vdb(GreenScreenMediaThumbnailContainer greenScreenMediaThumbnailContainer) {
        this.a = greenScreenMediaThumbnailContainer;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.getResources().getDimension(R.dimen.green_screen_media_item_corner_radius));
    }
}
