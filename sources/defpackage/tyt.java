package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyt {
    public String a;
    private final Uri b;
    private final HashMap c;
    private final List d;
    private int e;

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public tyt(Uri uri) {
        int i;
        int i2;
        String strSubstring;
        uri.getClass();
        this.b = uri;
        this.c = new HashMap();
        this.d = new ArrayList();
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            int length = encodedQuery.length();
            if (i3 >= length) {
                return;
            }
            int iIndexOf = encodedQuery.indexOf(61, i3);
            int iIndexOf2 = encodedQuery.indexOf(38, i3);
            if (iIndexOf2 >= 0 && iIndexOf2 < iIndexOf) {
                iIndexOf = -1;
            }
            if (iIndexOf <= 0 || iIndexOf2 <= 0) {
                if (iIndexOf < 0) {
                    length = iIndexOf2 >= 0 ? iIndexOf2 : length;
                    i = length;
                    i2 = i;
                } else {
                    i = iIndexOf + 1;
                    i2 = length;
                }
                String strSubstring2 = encodedQuery.substring(i3, length);
                if (iIndexOf > 0) {
                    strSubstring = encodedQuery.substring(i, i2);
                } else {
                    strSubstring = null;
                }
                j(strSubstring2, strSubstring, null, true, false);
                i3 = i2 + 1;
            } else {
                i2 = iIndexOf2;
                i = iIndexOf + 1;
            }
            length = iIndexOf;
            String strSubstring3 = encodedQuery.substring(i3, length);
            if (iIndexOf > 0) {
                strSubstring = encodedQuery.substring(i, i2);
            } else {
                strSubstring = null;
            }
            j(strSubstring3, strSubstring, null, true, false);
            i3 = i2 + 1;
        }
    }

    private final tys j(String str, String str2, String str3, boolean z, boolean z2) {
        int i = this.e;
        this.e = i + 1;
        tys tysVar = new tys(str, str2, str3, z, z2, i);
        tys tysVar2 = (tys) this.c.put(tysVar.c, tysVar);
        this.d.add(tysVar);
        return tysVar2;
    }

    public final Uri a() {
        Uri.Builder builderBuildUpon = this.b.buildUpon();
        StringBuilder sb = new StringBuilder(SemanticState.Obscured);
        String str = "";
        for (tys tysVar : this.d) {
            if (tysVar != null) {
                sb.append(str);
                boolean z = tysVar.a;
                sb.append(z ? tysVar.c : Uri.encode(tysVar.c));
                if (tysVar.b || tysVar.e != null) {
                    sb.append('=');
                    sb.append(z ? tysVar.e : Uri.encode(tysVar.e, tysVar.d));
                }
                str = "&";
            }
        }
        builderBuildUpon.encodedQuery(sb.toString());
        String str2 = this.a;
        if (str2 != null) {
            builderBuildUpon.authority(str2);
        }
        return builderBuildUpon.build();
    }

    public final String b(String str) {
        tys tysVar = (tys) this.c.get(str);
        if (tysVar != null) {
            return tysVar.e;
        }
        return null;
    }

    public final void c(String str) {
        if (this.c.containsKey("welc")) {
            return;
        }
        j("welc", str, null, true, true);
    }

    public final void d(String str, String str2, String str3) {
        String strB = b(str);
        if (strB == null) {
            j(str, str2, str3, false, true);
        } else {
            e(str, String.format("%s%s%s", strB, ",", str2));
        }
    }

    public final void e(String str, String str2) {
        tys tysVarJ = j(str, str2, null, false, true);
        if (tysVarJ != null) {
            this.d.set(tysVarJ.f, null);
        }
    }

    public final void f(String str, String str2) {
        if (this.c.containsKey(str)) {
            return;
        }
        j(str, str2, null, false, true);
    }

    public final void g(String str, String str2, String str3) {
        if (this.c.containsKey(str)) {
            return;
        }
        j(str, str2, str3, false, true);
    }

    public final void h(String str) {
        tys tysVar = (tys) this.c.remove(str);
        if (tysVar != null) {
            this.d.set(tysVar.f, null);
        }
    }

    public final void i(String str, int i) {
        f(str, String.valueOf(i));
    }

    public final String toString() {
        return a().toString();
    }

    public tyt(tyt tytVar) {
        this.b = tytVar.b;
        this.a = tytVar.a;
        this.e = tytVar.e;
        this.c = new HashMap(tytVar.c);
        this.d = new ArrayList(tytVar.d);
    }
}
