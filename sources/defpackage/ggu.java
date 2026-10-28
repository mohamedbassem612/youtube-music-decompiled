package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggu {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    @Deprecated
    public ggu(gal galVar) {
        this.c = "googleads.g.doubleclick.net";
        this.d = "/pagead/ads";
        this.e = "ad.doubleclick.net";
        this.b = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.a = galVar;
    }

    public final Uri a(Uri uri, String str) throws gaq {
        try {
            if (uri == null) {
                throw null;
            }
            int i = 0;
            try {
                if (uri.getHost().equals(this.e) && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new gaq("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(35);
                    String strSubstring = iIndexOf == -1 ? string : string.substring(0, iIndexOf);
                    String strSubstring2 = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                    String[] strArrSplit = strSubstring.split(";", -1);
                    int i2 = 1;
                    if (strArrSplit.length <= 1) {
                        return Uri.parse(strSubstring + ";dc_ms=" + str + ';' + strSubstring2);
                    }
                    int i3 = 1;
                    while (true) {
                        if (i3 >= strArrSplit.length) {
                            i3 = -1;
                            break;
                        }
                        if (strArrSplit[i3].startsWith("adurl=") || strArrSplit[i3].equals("adurl")) {
                            break;
                        }
                        i3++;
                    }
                    StringBuilder sb = new StringBuilder(strArrSplit[0]);
                    if (i3 != -1) {
                        while (i2 < strArrSplit.length) {
                            sb.append(';');
                            if (i2 == i3) {
                                sb.append("dc_ms");
                                sb.append('=');
                                sb.append(str);
                                sb.append(';');
                            }
                            sb.append(strArrSplit[i2]);
                            i2++;
                        }
                    } else {
                        while (i2 < strArrSplit.length) {
                            sb.append(';');
                            sb.append(strArrSplit[i2]);
                            i2++;
                        }
                        sb.append(';');
                        sb.append("dc_ms");
                        sb.append('=');
                        sb.append(str);
                        sb.append(';');
                    }
                    sb.append(strSubstring2);
                    return Uri.parse(sb.toString());
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new gaq("Query parameter already exists: ms");
            }
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null || encodedQuery.isEmpty()) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            String[] strArrSplit2 = encodedQuery.split("&", -1);
            int i4 = 0;
            while (true) {
                if (i4 >= strArrSplit2.length) {
                    i4 = -1;
                    break;
                }
                if (strArrSplit2[i4].startsWith("adurl=") || strArrSplit2[i4].equals("adurl")) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int length = strArrSplit2.length;
                if (i >= length) {
                    return uri.buildUpon().encodedQuery(sb2.toString()).build();
                }
                if (i == i4) {
                    sb2.append("ms");
                    sb2.append('=');
                    sb2.append(str);
                    sb2.append('&');
                }
                sb2.append(strArrSplit2[i]);
                if (i < length - 1) {
                    sb2.append('&');
                }
                i++;
            }
        } catch (UnsupportedOperationException unused2) {
            throw new gaq("Provided Uri is not in a valid state");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gal, java.lang.Object] */
    @Deprecated
    public final Uri b(Uri uri, Context context) throws gaq {
        try {
            return a(uri, this.a.c(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new gaq("Provided Uri is not in a valid state");
        }
    }

    public ggu(bsm bsmVar) {
        this.c = bsmVar.a;
        this.b = null;
        this.e = bsmVar.c;
        this.a = bsmVar.g;
        this.d = bsmVar.h;
    }

    public ggu(ght ghtVar, gkg gkgVar) {
        this.a = ghtVar;
        this.e = gkgVar;
    }

    @Deprecated
    public ggu() {
        this.e = agpn.b;
        this.a = agpi.a;
    }
}
