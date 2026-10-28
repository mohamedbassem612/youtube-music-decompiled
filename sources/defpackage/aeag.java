package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeag extends nh {
    public aeaj a;
    public List e;
    private final adhv f;
    private final aeiv g;

    public aeag(adhv adhvVar, aeiv aeivVar) {
        this.g = aeivVar;
        this.f = adhvVar;
    }

    @Override // defpackage.nh
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new aeaf(new aeae(this.a), LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emoji_holder, viewGroup, false), this.g);
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void o(oh ohVar, int i) {
        aeaf aeafVar = (aeaf) ohVar;
        if (this.e.size() > i) {
            int i2 = aeaf.v;
            ImageView imageView = aeafVar.s;
            this.f.h(imageView, this.g.e((String) this.e.get(i)));
            String str = (String) this.e.get(i);
            aeafVar.t.a = str;
            imageView.setContentDescription(aeafVar.u.f(str));
        }
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void s(oh ohVar) {
        int i = aeaf.v;
        ImageView imageView = ((aeaf) ohVar).s;
        if (imageView != null) {
            this.f.f(imageView);
        }
    }
}
