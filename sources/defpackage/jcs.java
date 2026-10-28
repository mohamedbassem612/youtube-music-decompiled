package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jcs {
    public final View a;
    public final ViewGroup b;
    public final FrameLayout c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final ImageView g;
    public final ImageView h;
    public final ViewGroup i;
    public final LinearLayout j;
    public final FrameLayout k;
    public final FrameLayout l;
    public final TextView m;
    public final TextView n;
    private final TextView o;

    public jcs(View view, ViewGroup viewGroup, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ViewGroup viewGroup2, LinearLayout linearLayout2, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView4, TextView textView5) {
        this.a = view;
        this.b = viewGroup;
        this.c = frameLayout;
        this.d = textView;
        this.o = textView2;
        this.e = textView3;
        this.f = linearLayout;
        this.g = imageView;
        this.h = imageView2;
        this.i = viewGroup2;
        this.j = linearLayout2;
        this.k = frameLayout2;
        this.l = frameLayout3;
        this.m = textView4;
        this.n = textView5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jcs) {
            jcs jcsVar = (jcs) obj;
            if (this.a.equals(jcsVar.a) && this.b.equals(jcsVar.b) && this.c.equals(jcsVar.c) && this.d.equals(jcsVar.d) && this.o.equals(jcsVar.o) && this.e.equals(jcsVar.e) && this.f.equals(jcsVar.f) && this.g.equals(jcsVar.g) && this.h.equals(jcsVar.h) && this.i.equals(jcsVar.i) && this.j.equals(jcsVar.j) && this.k.equals(jcsVar.k) && this.l.equals(jcsVar.l) && this.m.equals(jcsVar.m) && this.n.equals(jcsVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        TextView textView = this.n;
        TextView textView2 = this.m;
        FrameLayout frameLayout = this.l;
        FrameLayout frameLayout2 = this.k;
        LinearLayout linearLayout = this.j;
        ViewGroup viewGroup = this.i;
        ImageView imageView = this.h;
        ImageView imageView2 = this.g;
        LinearLayout linearLayout2 = this.f;
        TextView textView3 = this.e;
        TextView textView4 = this.o;
        TextView textView5 = this.d;
        FrameLayout frameLayout3 = this.c;
        ViewGroup viewGroup2 = this.b;
        return "MusicCardContainerViews{musicCardContainer=" + String.valueOf(this.a) + ", thumbnailParent=" + String.valueOf(viewGroup2) + ", thumbnailOverlayParent=" + String.valueOf(frameLayout3) + ", title=" + String.valueOf(textView5) + ", index=" + String.valueOf(textView4) + ", subtitle=" + String.valueOf(textView3) + ", subtitleBadgesContainer=" + String.valueOf(linearLayout2) + ", endIcon=" + String.valueOf(imageView2) + ", contextMenuIcon=" + String.valueOf(imageView) + ", customIndexColumnContainer=" + String.valueOf(viewGroup) + ", entityButtonsContainer=" + String.valueOf(linearLayout) + ", firstEntityButtonContainer=" + String.valueOf(frameLayout2) + ", secondEntityButtonContainer=" + String.valueOf(frameLayout) + ", firstEntityButton=" + String.valueOf(textView2) + ", secondEntityButton=" + String.valueOf(textView) + '}';
    }

    public jcs() {
        throw null;
    }
}
