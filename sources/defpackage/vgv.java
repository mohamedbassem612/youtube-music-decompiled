package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgv extends uib {
    private final cf a;
    private final adhv b;
    private final vhl c;

    public vgv(cf cfVar, adhv adhvVar, vhl vhlVar) {
        super(cfVar, cfVar.getSupportFragmentManager(), true, false);
        this.a = cfVar;
        this.b = adhvVar;
        this.c = vhlVar;
    }

    @Override // defpackage.uib
    protected final View b() {
        int i;
        cf cfVar = this.a;
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(cfVar, R.style.ReelsBottomSheetDialog)).inflate(R.layout.link_sticker_usage_exceeded, (ViewGroup) null);
        YouTubeTextView youTubeTextView = (YouTubeTextView) viewInflate.findViewById(R.id.sticker_usage_exceeded_title);
        Context applicationContext = cfVar.getApplicationContext();
        vhl vhlVar = this.c;
        try {
            long epochMilli = vhl.a - (vhlVar.c.f().toEpochMilli() - ((vlg) vhlVar.e.c().get()).c);
            TimeUnit timeUnit = TimeUnit.DAYS;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            i = (int) (epochMilli / 86400000);
        } catch (Exception e) {
            ((agrc) ((agrc) ((agrc) vhl.b.b()).j(e)).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/StickerUsageLimiter", "getSelfPromotionStickerWaitTime", (char) 197, "StickerUsageLimiter.java")).t("Could not read from protoStore");
            i = 0;
        }
        if (i == 0) {
            i = 1;
        }
        youTubeTextView.setText(applicationContext.getResources().getQuantityString(R.plurals.sticker_dialog_title, i, Integer.valueOf(i)));
        this.b.g((ImageView) viewInflate.findViewById(R.id.artwork), Uri.parse("https://www.gstatic.com/youtube/img/stories/sticker_usage_exceeded_artwork.png"));
        return viewInflate;
    }

    @Override // defpackage.uib
    protected final String c() {
        return this.a.getResources().getString(R.string.stories_add_link_header);
    }
}
