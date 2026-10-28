package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejg implements Comparable {
    public final int a;
    public final int[] b;
    public final agev c;
    public final int d;
    private final String e;
    private final String f;

    static {
        agkz.t(786, 787, 788, 789, 790);
        Pattern.compile("&nbsp;", 16);
        Pattern.compile("<[^>]*>");
    }

    public aejg(String str, int i) {
        str.getClass();
        this.f = str;
        this.a = i;
        this.d = 2;
        this.b = new int[0];
        this.e = i == 33 ? "… null" : str;
        agke agkeVar = agpi.a;
        this.c = agdf.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aejg) {
            aejg aejgVar = (aejg) obj;
            if (this.a == aejgVar.a) {
                return TextUtils.equals(this.e, aejgVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.e;
    }
}
