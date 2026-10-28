package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xnz implements yeb {
    final /* synthetic */ String a;
    final /* synthetic */ xoc b;
    final /* synthetic */ xwc c;
    final /* synthetic */ yaa d;

    public xnz(xoc xocVar, xwc xwcVar, yaa yaaVar, String str) {
        this.c = xwcVar;
        this.d = yaaVar;
        this.a = str;
        this.b = xocVar;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        this.d.c(-1, 4, -1);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        String str;
        String strA;
        int i = tgoVar.a;
        if (i < 200 || i >= 400) {
            if (i >= 400 && i < 500) {
                this.d.c(i, 2, -1);
                return;
            }
            yaa yaaVar = this.d;
            if (i >= 500) {
                yaaVar.c(i, 0, -1);
                return;
            } else {
                yaaVar.c(i, 5, -1);
                return;
            }
        }
        xoc xocVar = this.b;
        xwc xwcVar = this.c;
        yaa yaaVar2 = this.d;
        xocVar.b.a(new twp(-1, xwcVar, yaaVar2));
        tfz tfzVar = tgoVar.c;
        Uri uri = null;
        Uri uri2 = (tfzVar.a("LOCATION") == null || (strA = tfzVar.a("LOCATION")) == null) ? null : Uri.parse(strA);
        if (uri2 != null && uri2.getHost() == null) {
            uri2 = null;
        }
        if (uri2 == null || (str = this.a) == null || str.equals(uri2.getHost())) {
            uri = uri2;
        } else {
            ((agrc) ((agrc) xoc.a.c().i(agso.a, "MDX.com.google.android.libraries.youtube.mdx.discovery.DialYouTubeTvLauncher")).k("com/google/android/libraries/youtube/mdx/discovery/DialYouTubeTvLauncher$2", "handleResponse", 255, "DialYouTubeTvLauncher.java")).B("Mismatched host in LOCATION header. Target: %s, Location: %s", str, uri2.getHost());
        }
        yay yayVar = (yay) yaaVar2.a;
        yayVar.E.l(5);
        agrx agrxVar = agso.a;
        xvn xvnVar = yayVar.k;
        yayVar.j = uri;
    }
}
