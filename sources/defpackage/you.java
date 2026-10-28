package defpackage;

import android.net.Uri;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class you extends zir {
    private final wiu b;
    private final zha c;
    private Exception d;
    private boolean e;
    private boolean f;
    private Uri g;
    private int h;
    private final ywn i;
    private String j;
    private final tfq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public you(byw bywVar, tfq tfqVar, wiu wiuVar, zha zhaVar, ywn ywnVar) {
        super(bywVar);
        zkf.d(bywVar);
        zkf.d(tfqVar);
        this.k = tfqVar;
        zkf.d(wiuVar);
        this.b = wiuVar;
        zkf.d(zhaVar);
        this.c = zhaVar;
        this.i = ywnVar;
    }

    private final void h(byt bytVar) {
        if (this.k.h()) {
            if ((bytVar instanceof zhm) && ((zhm) bytVar).e == 204) {
                return;
            }
            if ((bytVar instanceof zhn) && "x-segment-lmt".equals(((zhn) bytVar).e)) {
                return;
            }
            if (this.e) {
                this.f = true;
            } else {
                this.d = bytVar;
                this.h++;
            }
        }
    }

    private final void i() {
        if (this.e) {
            return;
        }
        this.h = 0;
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byt {
        try {
            int iA = super.a(bArr, i, i2);
            i();
            return iA;
        } catch (byt e) {
            h(e);
            throw e;
        }
    }

    @Override // defpackage.zir, defpackage.byw, defpackage.bye
    public final long b(byi byiVar) throws byt {
        Uri uriBuild = byiVar.a;
        zkf.d(uriBuild);
        wiu wiuVar = this.b;
        boolean zAX = wiuVar.aX();
        Uri uri = this.g;
        if (!(zAX ? yno.f(uriBuild, uri) : uriBuild.equals(uri))) {
            Exception exc = this.d;
            if (exc == null || !(exc.getCause() instanceof SocketTimeoutException)) {
                this.d = null;
                this.e = false;
                this.f = false;
                this.h = 0;
            }
            this.g = uriBuild;
        }
        if (!wiuVar.af() || this.h <= wiuVar.r() || this.f) {
            this.e = false;
        } else {
            String authority = uriBuild.getAuthority();
            Uri.Builder builderAuthority = uriBuild.buildUpon().authority("redirector.googlevideo.com");
            zkf.d(authority);
            if (authority.endsWith(".a1.googlevideo.com")) {
                uriBuild = builderAuthority.appendQueryParameter("cmo", "pf=1").appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
            } else if (authority.endsWith(".googlevideo.com")) {
                uriBuild = builderAuthority.appendQueryParameter("cmo", "pf=1").build();
            } else if (authority.endsWith("c.youtube.com")) {
                uriBuild = builderAuthority.appendQueryParameter("cmo", "td=c.youtube.com").build();
            }
            byiVar = byiVar.c(uriBuild);
            this.e = true;
        }
        if (yno.aA(wiuVar, byiVar, this.j)) {
            this.i.w("ppp", "bf");
            this.j = byiVar.a.getQueryParameter("cpn");
        }
        try {
            long jB = super.b(byiVar);
            this.c.m(super.k(), super.d());
            i();
            return jB;
        } catch (byt e) {
            h(e);
            throw e;
        }
    }
}
