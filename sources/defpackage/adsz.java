package defpackage;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adsz {
    public final TextView a;
    public final TextView b;
    public final View c;
    public final int d;
    public final int e;
    public final int f;

    public adsz(TextView textView, TextView textView2, View view, int i, int i2, int i3) {
        this.a = textView;
        this.b = textView2;
        this.c = view;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final void a(ajkx ajkxVar) {
        TextView textView = this.a;
        if (textView != null) {
            int i = this.d;
            if (ajkxVar == null || (ajkxVar.b & 2) == 0) {
                textView.setTextColor(i);
            } else {
                textView.setTextColor(ajkxVar.d);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            int i2 = this.e;
            if (ajkxVar == null || (ajkxVar.b & 4) == 0) {
                textView2.setTextColor(i2);
            } else {
                textView2.setTextColor(ajkxVar.e);
            }
            int i3 = this.f;
            if (ajkxVar != null && (ajkxVar.b & 8) != 0) {
                i3 = ajkxVar.f;
            }
            textView2.setLinkTextColor(i3);
        }
        View view = this.c;
        if (view != null) {
            int i4 = 0;
            if (ajkxVar != null && (ajkxVar.b & 1) != 0) {
                i4 = ajkxVar.c;
            }
            view.setBackgroundColor(i4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adsz) {
            adsz adszVar = (adsz) obj;
            TextView textView = this.a;
            if (textView != null ? textView.equals(adszVar.a) : adszVar.a == null) {
                TextView textView2 = this.b;
                if (textView2 != null ? textView2.equals(adszVar.b) : adszVar.b == null) {
                    View view = this.c;
                    if (view != null ? view.equals(adszVar.c) : adszVar.c == null) {
                        if (this.d == adszVar.d && this.e == adszVar.e && this.f == adszVar.f) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        TextView textView = this.a;
        int iHashCode = textView == null ? 0 : textView.hashCode();
        TextView textView2 = this.b;
        int iHashCode2 = textView2 == null ? 0 : textView2.hashCode();
        int i = iHashCode ^ 1000003;
        View view = this.c;
        return ((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (view != null ? view.hashCode() : 0)) * (-721379959)) ^ this.d) * (-721379959)) ^ this.e) * (-721379959)) ^ this.f) * 1000003;
    }

    public final String toString() {
        View view = this.c;
        TextView textView = this.b;
        return "BasicColorPaletteDecorator{title=" + String.valueOf(this.a) + ", body=" + String.valueOf(textView) + ", background=" + String.valueOf(view) + ", fallbackBackgroundColor=0, fallbackTitleColor=" + this.d + ", fallbackTitleColorList=null, fallbackBodyColor=" + this.e + ", fallbackBodyColorList=null, fallbackLinkColor=" + this.f + ", fallbackLinkColorList=null}";
    }

    public adsz() {
        throw null;
    }
}
