package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyh implements hyi {
    public final cf a;
    public boolean b;
    public final hxs c;
    public final adyj d;
    private final agfr e;

    public hyh(cf cfVar, hxs hxsVar) {
        this.a = cfVar;
        adyj adyjVar = new adyj(cfVar, cfVar.getString(R.string.audio_tracks_title));
        this.d = adyjVar;
        aduk adukVar = new aduk(cfVar, R.drawable.yt_outline_globe_white_24);
        adukVar.d(R.color.quantum_grey600);
        adyjVar.f = adukVar.a();
        this.e = aguu.al(new cbr(this, 7));
        this.c = hxsVar;
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (this.b) {
            return (anfv) this.e.io();
        }
        return null;
    }
}
