package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyr implements abhf, hyi {
    private static final agke e = agke.s("en_US", "en_CA", "es_MX");
    public final cf a;
    public boolean b;
    public final hyf c;
    public final adyj d;
    private final agfr f;

    public hyr(cf cfVar, hyf hyfVar) {
        cfVar.getClass();
        this.a = cfVar;
        this.d = new adyj(cfVar, cfVar.getString(R.string.subtitles));
        this.f = aguu.al(new cbr(this, 12));
        this.c = hyfVar;
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (this.b) {
            return (anfv) this.f.io();
        }
        return null;
    }

    @Override // defpackage.abhf
    public final void b(boolean z) {
        cf cfVar = this.a;
        aduk adukVar = e.contains(cfVar.getResources().getConfiguration().locale.toString()) ? new aduk(cfVar, R.drawable.yt_outline_closed_caption_vd_theme_24) : new aduk(cfVar, R.drawable.quantum_ic_subtitles_vd_theme_24);
        if (z) {
            adukVar.d(R.color.quantum_white_100);
        } else {
            adukVar.d(R.color.quantum_grey600);
        }
        this.d.f = adukVar.a();
    }
}
