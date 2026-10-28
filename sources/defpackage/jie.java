package defpackage;

import com.google.android.apps.youtube.music.ui.text.MusicAutoResizeTextView;
import com.google.android.apps.youtube.music.ui.text.ThreeLevelAutoResizeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jie implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jie(Object obj, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, tbj] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                MusicAutoResizeTextView musicAutoResizeTextView = (MusicAutoResizeTextView) this.c;
                musicAutoResizeTextView.a(((this.a - this.b) - musicAutoResizeTextView.getPaddingLeft()) - musicAutoResizeTextView.getPaddingRight());
                break;
            case 1:
                this.c.jU(this.a, this.b);
                break;
            case 2:
                ThreeLevelAutoResizeTextView threeLevelAutoResizeTextView = (ThreeLevelAutoResizeTextView) this.c;
                threeLevelAutoResizeTextView.a(((this.a - this.b) - threeLevelAutoResizeTextView.getPaddingLeft()) - threeLevelAutoResizeTextView.getPaddingRight());
                break;
            case 3:
                jqo jqoVar = (jqo) this.c;
                jqv jqvVar = jqoVar.f;
                int i = this.b;
                int i2 = this.a;
                jqvVar.j(i2, i);
                jqoVar.m.j(i2, i);
                break;
            case 4:
                jqo jqoVar2 = (jqo) this.c;
                jqv jqvVar2 = jqoVar2.f;
                int i3 = jqvVar2.l;
                int i4 = this.b;
                jqvVar2.l = i3 - i4;
                int i5 = this.a;
                jqvVar2.m(i5, i4);
                jqr jqrVar = jqoVar2.m;
                jqrVar.m -= i4;
                jqrVar.m(i5, i4);
                break;
            case 5:
                ((jqo) this.c).i(this.a, this.b);
                break;
            case 6:
                jqo jqoVar3 = (jqo) this.c;
                jqv jqvVar3 = jqoVar3.f;
                int i6 = jqvVar3.l;
                int i7 = this.b;
                jqvVar3.l = i6 + i7;
                int i8 = this.a;
                jqvVar3.l(i8, i7);
                jqr jqrVar2 = jqoVar3.m;
                jqrVar2.m += i7;
                jqrVar2.l(i8, i7);
                break;
            default:
                int i9 = this.b;
                int i10 = this.a;
                jqo jqoVar4 = (jqo) this.c;
                jqv jqvVar4 = jqoVar4.f;
                if (i9 < i10) {
                    jqvVar4.j(i9, (i10 - i9) + 1);
                } else {
                    jqvVar4.j(i10, (i9 - i10) + 1);
                }
                jqr jqrVar3 = jqoVar4.m;
                if (i9 >= i10) {
                    jqrVar3.j(i10, (i9 - i10) + 1);
                } else {
                    jqrVar3.j(i9, (i10 - i9) + 1);
                }
                break;
        }
    }
}
