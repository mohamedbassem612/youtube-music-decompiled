package defpackage;

import com.google.android.apps.youtube.music.mediabrowser.androidautoprojected.AndroidAutoCarAppServices;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yd implements bog {
    public final boh a;
    public final xr b;
    public final /* synthetic */ AndroidAutoCarAppServices c;
    private final boh d;
    private final bof e;

    public yd(AndroidAutoCarAppServices androidAutoCarAppServices) {
        this.c = androidAutoCarAppServices;
        yc ycVar = new yc(this, 0);
        this.e = ycVar;
        boh bohVar = new boh(this);
        this.d = bohVar;
        this.a = new boh(this);
        bohVar.b(ycVar);
        this.b = new xr(bohVar, new xv());
    }

    public final xr a() {
        xr xrVar = this.b;
        xrVar.getClass();
        return xrVar;
    }

    public final void b(boa boaVar) {
        this.d.e(boaVar);
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return this.a;
    }
}
