package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xny implements aheh {
    final /* synthetic */ tge a;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ xoc c;
    final /* synthetic */ xwc d;
    final /* synthetic */ yaa e;

    public xny(xoc xocVar, tge tgeVar, StringBuilder sb, xwc xwcVar, yaa yaaVar) {
        this.a = tgeVar;
        this.b = sb;
        this.d = xwcVar;
        this.e = yaaVar;
        this.c = xocVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) xoc.a.b().i(agso.a, "MDX.com.google.android.libraries.youtube.mdx.discovery.DialYouTubeTvLauncher")).j(th)).k("com/google/android/libraries/youtube/mdx/discovery/DialYouTubeTvLauncher$1", "onFailure", (char) 197, "DialYouTubeTvLauncher.java")).t("Failed to fetch receiver app version from DataStore, using default.");
        this.c.c(this.a, this.b, "", this.d, this.e);
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                switch (Integer.parseInt(str)) {
                    case 1:
                        str2 = "&loader=rc";
                        break;
                    case 2:
                        str2 = "&loader=trunk";
                        break;
                    case 3:
                        str2 = "&loader=wr";
                        break;
                    case 4:
                        str2 = "&loader=wrrc";
                        break;
                    case 5:
                        str2 = "&loader=wrtrunk";
                        break;
                    case 6:
                        str2 = "&loader=wg";
                        break;
                    case 7:
                        str2 = "&loader=wgrc";
                        break;
                    case 8:
                        str2 = "&loader=wgtrunk";
                        break;
                }
            } catch (NumberFormatException unused) {
            }
        }
        String str3 = str2;
        StringBuilder sb = this.b;
        this.c.c(this.a, sb, str3, this.d, this.e);
    }
}
