package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyj implements hyi {
    public final cf a;
    private final agfr b;
    private final aunn c;

    public hyj(cf cfVar, aunn aunnVar) {
        cfVar.getClass();
        this.a = cfVar;
        this.c = aunnVar;
        new adyj(cfVar, cfVar.getString(R.string.dismiss_queue));
        this.b = aguu.al(new cbr(this, 8));
    }

    @Override // defpackage.hyi
    public final anfv a() {
        if (gzj.ah((abvk) this.c.io())) {
            return null;
        }
        return (anfv) this.b.io();
    }
}
