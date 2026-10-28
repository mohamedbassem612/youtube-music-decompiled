package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ihc implements aheh {
    final /* synthetic */ RemoteViews a;
    final /* synthetic */ Context b;
    final /* synthetic */ int c;

    public ihc(RemoteViews remoteViews, Context context, int i) {
        this.a = remoteViews;
        this.b = context;
        this.c = i;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ihd.c(this.b, this.c, this.a);
    }

    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        ihj ihjVar = (ihj) obj;
        Bitmap bitmap = ihjVar.a;
        auiu auiuVar = ihjVar.b;
        RemoteViews remoteViews = this.a;
        remoteViews.setImageViewBitmap(R.id.album_art, bitmap);
        remoteViews.setTextColor(R.id.trackname, ihk.a(auiuVar.e));
        int i = auiuVar.f;
        remoteViews.setTextColor(R.id.dash, ihk.a(i));
        remoteViews.setTextColor(R.id.byline, ihk.a(i));
        remoteViews.setInt(R.id.widget_right_panel, "setBackgroundColor", ihk.a(auiuVar.a));
        ihd.c(this.b, this.c, remoteViews);
    }
}
